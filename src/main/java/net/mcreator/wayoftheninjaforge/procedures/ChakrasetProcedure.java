package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ChakrasetProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())) {
			if ((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
				_livingEntity3.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).setBaseValue((DoubleArgumentType.getDouble(arguments, "number")));
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A7aCharacter chakra has been changed to \u00A7f" + (new java.text.DecimalFormat("##.##").format((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()) instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
						? _livingEntity5.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
						: 0)))), false);
		}
	}
}
