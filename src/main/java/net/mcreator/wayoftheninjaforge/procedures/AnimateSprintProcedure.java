package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;

import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Iterator;

import dev.kosmx.playerAnim.api.AnimUtils;

@Mod.EventBusSubscriber
public class AnimateSprintProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isSprinting()) {
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "animation.model.run", true);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
					synchronized (connections) {
						Iterator<Connection> iterator = connections.iterator();
						while (iterator.hasNext()) {
							Connection connection = iterator.next();
							if (!connection.isConnecting() && connection.isConnected())
								WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.WayOfTheNinjaForge1201ModAnimationMessage(Component.literal("animation.model.run"), entity.getId(), true), connection,
										NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
			AnimUtils.disableFirstPersonAnim = true;
		} else {
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "animation.model.stop", true);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
					synchronized (connections) {
						Iterator<Connection> iterator = connections.iterator();
						while (iterator.hasNext()) {
							Connection connection = iterator.next();
							if (!connection.isConnecting() && connection.isConnected())
								WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.WayOfTheNinjaForge1201ModAnimationMessage(Component.literal("animation.model.stop"), entity.getId(), true), connection,
										NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
			AnimUtils.disableFirstPersonAnim = true;
		}
	}
}
