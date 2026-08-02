package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class Talent151selectedProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("jutsu seleccionado: 15 - 1"), false);
	}
}
