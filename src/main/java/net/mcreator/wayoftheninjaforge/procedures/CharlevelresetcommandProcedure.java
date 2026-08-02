package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class CharlevelresetcommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		{
			double _setval = 0;
			(new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "player_name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.level = _setval;
				capability.syncPlayerVariables((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player_name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()));
			});
		}
	}
}
