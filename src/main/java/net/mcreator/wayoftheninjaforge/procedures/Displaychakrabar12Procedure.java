package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

public class Displaychakrabar12Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		double chakraPercent = 0;
		chakraPercent = ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
				? _livingEntity0.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
				: 0) / (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit) * 100;
		if (chakraPercent > 68.75) {
			if (chakraPercent <= 75) {
				return true;
			}
		}
		return false;
	}
}
