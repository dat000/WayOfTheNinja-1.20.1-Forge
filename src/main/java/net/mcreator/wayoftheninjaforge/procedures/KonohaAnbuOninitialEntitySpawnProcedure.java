package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.wayoftheninjaforge.entity.KonohaAnbuEntity;

public class KonohaAnbuOninitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof KonohaAnbuEntity _datEntSetI)
			_datEntSetI.getEntityData().set(KonohaAnbuEntity.DATA_skin_type, Mth.nextInt(RandomSource.create(), 1, 3));
	}
}
