package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class ButtoneyestypenextProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_type < WayOfTheNinjaForge1201ModVariables.MapVariables
				.get(world).character_eyes_type_limit) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_type >= 1) {
				{
					double _setval = (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_type + 1;
					entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.character_eyes_type = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("eyes type changed"), false);
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("eyes_type is not more or equal than 1"), false);
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(
						Component.literal(("eyes_type is not minor than eyes_type_limit variable " + new java.text.DecimalFormat("##.##").format(WayOfTheNinjaForge1201ModVariables.MapVariables.get(world).character_eyes_type_limit))), false);
		}
	}
}
