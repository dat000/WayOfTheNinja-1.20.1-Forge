package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IntellectAttributeEffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get())
				? _livingEntity0.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get()).getBaseValue()
				: 0) > 0) {
			entity.setCustomName(Component.literal("Intellect has no function"));
		} else if ((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get())
				? _livingEntity2.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get()).getBaseValue()
				: 0) == 0) {
			entity.setCustomName(Component.literal("null"));
		}
	}
}
