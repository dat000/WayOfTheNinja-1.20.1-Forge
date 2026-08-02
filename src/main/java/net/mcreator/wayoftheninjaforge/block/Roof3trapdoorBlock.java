
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class Roof3trapdoorBlock extends TrapDoorBlock {
	public Roof3trapdoorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f), BlockSetType.STONE);
	}
}
