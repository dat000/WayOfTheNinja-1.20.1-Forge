package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetCharChakraLimitCommandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = DoubleArgumentType.getDouble(arguments, "number");
			entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.chakra_limit = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get()))
			_livingEntity1.getAttribute(WayOfTheNinjaForge1201ModAttributes.CHAKRA_ATTRIBUTE.get())
					.setBaseValue(((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal(("\u00A7aCharacter chakra limit has been changed to\u00A7f "
							+ new java.text.DecimalFormat("##.##").format((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).chakra_limit))),
							false);
	}
}
