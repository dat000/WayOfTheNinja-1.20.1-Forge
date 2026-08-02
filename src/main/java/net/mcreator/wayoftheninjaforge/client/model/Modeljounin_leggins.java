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
public class Modeljounin_leggins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modeljounin_leggins"), "main");
	public final ModelPart jounin_leggins;
	public final ModelPart left;
	public final ModelPart right;

	public Modeljounin_leggins(ModelPart root) {
		this.jounin_leggins = root.getChild("jounin_leggins");
		this.left = this.jounin_leggins.getChild("left");
		this.right = this.jounin_leggins.getChild("right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition jounin_leggins = partdefinition.addOrReplaceChild("jounin_leggins", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left = jounin_leggins.addOrReplaceChild("left",
				CubeListBuilder.create().texOffs(20, 13).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 22).addBox(-2.0F, 0.0F, 2.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(10, 13).addBox(-2.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, -12.0F, 0.0F));
		PartDefinition right = jounin_leggins.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(12, 0).addBox(-3.2F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-2.2F, 0.0F, 2.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-2.2F, 0.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, -12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		jounin_leggins.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
