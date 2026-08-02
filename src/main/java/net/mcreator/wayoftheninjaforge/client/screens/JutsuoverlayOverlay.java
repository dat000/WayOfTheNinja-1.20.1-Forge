
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

import net.mcreator.wayoftheninjaforge.procedures.Talent153equipedProcedure;
import net.mcreator.wayoftheninjaforge.procedures.Talent152equipedProcedure;
import net.mcreator.wayoftheninjaforge.procedures.Talent151equipedProcedure;
import net.mcreator.wayoftheninjaforge.procedures.DisplayjutsuoverlayProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class JutsuoverlayOverlay {
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
		if (DisplayjutsuoverlayProcedure.execute()) {
			event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/jutsu_selected_preview.png"), w - 121, h - 19, 0, 0, 16, 16, 16, 16);

			if (Talent151equipedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/fireball_jutsu_preview.png"), w - 121, h - 19, 0, 0, 16, 16, 16, 16);
			}
			if (Talent152equipedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/heart_preview.png"), w - 121, h - 19, 0, 0, 16, 16, 16, 16);
			}
			if (Talent153equipedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/boots_sprint_preview.png"), w - 121, h - 20, 0, 0, 16, 16, 16, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
