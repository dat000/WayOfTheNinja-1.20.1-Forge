package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.world.inventory.GuiMenu;
import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CharnotcreatedwarningProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static boolean execute(LevelAccessor world, Entity entity) {
		return execute(null, world, entity);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof GuiMenu) {
			return false;
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_has_been_created == false) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Warning - \u00A7cCharacter has not been created! press the \u00A7f\"J\" key \u00A7cto resume."), false);
		}
		return false;
	}
}
