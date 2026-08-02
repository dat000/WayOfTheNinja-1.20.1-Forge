package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

public class ShukakuPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isInWaterRainOrBubble()) {
			return true;
		}
		return false;
	}
}
