package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.AmeOperativesEntity;

public class AmeOperativesDisplayCondition2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof AmeOperativesEntity _datEntI ? _datEntI.getEntityData().get(AmeOperativesEntity.DATA_skin_type) : 0) == 2) {
			return true;
		}
		return false;
	}
}
