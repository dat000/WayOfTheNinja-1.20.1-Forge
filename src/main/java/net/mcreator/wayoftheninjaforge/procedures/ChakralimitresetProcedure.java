package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class ChakralimitresetProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 10;
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.chakra_limit = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal(("Chakra has been reset to default value. = "
							+ new java.text.DecimalFormat("##.##").format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit))),
							false);
	}
}
