package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.KazekagesShadowEntity;

public class KazekagesShadowDisplayCondition3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof KazekagesShadowEntity _datEntI ? _datEntI.getEntityData().get(KazekagesShadowEntity.DATA_skin_type) : 0) == 3) {
			return true;
		}
		return false;
	}
}
