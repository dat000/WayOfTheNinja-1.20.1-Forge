package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

public class ReturnCharAttributeChakraProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Chakra: " + (new java.text.DecimalFormat("##.##").format(entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONCHAKRA.get())
				? _livingEntity0.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONCHAKRA.get()).getBaseValue()
				: 0));
	}
}
