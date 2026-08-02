
package net.mcreator.wayoftheninjaforge.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar9Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar8Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar7Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar6Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar5Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar4Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar3Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar2Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar1Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar16Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar15Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar14Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar13Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar12Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar11Procedure;
import net.mcreator.wayoftheninjaforge.procedures.Displaychakrabar10Procedure;
import net.mcreator.wayoftheninjaforge.procedures.ChakrabaremptyProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ChakraoverlaystatusOverlay {
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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (ChakrabaremptyProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_0.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_1.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_2.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_3.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_4.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_5.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_6.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_7.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_8.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_9.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_10.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_11.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_12.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_13.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_14.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_15.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
			if (Displaychakrabar16Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/chakra_status_16.png"), w / 2 + -9, h - 52, 0, 0, 16, 16, 16, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
