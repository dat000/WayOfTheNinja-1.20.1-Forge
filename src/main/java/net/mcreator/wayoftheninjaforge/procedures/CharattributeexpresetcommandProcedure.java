package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class CharattributeexpresetcommandProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
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
				capability.experiencie_points = _setval;
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
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Chacter Experience has been reset. New Value = "
					+ new java.text.DecimalFormat("##.##").format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experiencie_points))),
					false);
	}
}
