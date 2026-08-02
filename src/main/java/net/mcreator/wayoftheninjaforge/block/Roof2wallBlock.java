
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class Roof2wallBlock extends WallBlock {
	public Roof2wallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn());
	}
}
