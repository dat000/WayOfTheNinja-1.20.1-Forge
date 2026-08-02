
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class Wall3buttonnBlock extends ButtonBlock {
	public Wall3buttonnBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f), BlockSetType.STONE, 20, false);
	}
}
