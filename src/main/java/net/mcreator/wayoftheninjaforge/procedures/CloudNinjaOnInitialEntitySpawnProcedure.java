package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.wayoftheninjaforge.entity.CloudNinjaEntity;

public class CloudNinjaOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof CloudNinjaEntity _datEntSetI)
			_datEntSetI.getEntityData().set(CloudNinjaEntity.DATA_skin_type, Mth.nextInt(RandomSource.create(), 1, 10));
	}
}
