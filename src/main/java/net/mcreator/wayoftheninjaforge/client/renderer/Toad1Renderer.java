
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.wayoftheninjaforge.entity.Toad1Entity;

public class Toad1Renderer extends MobRenderer<Toad1Entity, OcelotModel<Toad1Entity>> {
	public Toad1Renderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<Toad1Entity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Toad1Entity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/akamaru.png");
	}
}
