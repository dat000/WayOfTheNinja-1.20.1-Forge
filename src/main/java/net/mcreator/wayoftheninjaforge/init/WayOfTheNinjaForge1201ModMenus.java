
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.wayoftheninjaforge.world.inventory.GuistatsMenu;
import net.mcreator.wayoftheninjaforge.world.inventory.Guipage2Menu;
import net.mcreator.wayoftheninjaforge.world.inventory.GuiabilitiestreeMenu;
import net.mcreator.wayoftheninjaforge.world.inventory.GuiMenu;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

public class WayOfTheNinjaForge1201ModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WayOfTheNinjaForge1201Mod.MODID);
	public static final RegistryObject<MenuType<GuiMenu>> GUI = REGISTRY.register("gui", () -> IForgeMenuType.create(GuiMenu::new));
	public static final RegistryObject<MenuType<GuistatsMenu>> GUISTATS = REGISTRY.register("guistats", () -> IForgeMenuType.create(GuistatsMenu::new));
	public static final RegistryObject<MenuType<GuiabilitiestreeMenu>> GUIABILITIESTREE = REGISTRY.register("guiabilitiestree", () -> IForgeMenuType.create(GuiabilitiestreeMenu::new));
	public static final RegistryObject<MenuType<Guipage2Menu>> GUIPAGE_2 = REGISTRY.register("guipage_2", () -> IForgeMenuType.create(Guipage2Menu::new));
}
