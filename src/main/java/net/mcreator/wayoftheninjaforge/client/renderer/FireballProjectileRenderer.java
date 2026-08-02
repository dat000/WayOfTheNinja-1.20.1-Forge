package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.wayoftheninjaforge.entity.FireballProjectileEntity;
import net.mcreator.wayoftheninjaforge.client.model.Modelfireball_jutsu;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FireballProjectileRenderer extends EntityRenderer<FireballProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/fireball_texture.png");
	private final Modelfireball_jutsu model;

	public FireballProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelfireball_jutsu(context.bakeLayer(Modelfireball_jutsu.LAYER_LOCATION));
	}

	@Override
	public void render(FireballProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(FireballProjectileEntity entity) {
		return texture;
	}
}
