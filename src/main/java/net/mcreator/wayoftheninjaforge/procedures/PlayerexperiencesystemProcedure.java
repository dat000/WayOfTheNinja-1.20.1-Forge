package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerexperiencesystemProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experiencie_points > (entity
				.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experience_points_LIMIT) {
			{
				double _setval = (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experience_points_LIMIT;
				sourceentity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.experiencie_points = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.tuff.hit")), SoundSource.NEUTRAL, 1, (float) 0.1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.tuff.hit")), SoundSource.NEUTRAL, 1, (float) 0.1, false);
				}
			}
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(" \u00A74you should go rest"), true);
		} else if ((sourceentity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experiencie_points < (entity
				.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experience_points_LIMIT) {
			if (entity instanceof Player) {
				{
					double _setval = (sourceentity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experiencie_points + 2;
					sourceentity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.experiencie_points = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.step")), SoundSource.NEUTRAL, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.step")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
					}
				}
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(" \u00A76+2 Exp"), true);
			} else {
				{
					double _setval = (sourceentity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experiencie_points + 1;
					sourceentity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.experiencie_points = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.step")), SoundSource.NEUTRAL, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.step")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
					}
				}
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(" \u00A76+1 Exp"), true);
			}
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.tuff.hit")), SoundSource.NEUTRAL, 1, (float) 0.1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.tuff.hit")), SoundSource.NEUTRAL, 1, (float) 0.1, false);
				}
			}
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(" \u00A74you should go rest"), true);
		}
	}
}
