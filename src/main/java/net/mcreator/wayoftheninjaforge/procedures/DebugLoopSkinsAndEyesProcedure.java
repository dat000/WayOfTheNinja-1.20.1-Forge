package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class DebugLoopSkinsAndEyesProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) DoubleArgumentType.getDouble(arguments, "name"); index0++) {
			{
				double _setval = (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type + 1;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.character_skin_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eye_type + 1;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.character_eye_type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
