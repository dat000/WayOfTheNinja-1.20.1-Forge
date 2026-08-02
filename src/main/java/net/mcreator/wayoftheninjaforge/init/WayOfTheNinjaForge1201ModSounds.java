
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

public class WayOfTheNinjaForge1201ModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WayOfTheNinjaForge1201Mod.MODID);
	public static final RegistryObject<SoundEvent> SHADOW_OF_THE_BLOCKED_LEAF = REGISTRY.register("shadow_of_the_blocked_leaf",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "shadow_of_the_blocked_leaf")));
	public static final RegistryObject<SoundEvent> CHAKRA_SURGE = REGISTRY.register("chakra_surge", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "chakra_surge")));
	public static final RegistryObject<SoundEvent> SHADOWS_OF_KONOHA = REGISTRY.register("shadows_of_konoha", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "shadows_of_konoha")));
}
