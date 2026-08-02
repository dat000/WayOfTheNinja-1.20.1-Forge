
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.wayoftheninjaforge.entity.RockleeEntity;

public class RockleeRenderer extends HumanoidMobRenderer<RockleeEntity, HumanoidModel<RockleeEntity>> {
	public RockleeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<RockleeEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RockleeEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/5e0ee42517d26ddf.png");
	}
}
