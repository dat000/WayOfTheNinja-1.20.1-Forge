
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class Roof2slabBlock extends SlabBlock {
	public Roof2slabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f));
	}
}
