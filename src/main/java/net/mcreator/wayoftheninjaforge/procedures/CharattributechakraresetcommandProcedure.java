package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class CharattributechakraresetcommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		if ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "player_name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()) instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
			_livingEntity1.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).setBaseValue(0);
	}
}
