
package net.mcreator.wayoftheninjaforge.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Transformation2Message {
	int type, pressedms;

	public Transformation2Message(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public Transformation2Message(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(Transformation2Message message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(Transformation2Message message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WayOfTheNinjaForge1201Mod.addNetworkMessage(Transformation2Message.class, Transformation2Message::buffer, Transformation2Message::new, Transformation2Message::handler);
	}
}
