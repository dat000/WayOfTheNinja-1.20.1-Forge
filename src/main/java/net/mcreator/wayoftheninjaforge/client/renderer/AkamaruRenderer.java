
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wayoftheninjaforge.entity.AkamaruEntity;
import net.mcreator.wayoftheninjaforge.client.model.Modelakamaru;

import com.mojang.blaze3d.vertex.PoseStack;

public class AkamaruRenderer extends MobRenderer<AkamaruEntity, Modelakamaru<AkamaruEntity>> {
	public AkamaruRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelakamaru<AkamaruEntity>(context.bakeLayer(Modelakamaru.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(AkamaruEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.1f, 1.1f, 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(AkamaruEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/akamaru.png");
	}
}
