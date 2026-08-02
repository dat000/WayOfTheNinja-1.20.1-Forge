
package net.mcreator.wayoftheninjaforge.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Transformation1Message {
	int type, pressedms;

	public Transformation1Message(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public Transformation1Message(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(Transformation1Message message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(Transformation1Message message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WayOfTheNinjaForge1201Mod.addNetworkMessage(Transformation1Message.class, Transformation1Message::buffer, Transformation1Message::new, Transformation1Message::handler);
	}
}
