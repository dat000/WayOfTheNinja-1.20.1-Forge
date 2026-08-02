package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ChakralimitsetProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = DoubleArgumentType.getDouble(arguments, "number");
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.chakra_limit = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal(("Chakra limit set to = "
							+ new java.text.DecimalFormat("##.##").format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit))),
							false);
	}
}
