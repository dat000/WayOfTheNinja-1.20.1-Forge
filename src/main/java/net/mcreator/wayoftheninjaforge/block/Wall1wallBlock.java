
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class Wall1wallBlock extends WallBlock {
	public Wall1wallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}
