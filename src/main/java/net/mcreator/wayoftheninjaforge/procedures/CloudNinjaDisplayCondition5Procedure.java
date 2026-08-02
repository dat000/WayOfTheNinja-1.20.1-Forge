package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.CloudNinjaEntity;

public class CloudNinjaDisplayCondition5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof CloudNinjaEntity _datEntI ? _datEntI.getEntityData().get(CloudNinjaEntity.DATA_skin_type) : 0) == 5) {
			return true;
		}
		return false;
	}
}
