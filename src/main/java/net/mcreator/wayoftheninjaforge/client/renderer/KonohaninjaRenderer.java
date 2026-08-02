
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

import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition9Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition8Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition7Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition6Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition5Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition4Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition3Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition2Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition1Procedure;
import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaDisplayCondition10Procedure;
import net.mcreator.wayoftheninjaforge.entity.KonohaninjaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class KonohaninjaRenderer extends HumanoidMobRenderer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>> {
	public KonohaninjaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<KonohaninjaEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_4.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition4Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_5.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition5Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_6.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition6Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_7.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition7Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_8.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition8Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_9.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition9Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<KonohaninjaEntity, HumanoidModel<KonohaninjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha_ninja_10.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, KonohaninjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (KonohaninjaDisplayCondition10Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(KonohaninjaEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konoha-ninja-template.png");
	}
}
