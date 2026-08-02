package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class ButtonbodytypebackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_body_type > 0) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_body_type <= 1) {
				{
					double _setval = (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_body_type - 1;
					entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.character_body_type = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("body type changed."), false);
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("body_type is not minor or equal than 1." + new java.text.DecimalFormat("##.##")
							.format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_body_type))), false);
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("body_type is not more than 0."), false);
		}
	}
}
