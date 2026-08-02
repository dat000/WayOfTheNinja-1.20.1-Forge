
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;

import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WayOfTheNinjaForge1201ModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, WayOfTheNinjaForge1201Mod.MODID);
	public static final RegistryObject<Attribute> TAIJUTSU = REGISTRY.register("taijutsu", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.taijutsu", 0, 0, 1).setSyncable(true));
	public static final RegistryObject<Attribute> GENJUTSU = REGISTRY.register("genjutsu", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.genjutsu", 0, 0, 1).setSyncable(true));
	public static final RegistryObject<Attribute> NINJUTSU = REGISTRY.register("ninjutsu", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.ninjutsu", 0, 0, 1).setSyncable(true));
	public static final RegistryObject<Attribute> CHAKRA_ATTRIBUTE = REGISTRY.register("chakra_attribute", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.chakra_attribute", 1, 0, 10000000).setSyncable(true));
	public static final RegistryObject<Attribute> WONSTRENGTH = REGISTRY.register("wonstrength", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.wonstrength", 0, 0, 100).setSyncable(true));
	public static final RegistryObject<Attribute> WONFORTITUDE = REGISTRY.register("wonfortitude", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.wonfortitude", 0, 0, 100).setSyncable(true));
	public static final RegistryObject<Attribute> WONINTELLECT = REGISTRY.register("wonintellect", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.wonintellect", 0, 0, 100).setSyncable(true));
	public static final RegistryObject<Attribute> WONAGILITY = REGISTRY.register("wonagility", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.wonagility", 0, 0, 100).setSyncable(true));
	public static final RegistryObject<Attribute> WONCHAKRA = REGISTRY.register("wonchakra", () -> new RangedAttribute("attribute.way_of_the_ninja_forge_1_20_1.wonchakra", 0, 0, 100).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, TAIJUTSU.get());
		event.add(EntityType.PLAYER, GENJUTSU.get());
		event.add(EntityType.PLAYER, NINJUTSU.get());
		event.add(EntityType.PLAYER, CHAKRA_ATTRIBUTE.get());
		event.add(EntityType.PLAYER, WONSTRENGTH.get());
		event.add(EntityType.PLAYER, WONFORTITUDE.get());
		event.add(EntityType.PLAYER, WONINTELLECT.get());
		event.add(EntityType.PLAYER, WONAGILITY.get());
		event.add(EntityType.PLAYER, WONCHAKRA.get());
	}

	@Mod.EventBusSubscriber
	public static class PlayerAttributesSync {
		@SubscribeEvent
		public static void playerClone(PlayerEvent.Clone event) {
			Player oldPlayer = event.getOriginal();
			Player newPlayer = event.getEntity();
			newPlayer.getAttribute(TAIJUTSU.get()).setBaseValue(oldPlayer.getAttribute(TAIJUTSU.get()).getBaseValue());
			newPlayer.getAttribute(GENJUTSU.get()).setBaseValue(oldPlayer.getAttribute(GENJUTSU.get()).getBaseValue());
			newPlayer.getAttribute(NINJUTSU.get()).setBaseValue(oldPlayer.getAttribute(NINJUTSU.get()).getBaseValue());
			newPlayer.getAttribute(CHAKRA_ATTRIBUTE.get()).setBaseValue(oldPlayer.getAttribute(CHAKRA_ATTRIBUTE.get()).getBaseValue());
			newPlayer.getAttribute(WONSTRENGTH.get()).setBaseValue(oldPlayer.getAttribute(WONSTRENGTH.get()).getBaseValue());
			newPlayer.getAttribute(WONFORTITUDE.get()).setBaseValue(oldPlayer.getAttribute(WONFORTITUDE.get()).getBaseValue());
			newPlayer.getAttribute(WONINTELLECT.get()).setBaseValue(oldPlayer.getAttribute(WONINTELLECT.get()).getBaseValue());
			newPlayer.getAttribute(WONAGILITY.get()).setBaseValue(oldPlayer.getAttribute(WONAGILITY.get()).getBaseValue());
			newPlayer.getAttribute(WONCHAKRA.get()).setBaseValue(oldPlayer.getAttribute(WONCHAKRA.get()).getBaseValue());
		}
	}
}
