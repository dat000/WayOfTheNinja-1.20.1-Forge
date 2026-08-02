
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.wayoftheninjaforge.client.gui.GuistatsScreen;
import net.mcreator.wayoftheninjaforge.client.gui.Guipage2Screen;
import net.mcreator.wayoftheninjaforge.client.gui.GuiabilitiestreeScreen;
import net.mcreator.wayoftheninjaforge.client.gui.GuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WayOfTheNinjaForge1201ModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WayOfTheNinjaForge1201ModMenus.GUI.get(), GuiScreen::new);
			MenuScreens.register(WayOfTheNinjaForge1201ModMenus.GUISTATS.get(), GuistatsScreen::new);
			MenuScreens.register(WayOfTheNinjaForge1201ModMenus.GUIABILITIESTREE.get(), GuiabilitiestreeScreen::new);
			MenuScreens.register(WayOfTheNinjaForge1201ModMenus.GUIPAGE_2.get(), Guipage2Screen::new);
		});
	}
}
