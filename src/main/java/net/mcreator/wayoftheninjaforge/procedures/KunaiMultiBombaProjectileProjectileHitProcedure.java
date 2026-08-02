package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModItems;

public class KunaiMultiBombaProjectileProjectileHitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 6, Level.ExplosionInteraction.BLOCK);
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(WayOfTheNinjaForge1201ModItems.KUNAIMULTIBOMBA.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
