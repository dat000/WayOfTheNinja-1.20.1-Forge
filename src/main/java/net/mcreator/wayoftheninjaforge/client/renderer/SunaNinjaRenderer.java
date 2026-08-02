
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

import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition9Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition8Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition7Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition6Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition5Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition4Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition3Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition2Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition1Procedure;
import net.mcreator.wayoftheninjaforge.procedures.SunaNinjaDisplayCondition10Procedure;
import net.mcreator.wayoftheninjaforge.entity.SunaNinjaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SunaNinjaRenderer extends HumanoidMobRenderer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>> {
	public SunaNinjaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<SunaNinjaEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_4.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition4Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_5.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition5Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_6.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition6Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_7.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition7Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_8.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition8Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_9.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition9Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<SunaNinjaEntity, HumanoidModel<SunaNinjaEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/suna_ninja_skin_10.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SunaNinjaEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (SunaNinjaDisplayCondition10Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SunaNinjaEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/anbu_npc_skin_1.png");
	}
}
