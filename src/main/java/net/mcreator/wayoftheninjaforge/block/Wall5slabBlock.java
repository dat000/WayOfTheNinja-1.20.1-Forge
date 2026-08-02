
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class Wall5slabBlock extends SlabBlock {
	public Wall5slabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f));
	}
}
