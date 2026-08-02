package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetCharAttributeIntellectCommandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 20, 1, 1, 1, 1);
		if ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()) instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get()))
			_livingEntity3.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get()).setBaseValue((DoubleArgumentType.getDouble(arguments, "number")));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal(("\u00A7aCharacter attribute Intellect has been changed to\u00A7f "
							+ (new java.text.DecimalFormat("##.##").format(entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get())
									? _livingEntity5.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get()).getBaseValue()
									: 0)))),
							false);
	}
}
