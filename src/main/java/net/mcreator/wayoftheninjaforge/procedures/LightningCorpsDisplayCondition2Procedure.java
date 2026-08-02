package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.LightningCorpsEntity;

public class LightningCorpsDisplayCondition2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LightningCorpsEntity _datEntI ? _datEntI.getEntityData().get(LightningCorpsEntity.DATA_skin_type) : 0) == 2) {
			return true;
		}
		return false;
	}
}
