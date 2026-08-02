package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FortitudeAttributeEffectProcedure {
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
		if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get())
				? _livingEntity0.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get()).getBaseValue()
				: 0) > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 20,
						(int) (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get())
								? _livingEntity1.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get()).getBaseValue()
								: 0),
						false, false));
		} else if ((entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get())
				? _livingEntity3.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get()).getBaseValue()
				: 0) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HEALTH_BOOST);
		}
	}
}
