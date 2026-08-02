package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.RainNinjaEntity;

public class RainNinjaDisplayCondition9Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof RainNinjaEntity _datEntI ? _datEntI.getEntityData().get(RainNinjaEntity.DATA_skin_type) : 0) == 9) {
			return true;
		}
		return false;
	}
}
