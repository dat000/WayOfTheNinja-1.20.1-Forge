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
public class Modelsamurai_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modelsamurai_boots"), "main");
	public final ModelPart samurai_boots;
	public final ModelPart r;
	public final ModelPart l;

	public Modelsamurai_boots(ModelPart root) {
		this.samurai_boots = root.getChild("samurai_boots");
		this.r = this.samurai_boots.getChild("r");
		this.l = this.samurai_boots.getChild("l");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition samurai_boots = partdefinition.addOrReplaceChild("samurai_boots", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition r = samurai_boots.addOrReplaceChild("r",
				CubeListBuilder.create().texOffs(14, 22).addBox(-2.1F, 2.0F, -4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 24).addBox(-3.1F, 2.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(-2.1F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-2.1F, 6.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-4.1F, 3.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 15).addBox(-3.1F, 3.0F, 3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-2.1F, 6.0F, 2.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.1F, 6.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
						.addBox(0.9F, 6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, -12.0F, 0.0F));
		PartDefinition l = samurai_boots.addOrReplaceChild("l",
				CubeListBuilder.create().texOffs(14, 18).addBox(-1.9F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 5).addBox(-1.9F, 6.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(-1.9F, 2.0F, -4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 7).addBox(-1.9F, 6.0F, 2.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(2.1F, 6.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(2, 14).addBox(-1.9F, 6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 27)
						.addBox(2.1F, 2.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 10).addBox(3.1F, 3.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 17)
						.addBox(-1.9F, 3.0F, 3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, -12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		samurai_boots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
