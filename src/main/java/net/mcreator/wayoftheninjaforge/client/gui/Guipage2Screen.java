package net.mcreator.wayoftheninjaforge.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wayoftheninjaforge.world.inventory.Guipage2Menu;
import net.mcreator.wayoftheninjaforge.procedures.Visibilitybuttontopage2Procedure;
import net.mcreator.wayoftheninjaforge.procedures.RightviewcharacterdisplayProcedure;
import net.mcreator.wayoftheninjaforge.procedures.LeftviewcharacterdisplayProcedure;
import net.mcreator.wayoftheninjaforge.procedures.HalfrightviewcharacterdisplayProcedure;
import net.mcreator.wayoftheninjaforge.procedures.HalfleftviewcharacterdisplayProcedure;
import net.mcreator.wayoftheninjaforge.procedures.FrontviewcharacterdisplayProcedure;
import net.mcreator.wayoftheninjaforge.procedures.DisplaycharacterentityProcedure;
import net.mcreator.wayoftheninjaforge.network.Guipage2ButtonMessage;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Guipage2Screen extends AbstractContainerScreen<Guipage2Menu> {
	private final static HashMap<String, Object> guistate = Guipage2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_left_arrow2;
	ImageButton imagebutton_next_button;
	ImageButton imagebutton_left_arrow;
	ImageButton imagebutton_right_arrow;
	ImageButton imagebutton_left_arrow1;
	ImageButton imagebutton_right_arrow1;
	ImageButton imagebutton_left_arrow3;
	ImageButton imagebutton_right_arrow2;
	ImageButton imagebutton_left_arrow4;
	ImageButton imagebutton_right_arrow3;
	ImageButton imagebutton_left_arrow5;
	ImageButton imagebutton_right_arrow4;
	ImageButton imagebutton_left_arrow6;
	ImageButton imagebutton_right_arrow5;
	ImageButton imagebutton_left_arrow7;
	ImageButton imagebutton_right_arrow6;
	ImageButton imagebutton_rotate_left_arrow;
	ImageButton imagebutton_rotate_right_arrow;

	public Guipage2Screen(Guipage2Menu container, Inventory inventory, Component text) {
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
		if (DisplaycharacterentityProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			if (LeftviewcharacterdisplayProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 119, this.topPos + 144, 70, -4.25f, 0, livingEntity);
		}
		if (DisplaycharacterentityProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			if (HalfleftviewcharacterdisplayProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 119, this.topPos + 144, 70, -2.25f, 0, livingEntity);
		}
		if (DisplaycharacterentityProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			if (RightviewcharacterdisplayProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 119, this.topPos + 144, 70, 4.25f, 0, livingEntity);
		}
		if (DisplaycharacterentityProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			if (HalfrightviewcharacterdisplayProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 119, this.topPos + 144, 70, 2.25f, 0, livingEntity);
		}
		if (DisplaycharacterentityProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			if (FrontviewcharacterdisplayProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 119, this.topPos + 144, 70, 0f, 0, livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/bg.png"), this.leftPos + 1, this.topPos + -20, 0, 0, 400, 210, 400, 210);

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
	}

	@Override
	public void init() {
		super.init();
		imagebutton_left_arrow2 = new ImageButton(this.leftPos + -14, this.topPos + -37, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_left_arrow2.png"), 15, 30, e -> {
		});
		guistate.put("button:imagebutton_left_arrow2", imagebutton_left_arrow2);
		this.addRenderableWidget(imagebutton_left_arrow2);
		imagebutton_next_button = new ImageButton(this.leftPos + 325, this.topPos + 133, 42, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_next_button.png"), 42, 30, e -> {
			if (Visibilitybuttontopage2Procedure.execute(entity)) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(1, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = Visibilitybuttontopage2Procedure.execute(entity);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_next_button", imagebutton_next_button);
		this.addRenderableWidget(imagebutton_next_button);
		imagebutton_left_arrow = new ImageButton(this.leftPos + 213, this.topPos + 14, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_left_arrow.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(2, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left_arrow", imagebutton_left_arrow);
		this.addRenderableWidget(imagebutton_left_arrow);
		imagebutton_right_arrow = new ImageButton(this.leftPos + 242, this.topPos + 14, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_right_arrow.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(3, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right_arrow", imagebutton_right_arrow);
		this.addRenderableWidget(imagebutton_right_arrow);
		imagebutton_left_arrow1 = new ImageButton(this.leftPos + 213, this.topPos + 34, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_left_arrow1.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(4, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left_arrow1", imagebutton_left_arrow1);
		this.addRenderableWidget(imagebutton_left_arrow1);
		imagebutton_right_arrow1 = new ImageButton(this.leftPos + 242, this.topPos + 34, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_right_arrow1.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(5, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right_arrow1", imagebutton_right_arrow1);
		this.addRenderableWidget(imagebutton_right_arrow1);
		imagebutton_left_arrow3 = new ImageButton(this.leftPos + 213, this.topPos + 65, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_left_arrow3.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(6, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left_arrow3", imagebutton_left_arrow3);
		this.addRenderableWidget(imagebutton_left_arrow3);
		imagebutton_right_arrow2 = new ImageButton(this.leftPos + 242, this.topPos + 65, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_right_arrow2.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(7, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right_arrow2", imagebutton_right_arrow2);
		this.addRenderableWidget(imagebutton_right_arrow2);
		imagebutton_left_arrow4 = new ImageButton(this.leftPos + 213, this.topPos + 86, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_left_arrow4.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(8, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left_arrow4", imagebutton_left_arrow4);
		this.addRenderableWidget(imagebutton_left_arrow4);
		imagebutton_right_arrow3 = new ImageButton(this.leftPos + 242, this.topPos + 86, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_right_arrow3.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(9, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right_arrow3", imagebutton_right_arrow3);
		this.addRenderableWidget(imagebutton_right_arrow3);
		imagebutton_left_arrow5 = new ImageButton(this.leftPos + 301, this.topPos + 13, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_left_arrow5.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(10, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left_arrow5", imagebutton_left_arrow5);
		this.addRenderableWidget(imagebutton_left_arrow5);
		imagebutton_right_arrow4 = new ImageButton(this.leftPos + 330, this.topPos + 13, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_right_arrow4.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(11, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right_arrow4", imagebutton_right_arrow4);
		this.addRenderableWidget(imagebutton_right_arrow4);
		imagebutton_left_arrow6 = new ImageButton(this.leftPos + 301, this.topPos + 34, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_left_arrow6.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(12, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left_arrow6", imagebutton_left_arrow6);
		this.addRenderableWidget(imagebutton_left_arrow6);
		imagebutton_right_arrow5 = new ImageButton(this.leftPos + 330, this.topPos + 34, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_right_arrow5.png"), 15, 30, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(13, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right_arrow5", imagebutton_right_arrow5);
		this.addRenderableWidget(imagebutton_right_arrow5);
		imagebutton_left_arrow7 = new ImageButton(this.leftPos + 301, this.topPos + 66, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_left_arrow7.png"), 15, 30, e -> {
		});
		guistate.put("button:imagebutton_left_arrow7", imagebutton_left_arrow7);
		this.addRenderableWidget(imagebutton_left_arrow7);
		imagebutton_right_arrow6 = new ImageButton(this.leftPos + 330, this.topPos + 66, 15, 15, 0, 0, 15, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_right_arrow6.png"), 15, 30, e -> {
		});
		guistate.put("button:imagebutton_right_arrow6", imagebutton_right_arrow6);
		this.addRenderableWidget(imagebutton_right_arrow6);
		imagebutton_rotate_left_arrow = new ImageButton(this.leftPos + 73, this.topPos + 124, 21, 13, 0, 0, 13, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_rotate_left_arrow.png"), 21, 26, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(16, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rotate_left_arrow", imagebutton_rotate_left_arrow);
		this.addRenderableWidget(imagebutton_rotate_left_arrow);
		imagebutton_rotate_right_arrow = new ImageButton(this.leftPos + 145, this.topPos + 124, 21, 13, 0, 0, 13, new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/screens/atlas/imagebutton_rotate_right_arrow.png"), 21, 26, e -> {
			if (true) {
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.sendToServer(new Guipage2ButtonMessage(17, x, y, z));
				Guipage2ButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rotate_right_arrow", imagebutton_rotate_right_arrow);
		this.addRenderableWidget(imagebutton_rotate_right_arrow);
	}
}
