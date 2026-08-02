package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderArmEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.Minecraft;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class ChangePlayerHandSkinProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderArmEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderArmEvent _evt = (RenderArmEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = mc.getEntityRenderDispatcher();
		Entity _evtEntity = _evt.getPlayer();
		PlayerRenderer playerRenderer = (PlayerRenderer) dis.getRenderer(_evt.getPlayer());
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		MultiBufferSource bufferSource = _evt.getMultiBufferSource();
		int packedLight = _evt.getPackedLight();
		PoseStack poseStack = _evt.getPoseStack();
		PlayerModel<AbstractClientPlayer> playerModel = new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER), false);
		playerModel.attackTime = 0.0F;
		playerModel.crouching = false;
		playerModel.swimAmount = 0.0F;
		playerModel.setupAnim(_evt.getPlayer(), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		playerModel.leftArm.xRot = 0.0F;
		playerModel.rightArm.xRot = 0.0F;
		HumanoidArm arm = _evt.getArm();
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type != 0) {
			_evt.setCanceled(true);
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 1) {
				{
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_1.png") != null) {
						_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_1.png");
					}
					PlayerModel<AbstractClientPlayer> newModel = new PlayerModel<>(context.bakeLayer(true ? ModelLayers.PLAYER_SLIM : ModelLayers.PLAYER), true);
					newModel.leftArm.copyFrom(playerModel.leftArm);
					newModel.rightArm.copyFrom(playerModel.rightArm);
					if (arm == HumanoidArm.LEFT) {
						newModel.leftArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
					} else {
						newModel.rightArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
					}
				}
			} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 2) {
				{
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_2.png") != null) {
						_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_2.png");
					}
					PlayerModel<AbstractClientPlayer> newModel = new PlayerModel<>(context.bakeLayer(true ? ModelLayers.PLAYER_SLIM : ModelLayers.PLAYER), true);
					newModel.leftArm.copyFrom(playerModel.leftArm);
					newModel.rightArm.copyFrom(playerModel.rightArm);
					if (arm == HumanoidArm.LEFT) {
						newModel.leftArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
					} else {
						newModel.rightArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
					}
				}
			} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 3) {
				{
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_3.png") != null) {
						_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_3.png");
					}
					PlayerModel<AbstractClientPlayer> newModel = new PlayerModel<>(context.bakeLayer(true ? ModelLayers.PLAYER_SLIM : ModelLayers.PLAYER), true);
					newModel.leftArm.copyFrom(playerModel.leftArm);
					newModel.rightArm.copyFrom(playerModel.rightArm);
					if (arm == HumanoidArm.LEFT) {
						newModel.leftArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
					} else {
						newModel.rightArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
					}
				}
			} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 4) {
				{
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_4.png") != null) {
						_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_4.png");
					}
					PlayerModel<AbstractClientPlayer> newModel = new PlayerModel<>(context.bakeLayer(true ? ModelLayers.PLAYER_SLIM : ModelLayers.PLAYER), true);
					newModel.leftArm.copyFrom(playerModel.leftArm);
					newModel.rightArm.copyFrom(playerModel.rightArm);
					if (arm == HumanoidArm.LEFT) {
						newModel.leftArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
					} else {
						newModel.rightArm.render(_evt.getPoseStack(), bufferSource.getBuffer(RenderType.entityTranslucentCull(_texture)), packedLight, OverlayTexture.NO_OVERLAY);
					}
				}
			}
		}
	}
}
