package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModAttributes;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class GetCharAttributesCommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("\u00A7aCharacter attributes: \u00A7f" + "\n" + ("\u00A7aFortitude = \u00A7f" + (new java.text.DecimalFormat("##.##").format((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get())
					? _livingEntity1.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONFORTITUDE.get()).getBaseValue()
					: 0))) + "\n" + ("\u00A7aStrength = \u00A7f" + (new java.text.DecimalFormat("##.##").format((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()) instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONSTRENGTH.get())
							? _livingEntity3.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONSTRENGTH.get()).getBaseValue()
							: 0)))
					+ "\n" + ("\u00A7aAgility = \u00A7f" + (new java.text.DecimalFormat("##.##").format((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()) instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONAGILITY.get())
							? _livingEntity5.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONAGILITY.get()).getBaseValue()
							: 0)))
					+ "\n" + ("\u00A7aIntellect = \u00A7f" + (new java.text.DecimalFormat("##.##").format((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()) instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get())
							? _livingEntity7.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONINTELLECT.get()).getBaseValue()
							: 0)))
					+ "\n" + ("\u00A7aChakra = \u00A7f" + (new java.text.DecimalFormat("##.##").format((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()) instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(WayOfTheNinjaForge1201ModAttributes.WONCHAKRA.get())
							? _livingEntity9.getAttribute(WayOfTheNinjaForge1201ModAttributes.WONCHAKRA.get()).getBaseValue()
							: 0))))),
					false);
	}
}
