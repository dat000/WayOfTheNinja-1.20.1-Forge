package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class GetCharExpCommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(
					Component
							.literal(
									("\u00A7aCharacter experience = \u00A7f" + (new java.text.DecimalFormat("##.##")
											.format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experiencie_points)
											+ ""
											+ ("/" + new java.text.DecimalFormat("##.##")
													.format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).experience_points_LIMIT))))),
					false);
	}
}
