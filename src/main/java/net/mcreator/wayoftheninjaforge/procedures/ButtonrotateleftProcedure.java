package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class ButtonrotateleftProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("rotate left executed();"), false);
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).left_view_character) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("cannot go under this value"), false);
			return "break";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).front_view_character) {
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.front_view_character = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.half_left_view_character = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("rotated to front to half left"), false);
			return "break";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).half_left_view_character) {
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.half_left_view_character = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.left_view_character = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("rotated to half left to left"), false);
			return "break";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).half_right_view_character) {
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.half_right_view_character = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.front_view_character = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("rotated to half right to front"), false);
			return "break";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).right_view_character) {
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.right_view_character = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.half_right_view_character = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("rotated to right to half right"), false);
			return "break";
		}
		return "null";
	}
}
