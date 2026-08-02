
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition9Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition8Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition7Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition6Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition5Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition4Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition3Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition2Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition1Procedure;
import net.mcreator.wayoftheninjaforge.procedures.CloudNinjaDisplayCondition10Procedure;
import net.mcreator.wayoftheninjaforge.entity.CloudNinjaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CloudNinjaRenderer extends HumanoidMobRenderer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>> {
	public CloudNinjaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<CloudNinjaEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_4.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition4Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_5.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition5Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_6.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition6Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_7.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition7Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_8.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition8Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_9.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition9Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<CloudNinjaEntity, HumanoidModel<CloudNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_10.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CloudNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CloudNinjaDisplayCondition10Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CloudNinjaEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/cloud_ninja_skin_1.png");
	}
}
