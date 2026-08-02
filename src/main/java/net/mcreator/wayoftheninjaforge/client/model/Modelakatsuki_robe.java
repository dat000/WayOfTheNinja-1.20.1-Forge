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
public class Modelakatsuki_robe<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modelakatsuki_robe"), "main");
	public final ModelPart akatsuki_robe;
	public final ModelPart r;
	public final ModelPart l;

	public Modelakatsuki_robe(ModelPart root) {
		this.akatsuki_robe = root.getChild("akatsuki_robe");
		this.r = root.getChild("r");
		this.l = root.getChild("l");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition akatsuki_robe = partdefinition.addOrReplaceChild("akatsuki_robe",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(4.0F, -3.0F, -2.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-5.0F, -3.0F, -2.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 10).addBox(-4.0F, -3.0F, 4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 14)
						.addBox(-4.0F, 0.0F, 3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-3, 10)
						.addBox(-4.0F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-3, 10).addBox(3.0F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition r = partdefinition.addOrReplaceChild("r",
				CubeListBuilder.create().texOffs(38, 16).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(1.0F, -2.0F, -3.0F, 1.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 10)
						.addBox(-3.0F, -2.0F, -3.0F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 25).addBox(-3.0F, -2.0F, 2.0F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-4.0F, -2.0F, -2.0F, 1.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition l = partdefinition.addOrReplaceChild("l",
				CubeListBuilder.create().texOffs(10, 36).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 18).addBox(3.0F, -2.0F, -2.0F, 1.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(-2.0F, -2.0F, -3.0F, 1.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 36).addBox(-1.0F, -2.0F, 2.0F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 21)
						.addBox(-1.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		akatsuki_robe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
