
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

public class WayOfTheNinjaForge1201ModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, WayOfTheNinjaForge1201Mod.MODID);
	public static final RegistryObject<SimpleParticleType> CHAKRAPARTICLE = REGISTRY.register("chakraparticle", () -> new SimpleParticleType(true));
}
