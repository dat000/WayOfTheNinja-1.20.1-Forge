
package net.mcreator.wayoftheninjaforge.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class Wall4pressureplateBlock extends PressurePlateBlock {
	public Wall4pressureplateBlock() {
		super(Sensitivity.MOBS, BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).forceSolidOn(), BlockSetType.IRON);
	}
}
