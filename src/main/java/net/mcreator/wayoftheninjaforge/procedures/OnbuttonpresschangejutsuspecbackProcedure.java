package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class OnbuttonpresschangejutsuspecbackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).jutsu_spec < 2) {
			{
				double _setval = (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_body_type + 1;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jutsu_spec = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(Component.literal(("jutsu_spec value ="
								+ new java.text.DecimalFormat("##.##").format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).jutsu_spec))),
								false);
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jutsu_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).jutsu_spec >= 2) {
			{
				double _setval = 0;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jutsu_spec = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(Component.literal(("jutsu_spec value ="
								+ new java.text.DecimalFormat("##.##").format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).jutsu_spec))),
								false);
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jutsu_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
