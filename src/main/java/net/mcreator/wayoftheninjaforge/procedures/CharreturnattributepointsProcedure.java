package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class CharreturnattributepointsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Attribute points: \u00A7a"
				+ new java.text.DecimalFormat("##.##").format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).talents_points);
	}
}
