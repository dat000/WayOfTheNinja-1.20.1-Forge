package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModEntities;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;
import net.mcreator.wayoftheninjaforge.entity.FireballProjectileEntity;

public class JutsufireballProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).can_use_jutsu) {
			if ((entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
					? _livingEntity0.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
					: 0) >= 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new FireballProjectileEntity(WayOfTheNinjaForge1201ModEntities.FIREBALL_PROJECTILE.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.5, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
					_livingEntity5.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
							.setBaseValue(((entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
									? _livingEntity4.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
									: 0) - 10));
				{
					boolean _setval = false;
					entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.can_use_jutsu = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 60;
					entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.global_cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A74not enough chakra"), true);
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A74ability on cooldown"), true);
	}
}
