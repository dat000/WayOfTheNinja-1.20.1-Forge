
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class Roof3stairsBlock extends StairBlock {
	public Roof3stairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
