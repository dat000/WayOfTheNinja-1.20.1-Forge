
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.wayoftheninjaforge.network.TestTodimensionKeyMessage;
import net.mcreator.wayoftheninjaforge.network.Jutsu1useMessage;
import net.mcreator.wayoftheninjaforge.network.DodgeJutsuUseMessage;
import net.mcreator.wayoftheninjaforge.network.DisplayGuiMessage;
import net.mcreator.wayoftheninjaforge.network.DebugmodekeyMessage;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WayOfTheNinjaForge1201ModKeyMappings {
	public static final KeyMapping DISPLAY_GUI = new KeyMapping("key.way_of_the_ninja_forge_1_20_1.display_gui", GLFW.GLFW_KEY_J, "key.categories.way_of_the_ninja") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new DisplayGuiMessage(0, 0));
				DisplayGuiMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping JUTSU_1USE = new KeyMapping("key.way_of_the_ninja_forge_1_20_1.jutsu_1use", GLFW.GLFW_KEY_R, "key.categories.way_of_the_ninja") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Jutsu1useMessage(0, 0));
				Jutsu1useMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DEBUGMODEKEY = new KeyMapping("key.way_of_the_ninja_forge_1_20_1.debugmodekey", GLFW.GLFW_KEY_F6, "key.categories.way_of_the_ninja") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new DebugmodekeyMessage(0, 0));
				DebugmodekeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DODGE_JUTSU_USE = new KeyMapping("key.way_of_the_ninja_forge_1_20_1.dodge_jutsu_use", GLFW.GLFW_KEY_X, "key.categories.way_of_the_ninja") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new DodgeJutsuUseMessage(0, 0));
				DodgeJutsuUseMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TRANSFORMATION_1 = new KeyMapping("key.way_of_the_ninja_forge_1_20_1.transformation_1", GLFW.GLFW_KEY_G, "key.categories.way_of_the_ninja");
	public static final KeyMapping TRANSFORMATION_2 = new KeyMapping("key.way_of_the_ninja_forge_1_20_1.transformation_2", GLFW.GLFW_KEY_H, "key.categories.way_of_the_ninja");
	public static final KeyMapping TRANSFORMATION_3 = new KeyMapping("key.way_of_the_ninja_forge_1_20_1.transformation_3", GLFW.GLFW_KEY_B, "key.categories.way_of_the_ninja");
	public static final KeyMapping TEST_TODIMENSION_KEY = new KeyMapping("key.way_of_the_ninja_forge_1_20_1.test_todimension_key", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new TestTodimensionKeyMessage(0, 0));
				TestTodimensionKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DISPLAY_GUI);
		event.register(JUTSU_1USE);
		event.register(DEBUGMODEKEY);
		event.register(DODGE_JUTSU_USE);
		event.register(TRANSFORMATION_1);
		event.register(TRANSFORMATION_2);
		event.register(TRANSFORMATION_3);
		event.register(TEST_TODIMENSION_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DISPLAY_GUI.consumeClick();
				JUTSU_1USE.consumeClick();
				DEBUGMODEKEY.consumeClick();
				DODGE_JUTSU_USE.consumeClick();
				TEST_TODIMENSION_KEY.consumeClick();
			}
		}
	}
}
