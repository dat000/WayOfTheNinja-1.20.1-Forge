
package net.mcreator.wayoftheninjaforge.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class Musicdisk1Item extends RecordItem {
	public Musicdisk1Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("way_of_the_ninja_forge_1_20_1:shadow_of_the_blocked_leaf")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 2000);
	}
}
