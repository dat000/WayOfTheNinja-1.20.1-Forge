package net.mcreator.wayoftheninjaforge.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wayoftheninjaforge.world.inventory.GuiabilitiestreeMenu;
import net.mcreator.wayoftheninjaforge.procedures.Checkcharacterlevel15moreProcedure;
import net.mcreator.wayoftheninjaforge.network.GuiabilitiestreeButtonMessage;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuiabilitiestreeScreen extends AbstractContainerScreen<GuiabilitiestreeMenu> {
	private final static HashMap<String, Object> guistate = GuiabilitiestreeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_fireball;
	Button button_health;
	Button button_speed;

	public GuiabilitiestreeScreen(GuiabilitiestreeMenu container, Inventory inventory, Component text) {
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
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
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
		guiGraphics.drawString(this.font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guiabilitiestree.label_15"), -21, 7, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guiabilitiestree.label_25"), -21, 43, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guiabilitiestree.label_45"), -21, 79, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guiabilitiestree.label_60"), -21, 115, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_fireball = Button.builder(Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guiabilitiestree.button_fireball"), e -> {
			if (Checkcharacterlevel15moreProcedure.execute(entity)) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new GuiabilitiestreeButtonMessage(0, x, y, z));
				GuiabilitiestreeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 7, 67, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = Checkcharacterlevel15moreProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_fireball", button_fireball);
		this.addRenderableWidget(button_fireball);
		button_health = Button.builder(Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guiabilitiestree.button_health"), e -> {
			if (Checkcharacterlevel15moreProcedure.execute(entity)) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new GuiabilitiestreeButtonMessage(1, x, y, z));
				GuiabilitiestreeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 7, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = Checkcharacterlevel15moreProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_health", button_health);
		this.addRenderableWidget(button_health);
		button_speed = Button.builder(Component.translatable("gui.way_of_the_ninja_forge_1_20_1.guiabilitiestree.button_speed"), e -> {
			if (Checkcharacterlevel15moreProcedure.execute(entity)) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new GuiabilitiestreeButtonMessage(2, x, y, z));
				GuiabilitiestreeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 7, 51, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = Checkcharacterlevel15moreProcedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_speed", button_speed);
		this.addRenderableWidget(button_speed);
	}
}
