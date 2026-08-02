
package net.mcreator.wayoftheninjaforge.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.wayoftheninjaforge.world.inventory.GuiabilitiestreeMenu;
import net.mcreator.wayoftheninjaforge.procedures.Talent153selectedProcedure;
import net.mcreator.wayoftheninjaforge.procedures.Talent152selectedProcedure;
import net.mcreator.wayoftheninjaforge.procedures.Talent151selectedProcedure;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GuiabilitiestreeButtonMessage {
	private final int buttonID, x, y, z;

	public GuiabilitiestreeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public GuiabilitiestreeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(GuiabilitiestreeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(GuiabilitiestreeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = GuiabilitiestreeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Talent151selectedProcedure.execute(world);
		}
		if (buttonID == 1) {

			Talent152selectedProcedure.execute(world);
		}
		if (buttonID == 2) {

			Talent153selectedProcedure.execute(world);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WayOfTheNinjaForge1201Mod.addNetworkMessage(GuiabilitiestreeButtonMessage.class, GuiabilitiestreeButtonMessage::buffer, GuiabilitiestreeButtonMessage::new, GuiabilitiestreeButtonMessage::handler);
	}
}
