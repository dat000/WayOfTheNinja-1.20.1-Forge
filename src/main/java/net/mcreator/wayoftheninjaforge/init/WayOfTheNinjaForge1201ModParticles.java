
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.wayoftheninjaforge.client.particle.ChakraparticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WayOfTheNinjaForge1201ModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(WayOfTheNinjaForge1201ModParticleTypes.CHAKRAPARTICLE.get(), ChakraparticleParticle::provider);
	}
}
