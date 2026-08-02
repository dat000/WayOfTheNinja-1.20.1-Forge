package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

public class ReturnjutsuspecProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).jutsu_spec == 0) {
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.genjutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.taijutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ninjutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return "Ninjutsu";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).jutsu_spec == 1) {
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.taijutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ninjutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.genjutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return "Genjutsu";
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).jutsu_spec == 2) {
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ninjutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = false;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.genjutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.taijutsu_spec_selected = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			return "Taijutsu";
		}
		return "none";
	}
}
