
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.wayoftheninjaforge.entity.NarutoEntity;

public class NarutoRenderer extends HumanoidMobRenderer<NarutoEntity, HumanoidModel<NarutoEntity>> {
	public NarutoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<NarutoEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(NarutoEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/naruto_npc.png");
	}
}
