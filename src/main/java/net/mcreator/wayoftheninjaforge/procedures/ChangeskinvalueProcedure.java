package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ChangeskinvalueProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = DoubleArgumentType.getDouble(arguments, "name");
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.character_skin_type = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
