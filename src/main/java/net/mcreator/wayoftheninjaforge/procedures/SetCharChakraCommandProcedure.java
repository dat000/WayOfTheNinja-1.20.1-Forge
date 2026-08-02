package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetCharChakraCommandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())) {
			if ((entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
					? _livingEntity1.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
					: 0)
					+ DoubleArgumentType.getDouble(arguments, "number") <= (entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit) {
				if ((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()) instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
					_livingEntity5.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).setBaseValue((DoubleArgumentType.getDouble(arguments, "number")));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7aCharacter chakra has been changed to \u00A7f" + (new java.text.DecimalFormat("##.##").format((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()) instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
							? _livingEntity8.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
							: 0)))), false);
			} else {
				if ((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()) instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
					_livingEntity11.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
							.setBaseValue(((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7aCharacter chakra cant be more than chakra limit, chakra has been set to limit =\u00A7f " + (new java.text.DecimalFormat("##.##").format((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()) instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
							? _livingEntity14.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()).getBaseValue()
							: 0)))), false);
			}
		}
	}
}
