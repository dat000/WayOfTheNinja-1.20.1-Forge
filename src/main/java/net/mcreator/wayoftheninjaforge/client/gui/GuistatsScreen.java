package net.mcreator.wayoftheninjaforge.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wayoftheninjaforge.world.inventory.GuistatsMenu;
import net.mcreator.wayoftheninjaforge.procedures.ReturnnaturenameProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturnclannameProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturncharnameProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturnVillageNameProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturnCharAttributeStrengthProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturnCharAttributeIntellectProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturnCharAttributeFortitudeProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturnCharAttributeChakraProcedure;
import net.mcreator.wayoftheninjaforge.procedures.ReturnCharAttributeAgilityProcedure;
import net.mcreator.wayoftheninjaforge.procedures.DisplaycharacterentityProcedure;
import net.mcreator.wayoftheninjaforge.procedures.CharreturnattributepointsProcedure;
import net.mcreator.wayoftheninjaforge.procedures.CharacterlevelreturnProcedure;
import net.mcreator.wayoftheninjaforge.procedures.CharacterexpreturnProcedure;
import net.mcreator.wayoftheninjaforge.network.GuistatsButtonMessage;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuistatsScreen extends AbstractContainerScreen<GuistatsMenu> {
	private final static HashMap<String, Object> guistate = GuistatsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_close;
	Button button_finishchar;

	public GuistatsScreen(GuistatsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (DisplaycharacterentityProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -2, this.topPos + 144, 80, 0f + (float) Math.atan((this.leftPos + -2 - mouseX) / 40.0), (float) Math.atan((this.topPos + 95 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/bg_2.png"), this.leftPos + -120, this.topPos + -20, 0, 0, 400, 210, 400, 210);

		guiGraphics.blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/levelupattributebutton.png"), this.leftPos + 141, this.topPos + 88, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/levelupattributebutton.png"), this.leftPos + 141, this.topPos + 97, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/levelupattributebutton.png"), this.leftPos + 141, this.topPos + 106, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/levelupattributebutton.png"), this.leftPos + 141, this.topPos + 115, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/levelupattributebutton.png"), this.leftPos + 141, this.topPos + 124, 0, 0, 8, 8, 8, 8);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				ReturncharnameProcedure.execute(entity), 60, 16, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnclannameProcedure.execute(entity), 105, 16, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnVillageNameProcedure.execute(entity), 60, 25, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnnaturenameProcedure.execute(entity), 60, 52, -12829636, false);
		guiGraphics.drawString(this.font,

				CharacterlevelreturnProcedure.execute(entity), 60, 70, -12829636, false);
		guiGraphics.drawString(this.font,

				CharacterexpreturnProcedure.execute(entity), 96, 70, -12829636, false);
		guiGraphics.drawString(this.font,

				CharreturnattributepointsProcedure.execute(entity), 60, 79, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnCharAttributeFortitudeProcedure.execute(entity), 60, 88, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnCharAttributeStrengthProcedure.execute(entity), 60, 97, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnCharAttributeAgilityProcedure.execute(entity), 60, 106, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnCharAttributeIntellectProcedure.execute(entity), 60, 115, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnCharAttributeChakraProcedure.execute(entity), 60, 124, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_close = Button.builder(Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guistats.button_close"), e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new GuistatsButtonMessage(0, x, y, z));
				GuistatsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 231, this.topPos + 178, 51, 20).build();
		guistate.put("button:button_close", button_close);
		this.addRenderableWidget(button_close);
		button_finishchar = Button.builder(Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guistats.button_finishchar"), e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new GuistatsButtonMessage(1, x, y, z));
				GuistatsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 150, this.topPos + 178, 77, 20).build();
		guistate.put("button:button_finishchar", button_finishchar);
		this.addRenderableWidget(button_finishchar);
	}
}
