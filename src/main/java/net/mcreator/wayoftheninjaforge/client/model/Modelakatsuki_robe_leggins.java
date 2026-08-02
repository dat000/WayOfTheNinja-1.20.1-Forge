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
public class Modelakatsuki_robe_leggins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modelakatsuki_robe_leggins"), "main");
	public final ModelPart l;
	public final ModelPart r;

	public Modelakatsuki_robe_leggins(ModelPart root) {
		this.l = root.getChild("l");
		this.r = root.getChild("r");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition l = partdefinition.addOrReplaceChild("l",
				CubeListBuilder.create().texOffs(20, 0).addBox(-1.9F, 0.0F, -3.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 10).addBox(-1.9F, 0.0F, 2.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(-1.9F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.1F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition r = partdefinition.addOrReplaceChild("r",
				CubeListBuilder.create().texOffs(0, 26).addBox(-2.1F, 0.0F, -3.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 20).addBox(-2.1F, 0.0F, 2.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(0.9F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 0).addBox(-3.1F, 0.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
