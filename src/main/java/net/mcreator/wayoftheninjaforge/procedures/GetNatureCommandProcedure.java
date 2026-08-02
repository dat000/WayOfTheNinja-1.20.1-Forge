package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class GetNatureCommandProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\u00BF?")), false);
			return "\u00BF?";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 1) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\uD83D\uDD25 Fire")), false);
			return "\uD83D\uDD25 Fire";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 2) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\uD83D\uDCA7 Water")), false);
			return "\uD83D\uDCA7 Water";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 3) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\uD83C\uDF2C\uFE0FWind")), false);
			return "\uD83C\uDF2C\uFE0FWind";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 4) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "Earth")), false);
			return "Earth";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 5) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\u26A1 Lightning")), false);
			return "\u26A1 Lightning";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 6) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\uD83C\uDF2A\uFE0F Yang")), false);
			return "\uD83C\uDF2A\uFE0F Yang";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 7) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\uD83C\uDF11 Yin")), false);
			return "\uD83C\uDF11 Yin";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 8) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "Boil")), false);
			return "Boil";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 9) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\uD83C\uDF0B Lava")), false);
			return "\uD83C\uDF0B Lava";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).nature == 10) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7aCharacter nature = \u00A7f" + "\u2744\uFE0F Ice")), false);
			return "\u2744\uFE0F Ice";
		}
		return "\u00BF?";
	}
}
