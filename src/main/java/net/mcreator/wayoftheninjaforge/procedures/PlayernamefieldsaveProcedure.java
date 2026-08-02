package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;

import net.mcreator.wayoftheninjaforge.world.inventory.GuiMenu;
import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import java.util.HashMap;

public class PlayernamefieldsaveProcedure {
	public static boolean execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return false;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof GuiMenu) {
			if (guistate.containsKey("checkbox:player_namefield_check") && ((Checkbox) guistate.get("checkbox:player_namefield_check")).selected()) {
				if ((guistate.containsKey("text:player_namefield") ? ((EditBox) guistate.get("text:player_namefield")).getValue() : "").isEmpty()) {
					{
						boolean _setval = false;
						entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.character_has_been_created = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					return false;
				} else {
					{
						String _setval = guistate.containsKey("text:player_namefield") ? ((EditBox) guistate.get("text:player_namefield")).getValue() : "";
						entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.characterName = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.page1_completed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.character_has_been_created = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					return true;
				}
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("check: NO"), false);
			}
		}
		return false;
	}
}
