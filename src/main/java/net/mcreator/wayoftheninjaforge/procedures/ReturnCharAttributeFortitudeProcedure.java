package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

public class ReturnCharAttributeFortitudeProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Fortitude: " + (new java.text.DecimalFormat("##.##").format(entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get())
				? _livingEntity0.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get()).getBaseValue()
				: 0));
	}
}
