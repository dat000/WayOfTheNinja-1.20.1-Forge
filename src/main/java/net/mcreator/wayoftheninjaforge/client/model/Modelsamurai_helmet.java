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
public class Modelsamurai_helmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modelsamurai_helmet"), "main");
	public final ModelPart samurai_helmet;

	public Modelsamurai_helmet(ModelPart root) {
		this.samurai_helmet = root.getChild("samurai_helmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition samurai_helmet = partdefinition.addOrReplaceChild("samurai_helmet",
				CubeListBuilder.create().texOffs(18, 44).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(4.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(5.0F, -5.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(18, 25).addBox(-6.0F, -5.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 20)
						.addBox(-7.0F, -3.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 30).addBox(6.0F, -3.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(18, 9)
						.addBox(-5.0F, -8.0F, -5.3F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 37).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 37)
						.addBox(-4.0F, -5.0F, 5.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-5.0F, -5.0F, 4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 44)
						.addBox(4.0F, -5.0F, 4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 40)
						.addBox(-4.0F, -9.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 46).addBox(-2.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 47)
						.addBox(0.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 5).addBox(1.0F, -5.0F, -5.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 49)
						.addBox(-1.0F, -5.0F, -5.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 49).addBox(-4.0F, -5.0F, -5.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 49)
						.addBox(-3.0F, -6.0F, -5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 49).addBox(2.0F, -6.0F, -5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 49)
						.addBox(3.0F, -5.0F, -5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 49).addBox(3.0F, -4.0F, -5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 49)
						.addBox(4.0F, -4.0F, -5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 49).addBox(2.0F, -3.0F, -5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 43)
						.addBox(1.0F, -3.0F, -5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 45).addBox(-2.0F, -3.0F, -5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 47)
						.addBox(-3.0F, -3.0F, -5.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 49).addBox(-4.0F, -3.0F, -5.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 47)
						.addBox(-3.0F, -5.0F, -5.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 47).addBox(3.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 48)
						.addBox(-5.0F, -6.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 44).addBox(-6.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 44)
						.addBox(-7.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 44).addBox(5.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(7.0F, -1.0F, -5.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(36, 10).addBox(-8.0F, -1.0F, -5.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(18, 49)
						.addBox(-7.0F, -1.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 50).addBox(5.0F, -1.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-6.0F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 50).addBox(4.0F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 42)
						.addBox(-4.0F, -1.0F, 6.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(4.0F, -5.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 46)
						.addBox(-1.0F, -3.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 48).addBox(2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 48)
						.addBox(-4.0F, -1.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 48).addBox(-5.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(3.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		samurai_helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
