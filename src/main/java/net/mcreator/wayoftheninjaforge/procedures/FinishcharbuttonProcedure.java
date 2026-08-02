package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class FinishcharbuttonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.character_has_been_created = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 10;
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.chakra_limit = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
