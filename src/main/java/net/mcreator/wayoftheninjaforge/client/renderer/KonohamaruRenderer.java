
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.wayoftheninjaforge.entity.KonohamaruEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class KonohamaruRenderer extends HumanoidMobRenderer<KonohamaruEntity, HumanoidModel<KonohamaruEntity>> {
	public KonohamaruRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<KonohamaruEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(KonohamaruEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.7f, 0.7f, 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(KonohamaruEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/konohamaru_skin.png");
	}
}
