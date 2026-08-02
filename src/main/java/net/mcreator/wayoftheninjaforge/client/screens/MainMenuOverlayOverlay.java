
package net.mcreator.wayoftheninjaforge.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MainMenuOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(ScreenEvent.Render.Post event) {
		if (event.getScreen() instanceof TitleScreen) {
			int w = event.getScreen().width;
			int h = event.getScreen().height;
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
				event.getGuiGraphics().blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/way_of_the_ninja_logo_1.png"), w / 2 + -144, 70, 0, 0, 299, 33, 299, 33);

				// 1. Guardamos el estado actual
				event.getGuiGraphics().pose().pushPose();
				// 2. Nos movemos a la posición deseada (ajusta X e Y a tu gusto)
				event.getGuiGraphics().pose().translate(w / 2 + 100, 102, 0);
				// 3. Rotación en diagonal (el -20 clásico)
				event.getGuiGraphics().pose().mulPose(com.mojang.math.Axis.ZP.rotationDegrees(-20.0F));

				// --- 4. ANIMACIÓN DE LATIDO ---
				// uso el tiempo del sistema y lo divido para llegar a 20 ticks
				float time = (System.currentTimeMillis() % 100000L) / 50.0F;
				// Hacemos que la escala oscile sutilmente entre 1.0 y 1.15 de tamaño de forma rítmica
				float scale = 1.0F + 0.15F * net.minecraft.util.Mth.sin(time * 0.2F);
				event.getGuiGraphics().pose().scale(scale, scale, 1.0F);
				// ----------------------------------------------------

				// 5. Dibuja el texto
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, "¡Sasuke la re concha de tu Madre!", 0, 0, 16776960, false);
				// 6. Restaura screensave
				event.getGuiGraphics().pose().popPose();

				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.main_menu_overlay.label_alpha_001"), w / 2 + 10, 105, -65536, false);
			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
