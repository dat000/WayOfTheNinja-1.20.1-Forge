
package net.mcreator.wayoftheninjaforge.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.wayoftheninjaforge.procedures.SetVillageCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetNatureCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetClanCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetCharNameCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetCharLevelCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetCharExpCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetCharAttributeStrengthCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetCharAttributeIntellectCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetCharAttributeFortitudeCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetCharAttributeChakraCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.SetCharAttributeAgilityCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturnCharLevelCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.GetNatureCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.GetCharVillageCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.GetCharNameCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.GetCharExpCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.GetCharClanCommandProcedure;
import net.mcreator.wayoftheninjaforge.procedures.GetCharAttributesCommandProcedure;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class CharacterCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("character")

				.then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("name").then(Commands.literal("get").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GetCharNameCommandProcedure.execute(arguments, entity);
					return 0;
				})).then(Commands.literal("set").then(Commands.argument("newName", MessageArgument.message()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetCharNameCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				})))).then(Commands.literal("clan").then(Commands.literal("get").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GetCharClanCommandProcedure.execute(arguments, entity);
					return 0;
				})).then(Commands.literal("set").then(Commands.argument("clanID", DoubleArgumentType.doubleArg(0, 10)).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetClanCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				})))).then(Commands.literal("village").then(Commands.literal("get").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GetCharVillageCommandProcedure.execute(arguments, entity);
					return 0;
				})).then(Commands.literal("set").then(Commands.argument("villageID", DoubleArgumentType.doubleArg(0, 10)).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetVillageCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				})))).then(Commands.literal("nature").then(Commands.literal("get").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GetNatureCommandProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("set").then(Commands.argument("natureID", DoubleArgumentType.doubleArg(0, 11)).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetNatureCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				})))).then(Commands.literal("level").then(Commands.literal("get").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					ReturnCharLevelCommandProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("set").then(Commands.argument("number", DoubleArgumentType.doubleArg(0, 100)).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetCharLevelCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				})))).then(Commands.literal("experience").then(Commands.literal("get").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GetCharExpCommandProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("set").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetCharExpCommandProcedure.execute(arguments, entity);
					return 0;
				})))).then(Commands.literal("attributes").then(Commands.literal("get").executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					GetCharAttributesCommandProcedure.execute(arguments, entity);
					return 0;
				})).then(Commands.literal("set").then(Commands.literal("fortitude").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetCharAttributeFortitudeCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				}))).then(Commands.literal("strength").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetCharAttributeStrengthCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				}))).then(Commands.literal("agility").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetCharAttributeAgilityCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				}))).then(Commands.literal("intellect").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetCharAttributeIntellectCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				}))).then(Commands.literal("chakra").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
					Level world = arguments.getSource().getUnsidedLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null && world instanceof ServerLevel _servLevel)
						entity = FakePlayerFactory.getMinecraft(_servLevel);
					Direction direction = Direction.DOWN;
					if (entity != null)
						direction = entity.getDirection();

					SetCharAttributeChakraCommandProcedure.execute(world, x, y, z, arguments, entity);
					return 0;
				})))))));
	}
}
