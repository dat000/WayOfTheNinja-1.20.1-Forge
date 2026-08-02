package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class FirebalprojectilewhileflyingtickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 2, 2, 2, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, 2, 2, 2, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ASH, x, y, z, 5, 2, 2, 2, 1);
	}
}
