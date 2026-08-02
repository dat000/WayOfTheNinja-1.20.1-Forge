package net.mcreator.wayoftheninjaforge.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelforehead<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modelforehead"), "main");
	public final ModelPart foreheadProtector;

	public Modelforehead(ModelPart root) {
		this.foreheadProtector = root.getChild("foreheadProtector");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition foreheadProtector = partdefinition.addOrReplaceChild("foreheadProtector", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -7.0F, -5.1F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.0F, -7.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(-4.0F, -7.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = foreheadProtector.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-4.0F, -2.0F, 1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -5.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = foreheadProtector.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 6).addBox(-4.0F, -2.0F, 1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		foreheadProtector.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
