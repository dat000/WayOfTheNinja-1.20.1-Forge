package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModEntities;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

public class LogdodgetriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).dodge_cd == true) {
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.can_use_jutsu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(
						Component.literal(("logDodgeValue = " + (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).dodge_cd)), false);
		} else {
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.can_use_jutsu = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(
						Component.literal(("logDodgeValue = " + (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).dodge_cd)), false);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.big_dripleaf.place")), SoundSource.NEUTRAL, 2, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.big_dripleaf.place")), SoundSource.NEUTRAL, 2, 2, false);
				}
			}
			if ((entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
					? _livingEntity3.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
					: 0) > 0) {
				if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
					_livingEntity5.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
							.setBaseValue(((entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
									? _livingEntity4.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
									: 0) - 10));
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = WayOfTheNinjaForge1201ModEntities.LOG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				entity.push((entity.getLookAngle().x * (-1.5)), (entity.getLookAngle().y * 0.2), (entity.getLookAngle().z * (-1.5)));
				{
					boolean _setval = true;
					entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dodge_cd = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7cNot enough Chakra"), true);
			}
		}
	}
}
