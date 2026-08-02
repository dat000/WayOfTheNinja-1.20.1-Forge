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
public class Modelanbu_chestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modelanbu_chestplate"), "main");
	public final ModelPart anbu_chestplate;
	public final ModelPart anbu_right_arm;
	public final ModelPart anbu_left_arm;

	public Modelanbu_chestplate(ModelPart root) {
		this.anbu_chestplate = root.getChild("anbu_chestplate");
		this.anbu_right_arm = root.getChild("anbu_right_arm");
		this.anbu_left_arm = root.getChild("anbu_left_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition anbu_chestplate = partdefinition.addOrReplaceChild("anbu_chestplate",
				CubeListBuilder.create().texOffs(6, 42).addBox(2.0F, 1.0F, -3.05F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-5.0F, 1.0F, -3.05F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 33)
						.addBox(-1.0F, 1.0F, -3.05F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-4.0F, 1.0F, -3.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 11)
						.addBox(-3.0F, -1.0F, -2.6F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 14).addBox(-3.0F, -1.0F, 1.4F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(-4.0F, 1.0F, 2.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.0F, 1.0F, -3.0F, 1.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 11)
						.addBox(3.0F, -1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 42).addBox(3.0F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 14)
						.addBox(3.0F, -2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 42).addBox(3.0F, -2.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 8)
						.addBox(3.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 36).addBox(-5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 33)
						.addBox(-5.0F, -2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 39).addBox(-5.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 42)
						.addBox(-5.0F, -1.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 42).addBox(-5.0F, -2.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-5.0F, 1.0F, -3.0F, 1.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition anbu_right_arm = partdefinition.addOrReplaceChild("anbu_right_arm",
				CubeListBuilder.create().texOffs(30, 31).addBox(-3.0F, 2.0F, -3.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 17).addBox(-3.0F, 2.0F, 2.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-3.8F, 2.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 31).addBox(0.2F, 2.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 5.0F, 0.0F));
		PartDefinition anbu_left_arm = partdefinition.addOrReplaceChild("anbu_left_arm",
				CubeListBuilder.create().texOffs(38, 0).addBox(0.0F, 2.0F, -3.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 25).addBox(0.0F, 2.0F, 2.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(2.8F, 2.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 31).addBox(-1.2F, 2.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 5.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		anbu_chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		anbu_right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		anbu_left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
