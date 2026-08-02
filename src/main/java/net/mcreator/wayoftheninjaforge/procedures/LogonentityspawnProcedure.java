package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

public class LogonentityspawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 25, 2, 3, 2, 1);
		WayOfTheNinjaForge1201Mod.queueServerWork(60, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
