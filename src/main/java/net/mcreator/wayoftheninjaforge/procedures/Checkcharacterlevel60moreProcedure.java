package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class Checkcharacterlevel60moreProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).level >= 60) {
			return true;
		}
		return false;
	}
}
