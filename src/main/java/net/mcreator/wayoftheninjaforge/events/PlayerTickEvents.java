package net.mcreator.wayoftheninjaforge.events;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

@Mod.EventBusSubscriber(modid = "way_of_the_ninja_forge_1_20_1")
public class PlayerTickEvents {

	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		Entity entity = event.player;
		if (entity == null || entity.level().isClientSide())
			return;

		WayOfTheNinjaForge1201ModVariables.PlayerVariables playerVariables = entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables());

		// Manejar cooldown del dodge
		if (playerVariables.dodge_cd) {
			playerVariables.dodge_cd_ticks++;

			// Si el cooldown ha terminado
			if (playerVariables.dodge_cd_ticks >= playerVariables.dodge_cd_duration) {
				playerVariables.dodge_cd = false;
				playerVariables.dodge_cd_ticks = 0;
				playerVariables.syncPlayerVariables(entity);
			} else {
				// Actualizar el estado periodicamente
				if (playerVariables.dodge_cd_ticks % 20 == 0) { // Cada segundo
					playerVariables.syncPlayerVariables(entity);
				}
			}
		}
	}
}
