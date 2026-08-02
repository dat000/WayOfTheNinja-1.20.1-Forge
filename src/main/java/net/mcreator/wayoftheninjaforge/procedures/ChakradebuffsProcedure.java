package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChakradebuffsProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double ChakraPercentage = 0;
		ChakraPercentage = (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
				? _livingEntity0.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
				: 0) * 100 + (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit;
		if (ChakraPercentage <= 5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 20, 1, false, false));
		}
	}
}
