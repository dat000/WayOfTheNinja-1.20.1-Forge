package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class CharattributeexplimitResetcommandProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.experience_points_LIMIT = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Chacter Limit Experience has been reset. New Value = " + new java.text.DecimalFormat("##.##")
					.format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experience_points_LIMIT))), false);
	}
}
