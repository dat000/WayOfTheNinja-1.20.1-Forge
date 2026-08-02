package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.SunaNinjaEntity;

public class SunaNinjaDisplayCondition10Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof SunaNinjaEntity _datEntI ? _datEntI.getEntityData().get(SunaNinjaEntity.DATA_skin_type) : 0) == 10) {
			return true;
		}
		return false;
	}
}
