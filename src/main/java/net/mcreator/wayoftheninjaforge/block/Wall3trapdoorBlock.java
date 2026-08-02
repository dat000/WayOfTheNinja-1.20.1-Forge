
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class Wall3trapdoorBlock extends TrapDoorBlock {
	public Wall3trapdoorBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f), BlockSetType.STONE);
	}
}
