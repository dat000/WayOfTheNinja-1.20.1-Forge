package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

public class FoodchakrafullProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
			_livingEntity0.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
					.setBaseValue(((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit));
	}
}
