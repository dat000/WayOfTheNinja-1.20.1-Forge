package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.KonohaninjaEntity;

public class KonohaninjaDisplayCondition9Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof KonohaninjaEntity _datEntI ? _datEntI.getEntityData().get(KonohaninjaEntity.DATA_ninja_skin) : 0) == 9) {
			return true;
		}
		return false;
	}
}
