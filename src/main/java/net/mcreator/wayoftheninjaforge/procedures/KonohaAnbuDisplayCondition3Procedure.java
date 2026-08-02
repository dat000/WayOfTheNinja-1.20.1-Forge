package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.KonohaAnbuEntity;

public class KonohaAnbuDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof KonohaAnbuEntity _datEntI ? _datEntI.getEntityData().get(KonohaAnbuEntity.DATA_skin_type) : 0) == 3) {
			return true;
		}
		return false;
	}
}
