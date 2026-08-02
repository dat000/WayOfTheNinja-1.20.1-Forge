
package net.mcreator.wayoftheninjaforge.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.wayoftheninjaforge.world.inventory.Guipage2Menu;
import net.mcreator.wayoftheninjaforge.procedures.NextbuttonProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonskintypenextProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonskintypebackProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonrotaterightProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonrotateleftProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonhairtypenextProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonhairtypebackProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonhaircolornextProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonhaircolorbackProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtoneyestypenextProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtoneyestypebackProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtoneyescolornextProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtoneyescolorbackProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonbodytypenextProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ButtonbodytypebackProcedure;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Guipage2ButtonMessage {
	private final int buttonID, x, y, z;

	public Guipage2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Guipage2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Guipage2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Guipage2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = Guipage2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 1) {

			NextbuttonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ButtonbodytypebackProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			ButtonbodytypenextProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			ButtonskintypebackProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			ButtonskintypenextProcedure.execute(world, entity);
		}
		if (buttonID == 6) {

			ButtonhairtypebackProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			ButtonhairtypenextProcedure.execute(world, entity);
		}
		if (buttonID == 8) {

			ButtonhaircolorbackProcedure.execute(world, entity);
		}
		if (buttonID == 9) {

			ButtonhaircolornextProcedure.execute(world, entity);
		}
		if (buttonID == 10) {

			ButtoneyestypebackProcedure.execute(world, entity);
		}
		if (buttonID == 11) {

			ButtoneyestypenextProcedure.execute(world, entity);
		}
		if (buttonID == 12) {

			ButtoneyescolorbackProcedure.execute(world, entity);
		}
		if (buttonID == 13) {

			ButtoneyescolornextProcedure.execute(world, entity);
		}
		if (buttonID == 16) {

			ButtonrotateleftProcedure.execute(world, entity);
		}
		if (buttonID == 17) {

			ButtonrotaterightProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WayOfTheNinjaForge1201Mod.addNetworkMessage(Guipage2ButtonMessage.class, Guipage2ButtonMessage::buffer, Guipage2ButtonMessage::new, Guipage2ButtonMessage::handler);
	}
}
