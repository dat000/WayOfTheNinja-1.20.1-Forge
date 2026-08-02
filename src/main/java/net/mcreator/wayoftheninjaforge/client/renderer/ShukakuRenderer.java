
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.wayoftheninjaforge.entity.ShukakuEntity;
import net.mcreator.wayoftheninjaforge.client.model.animations.shukakuAnimation;
import net.mcreator.wayoftheninjaforge.client.model.Modelshukaku;

import com.mojang.blaze3d.vertex.PoseStack;

public class ShukakuRenderer extends MobRenderer<ShukakuEntity, Modelshukaku<ShukakuEntity>> {
	public ShukakuRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelshukaku.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(ShukakuEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(20f, 20f, 20f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShukakuEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/shukaku.png");
	}

	private static final class AnimatedModel extends Modelshukaku<ShukakuEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ShukakuEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ShukakuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, shukakuAnimation.idle, ageInTicks, 1f);
				this.animate(entity.animationState1, shukakuAnimation.dark_ball_charging, ageInTicks, 1f);
				this.animate(entity.animationState2, shukakuAnimation.walk_cycle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ShukakuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
