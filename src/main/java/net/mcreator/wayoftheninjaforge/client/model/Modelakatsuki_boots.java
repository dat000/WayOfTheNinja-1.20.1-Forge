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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelakatsuki_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modelakatsuki_boots"), "main");
	public final ModelPart jounin_boots;
	public final ModelPart left;
	public final ModelPart right;

	public Modelakatsuki_boots(ModelPart root) {
		this.jounin_boots = root.getChild("jounin_boots");
		this.left = this.jounin_boots.getChild("left");
		this.right = this.jounin_boots.getChild("right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition jounin_boots = partdefinition.addOrReplaceChild("jounin_boots", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition left = jounin_boots.addOrReplaceChild("left",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 10.0F, -3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-3.0F, 8.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-3.0F, 8.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 21).addBox(2.0F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 21)
						.addBox(-3.0F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(-3.0F, 10.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 3)
						.addBox(2.0F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 9).addBox(-3.0F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.8F, 0.0F, 0.0F));
		PartDefinition right = jounin_boots.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(0, 12).addBox(-2.8F, 10.0F, -3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-2.8F, 8.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-2.8F, 8.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 3).addBox(2.2F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 8)
						.addBox(-2.8F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-2.8F, 10.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 15)
						.addBox(2.2F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-2.8F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		jounin_boots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
