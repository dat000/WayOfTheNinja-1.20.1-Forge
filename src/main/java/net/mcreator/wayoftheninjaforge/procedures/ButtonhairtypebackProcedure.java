package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class ButtonhairtypebackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.character_has_been_created = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type > 1) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type <= WayOfTheNinjaForge1201ModVariables.MapVariables
					.get(world).character_hair_type_limit) {
				{
					double _setval = (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type - 1;
					entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.character_hair_type = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("hair changed"), false);
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal(("hair_type is not minor or equal than hair_type_limit variable " + new java.text.DecimalFormat("##.##").format(WayOfTheNinjaForge1201ModVariables.MapVariables.get(world).character_hair_type_limit))),
							false);
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("hair_type is not more than 1"), false);
		}
	}
}
