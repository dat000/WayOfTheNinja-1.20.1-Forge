
package net.mcreator.wayoftheninjaforge.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.wayoftheninjaforge.procedures.CheckalljutsuoncharacterProcedure;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Jutsu1useMessage {
	int type, pressedms;

	public Jutsu1useMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public Jutsu1useMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(Jutsu1useMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(Jutsu1useMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			CheckalljutsuoncharacterProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WayOfTheNinjaForge1201Mod.addNetworkMessage(Jutsu1useMessage.class, Jutsu1useMessage::buffer, Jutsu1useMessage::new, Jutsu1useMessage::handler);
	}
}
