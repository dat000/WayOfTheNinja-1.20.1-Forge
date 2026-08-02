package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.wayoftheninjaforge.entity.KonohaninjaEntity;

public class KonohaninjaOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof KonohaninjaEntity _datEntSetI)
			_datEntSetI.getEntityData().set(KonohaninjaEntity.DATA_ninja_skin, Mth.nextInt(RandomSource.create(), 1, 10));
	}
}
