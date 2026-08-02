package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class GeneratenaturesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = Mth.nextInt(RandomSource.create(), 1, 10);
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.nature = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
