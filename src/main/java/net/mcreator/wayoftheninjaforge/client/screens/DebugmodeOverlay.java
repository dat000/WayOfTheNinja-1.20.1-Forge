
package net.mcreator.wayoftheninjaforge.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.wayoftheninjaforge.procedures.ReturnsecondsgcdlabelProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturngcdlabelProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturncharnameProcedure;
import net.mcreator.wayoftheninjaforge.procedures.DisplaycharacterentityProcedure;
import net.mcreator.wayoftheninjaforge.procedures.DisplaychakrapercentageProcedure;
import net.mcreator.wayoftheninjaforge.procedures.DebugOverlayConditionProcedure;
import net.mcreator.wayoftheninjaforge.procedures.CharacterlevelreturnProcedure;
import net.mcreator.wayoftheninjaforge.procedures.CharacterexpreturnProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ChakrabarnumdisplayProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DebugmodeOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (DebugOverlayConditionProcedure.execute(entity)) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_global_cooldown_ticks"), w - 205, 17, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturngcdlabelProcedure.execute(entity), w - 79, 17, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_global_cooldown_seconds"), w - 205, 26, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnsecondsgcdlabelProcedure.execute(entity), w - 79, 26, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_chakra"), w - 205, 35, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_chakra_value"), w - 205, 44, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ChakrabarnumdisplayProcedure.execute(entity), w - 79, 44, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					DisplaychakrapercentageProcedure.execute(entity), w - 79, 35, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_apreta_el_numpad8_wachin_para_de"), 222, 8, -65479, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_character_name"), w - 205, h / 2 + -22, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_character_level"), w - 205, h / 2 + -13, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_character_exp"), w - 205, h / 2 + -4, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturncharnameProcedure.execute(entity), w - 115, h / 2 + -22, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					CharacterlevelreturnProcedure.execute(entity), w - 115, h / 2 + -13, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					CharacterexpreturnProcedure.execute(entity), w - 115, h / 2 + -4, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.debugmode.label_character_skin"), w - 205, h / 2 + -49, -65536, false);
			if (DisplaycharacterentityProcedure.execute(entity) instanceof LivingEntity livingEntity) {
				InventoryScreen.renderEntityInInventoryFollowsAngle(event.getGuiGraphics(), w - 42, 145, 30, 0f, 0, livingEntity);
			}
		}
	}
}
