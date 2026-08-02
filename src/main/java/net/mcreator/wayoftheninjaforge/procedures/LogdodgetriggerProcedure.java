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

		WayOfTheNinjaForge1201ModVariables.PlayerVariables playerVariables = entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables());

		// Verificar si el cooldown está activo
		if (playerVariables.dodge_cd) {
			if (entity instanceof Player _player && !_player.level().isClientSide()) {
				_player.displayClientMessage(Component.literal("§cDodge in cooldown! Wait " + (playerVariables.dodge_cd_duration - playerVariables.dodge_cd_ticks) / 20 + " more seconds"), true);
			}
			return;
		}

		// Verificar chakra disponible
		double chakraValue = (entity instanceof LivingEntity _livingEntity && _livingEntity.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
				? _livingEntity.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
				: 0);

		if (chakraValue <= 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("§cNot enough Chakra"), true);
			return;
		}

		// Ejecutar el dodge
		// Restar chakra
		if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())) {
			_livingEntity5.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
					.setBaseValue(chakraValue - 10);
		}

		// Reproducir sonido
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.big_dripleaf.place")), SoundSource.NEUTRAL, 1.0F, 1.0F);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.big_dripleaf.place")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
			}
		}

		// Spawnar el tronco (Log entity)
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = WayOfTheNinjaForge1201ModEntities.LOG.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}

		// Empujar al jugador en la dirección opuesta
		entity.push((entity.getLookAngle().x * (-1.5)), (entity.getLookAngle().y * 0.2), (entity.getLookAngle().z * (-1.5)));

		// Activar cooldown
		entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
			capability.dodge_cd = true;
			capability.dodge_cd_ticks = 0;
			capability.syncPlayerVariables(entity);
		});

		if (entity instanceof Player _player && !_player.level().isClientSide()) {
			_player.displayClientMessage(Component.literal("§a✓ Dodge activated!"), true);
		}
	}
}
