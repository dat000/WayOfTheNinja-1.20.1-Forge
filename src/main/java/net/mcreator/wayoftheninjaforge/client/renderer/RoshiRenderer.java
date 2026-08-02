
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.wayoftheninjaforge.entity.RoshiEntity;

public class RoshiRenderer extends HumanoidMobRenderer<RoshiEntity, HumanoidModel<RoshiEntity>> {
	public RoshiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<RoshiEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RoshiEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/roshi_skin.png");
	}
}
