package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

public class ChakraresetProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
				_livingEntity1.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).setBaseValue(0);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(Component.literal(((("Chakra has been reset for player: " + entity) + "" + ("\n" + "Chakra Attribute value = ")) + ""
								+ (((new java.text.DecimalFormat("##.##").format(entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
										? _livingEntity2.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
										: 0)) + "\n") + "---"))),
								false);
		}
	}
}
