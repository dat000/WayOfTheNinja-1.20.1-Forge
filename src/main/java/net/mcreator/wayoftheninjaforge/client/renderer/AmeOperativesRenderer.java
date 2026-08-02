
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

import net.mcreator.wayoftheninjaforge.procedures.AmeOperativesDisplayCondition3Procedure;
import net.mcreator.wayoftheninjaforge.procedures.AmeOperativesDisplayCondition2Procedure;
import net.mcreator.wayoftheninjaforge.procedures.AmeOperativesDisplayCondition1Procedure;
import net.mcreator.wayoftheninjaforge.entity.AmeOperativesEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AmeOperativesRenderer extends HumanoidMobRenderer<AmeOperativesEntity, HumanoidModel<AmeOperativesEntity>> {
	public AmeOperativesRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<AmeOperativesEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<AmeOperativesEntity, HumanoidModel<AmeOperativesEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/ame_operatives_skin_1.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AmeOperativesEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AmeOperativesDisplayCondition1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AmeOperativesEntity, HumanoidModel<AmeOperativesEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/ame_operatives_skin_2.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AmeOperativesEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AmeOperativesDisplayCondition2Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<AmeOperativesEntity, HumanoidModel<AmeOperativesEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/ame_operatives_skin_3.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, AmeOperativesEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (AmeOperativesDisplayCondition3Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AmeOperativesEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/ame_operatives_skin_1.png");
	}
}
