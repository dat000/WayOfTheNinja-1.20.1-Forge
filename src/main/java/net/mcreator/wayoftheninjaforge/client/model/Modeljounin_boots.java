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
public class Modeljounin_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modeljounin_boots"), "main");
	public final ModelPart jounin_boots;
	public final ModelPart left;
	public final ModelPart right;

	public Modeljounin_boots(ModelPart root) {
		this.jounin_boots = root.getChild("jounin_boots");
		this.left = this.jounin_boots.getChild("left");
		this.right = this.jounin_boots.getChild("right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition jounin_boots = partdefinition.addOrReplaceChild("jounin_boots", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition left = jounin_boots.addOrReplaceChild("left",
				CubeListBuilder.create().texOffs(14, 0).addBox(-3.0F, 10.0F, -3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 15).addBox(-3.0F, 8.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 6)
						.addBox(-3.0F, 8.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 19).addBox(2.0F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 9)
						.addBox(2.0F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-3.0F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 5.0F, 2.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-3.0F, 5.0F, -3.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 24)
						.addBox(-3.0F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 3).addBox(-3.0F, 10.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 26)
						.addBox(2.0F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 26).addBox(-3.0F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.8F, 0.0F, 0.0F));
		PartDefinition right = jounin_boots.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(24, 9).addBox(-2.8F, 10.0F, -3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 17).addBox(-2.8F, 8.0F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 12)
						.addBox(-2.8F, 8.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 32).addBox(2.2F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 32)
						.addBox(-2.8F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 19).addBox(2.2F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-2.8F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(-2.8F, 5.0F, 2.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.8F, 5.0F, -3.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 16).addBox(-2.8F, 10.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(2.2F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-2.8F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
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
