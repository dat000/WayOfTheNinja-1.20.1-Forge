package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ChakraaddProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())) {
			if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
				_livingEntity3.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
						.setBaseValue((DoubleArgumentType.getDouble(arguments, "number") + (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
								? _livingEntity2.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getValue()
								: 0)));
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(Component.literal(("Chakra has been added, new attribute value ="
								+ (new java.text.DecimalFormat("##.##").format(entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
										? _livingEntity4.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
										: 0)))),
								false);
		}
	}
}
