package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class ReturnnaturenameProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 0) {
			return " ";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 1) {
			return "\uD83D\uDD25 Fire";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 2) {
			return "\uD83D\uDCA7 Water";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 3) {
			return "\uD83C\uDF2C\uFE0FWind";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 4) {
			return "Earth";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 5) {
			return "\u26A1 Lightning";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 6) {
			return "\uD83C\uDF2A\uFE0F Yang";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 7) {
			return "\uD83C\uDF11 Yin";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 8) {
			return "Boil";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 9) {
			return "\uD83C\uDF0B Lava";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 10) {
			return "\u2744\uFE0F Ice";
		}
		return "is not 0-10";
	}
}
