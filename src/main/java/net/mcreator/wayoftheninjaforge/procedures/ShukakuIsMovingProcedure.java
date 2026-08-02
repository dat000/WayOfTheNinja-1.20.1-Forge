package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

public class ShukakuIsMovingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().x() != entity.getX()) {
			return true;
		}
		return false;
	}
}
