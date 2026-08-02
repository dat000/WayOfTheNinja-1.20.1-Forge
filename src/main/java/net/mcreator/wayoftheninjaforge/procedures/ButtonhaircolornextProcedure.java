package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class ButtonhaircolornextProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color < WayOfTheNinjaForge1201ModVariables.MapVariables
				.get(world).character_hair_color_limit) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color >= 1) {
				{
					double _setval = (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color + 1;
					entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.character_hair_color = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("hair color changed"), false);
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("hair color is not more or equal than 1"), false);
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(
						Component.literal(("hair color is not minor than hair_color_limit variable " + new java.text.DecimalFormat("##.##").format(WayOfTheNinjaForge1201ModVariables.MapVariables.get(world).character_hair_color_limit))), false);
		}
	}
}
