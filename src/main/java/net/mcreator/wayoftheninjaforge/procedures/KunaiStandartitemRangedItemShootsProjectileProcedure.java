package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

public class KunaiStandartitemRangedItemShootsProjectileProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if (_ist.hurt(100, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
