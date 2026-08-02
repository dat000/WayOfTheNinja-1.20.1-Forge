
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class Roof3fenceBlock extends FenceBlock {
	public Roof3fenceBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}
