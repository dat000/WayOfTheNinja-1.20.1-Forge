
package net.mcreator.wayoftheninjaforge.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RyoItem extends Item {
	public RyoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
