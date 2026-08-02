
package net.mcreator.wayoftheninjaforge.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class Musicdisk3Item extends RecordItem {
	public Musicdisk3Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("way_of_the_ninja_forge_1_20_1:shadows_of_konoha")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 2260);
	}
}
