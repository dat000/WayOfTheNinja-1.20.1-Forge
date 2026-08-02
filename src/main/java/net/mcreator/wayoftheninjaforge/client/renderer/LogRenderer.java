
package net.mcreator.wayoftheninjaforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.wayoftheninjaforge.entity.LogEntity;
import net.mcreator.wayoftheninjaforge.client.model.animations.kleiders_logAnimation;
import net.mcreator.wayoftheninjaforge.client.model.Modelkleiders_log;

import com.mojang.blaze3d.vertex.PoseStack;

public class LogRenderer extends MobRenderer<LogEntity, Modelkleiders_log<LogEntity>> {
	public LogRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelkleiders_log.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(LogEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LogEntity entity) {
		return new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/log_texture.png");
	}

	private static final class AnimatedModel extends Modelkleiders_log<LogEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<LogEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(LogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, kleiders_logAnimation.log_test, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(LogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
