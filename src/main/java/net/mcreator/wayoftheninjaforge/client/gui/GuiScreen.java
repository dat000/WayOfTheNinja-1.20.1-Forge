package net.mcreator.wayoftheninjaforge.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.wayoftheninjaforge.world.inventory.GuiMenu;
import net.mcreator.wayoftheninjaforge.network.GuiButtonMessage;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GuiScreen extends AbstractContainerScreen<GuiMenu> {
	private final static HashMap<String, Object> guistate = GuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox player_namefield;
	Checkbox player_namefield_check;
	ImageButton imagebutton_next_button;

	public GuiScreen(GuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		player_namefield.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/bg_2.png"), this.leftPos + 1, this.topPos + -20, 0, 0, 400, 210, 400, 210);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (player_namefield.isFocused())
			return player_namefield.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		player_namefield.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String player_namefieldValue = player_namefield.getValue();
		super.resize(minecraft, width, height);
		player_namefield.setValue(player_namefieldValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.gui.label_name"), 154, 70, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.gui.label_welcome_to_way_of_the_ninja"), 154, 34, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.gui.label_to_start_your_adventure_create"), 118, 52, -1, false);
	}

	@Override
	public void init() {
		super.init();
		player_namefield = new EditBox(this.font, this.leftPos + 155, this.topPos + 80, 118, 18, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.gui.player_namefield"));
		player_namefield.setMaxLength(32767);
		guistate.put("text:player_namefield", player_namefield);
		this.addWidget(this.player_namefield);
		imagebutton_next_button = new ImageButton(this.leftPos + 199, this.topPos + 115, 42, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_next_button.png"), 42, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new GuiButtonMessage(0, x, y, z));
				GuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_next_button", imagebutton_next_button);
		this.addRenderableWidget(imagebutton_next_button);
		player_namefield_check = new Checkbox(this.leftPos + 280, this.topPos + 79, 20, 20, Component.translatable("gui.way_of_the_ninja_forge_1_20_1.gui.player_namefield_check"), false);
		guistate.put("checkbox:player_namefield_check", player_namefield_check);
		this.addRenderableWidget(player_namefield_check);
	}
}
