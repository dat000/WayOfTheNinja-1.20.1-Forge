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

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelshukaku<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "modelshukaku"), "main");
	public final ModelPart tail;
	public final ModelPart tail_1;
	public final ModelPart tail_2;
	public final ModelPart tail_3;
	public final ModelPart tail_4;
	public final ModelPart torso;
	public final ModelPart right_arm;
	public final ModelPart hombro;
	public final ModelPart brazosuperior;
	public final ModelPart antebrazo;
	public final ModelPart mano;
	public final ModelPart dedos;
	public final ModelPart right_dedo_2;
	public final ModelPart right_longdedo_2_;
	public final ModelPart right_dedo_3;
	public final ModelPart right_longdedo_3;
	public final ModelPart right_dedo_4;
	public final ModelPart right_longdedo_4;
	public final ModelPart right_dedo_5;
	public final ModelPart right_longdedo_5;
	public final ModelPart right_dedo_1;
	public final ModelPart right_longdedo_1;
	public final ModelPart left_arm;
	public final ModelPart hombro2;
	public final ModelPart brazosuperior2;
	public final ModelPart antebrazo2;
	public final ModelPart mano2;
	public final ModelPart dedos2;
	public final ModelPart left_dedo_1;
	public final ModelPart left_longdedo_1;
	public final ModelPart left_dedo_2;
	public final ModelPart left_longdedo_2;
	public final ModelPart left_dedo_3;
	public final ModelPart left_longdedo_3;
	public final ModelPart left_dedo_4;
	public final ModelPart left_longdedo_4;
	public final ModelPart left_dedo_5;
	public final ModelPart left_longdedo_5;
	public final ModelPart head;
	public final ModelPart right_leg;
	public final ModelPart antepierna2;
	public final ModelPart right_foot;
	public final ModelPart left_leg;
	public final ModelPart antepierna;
	public final ModelPart left_ffoot;
	public final ModelPart dark_ball;

	public Modelshukaku(ModelPart root) {
		this.tail = root.getChild("tail");
		this.tail_1 = this.tail.getChild("tail_1");
		this.tail_2 = this.tail_1.getChild("tail_2");
		this.tail_3 = this.tail_2.getChild("tail_3");
		this.tail_4 = this.tail_3.getChild("tail_4");
		this.torso = root.getChild("torso");
		this.right_arm = root.getChild("right_arm");
		this.hombro = this.right_arm.getChild("hombro");
		this.brazosuperior = this.hombro.getChild("brazosuperior");
		this.antebrazo = this.brazosuperior.getChild("antebrazo");
		this.mano = this.antebrazo.getChild("mano");
		this.dedos = this.mano.getChild("dedos");
		this.right_dedo_2 = this.dedos.getChild("right_dedo_2");
		this.right_longdedo_2_ = this.right_dedo_2.getChild("right_longdedo_2_");
		this.right_dedo_3 = this.dedos.getChild("right_dedo_3");
		this.right_longdedo_3 = this.right_dedo_3.getChild("right_longdedo_3");
		this.right_dedo_4 = this.dedos.getChild("right_dedo_4");
		this.right_longdedo_4 = this.right_dedo_4.getChild("right_longdedo_4");
		this.right_dedo_5 = this.dedos.getChild("right_dedo_5");
		this.right_longdedo_5 = this.right_dedo_5.getChild("right_longdedo_5");
		this.right_dedo_1 = this.dedos.getChild("right_dedo_1");
		this.right_longdedo_1 = this.right_dedo_1.getChild("right_longdedo_1");
		this.left_arm = root.getChild("left_arm");
		this.hombro2 = this.left_arm.getChild("hombro2");
		this.brazosuperior2 = this.hombro2.getChild("brazosuperior2");
		this.antebrazo2 = this.brazosuperior2.getChild("antebrazo2");
		this.mano2 = this.antebrazo2.getChild("mano2");
		this.dedos2 = this.mano2.getChild("dedos2");
		this.left_dedo_1 = this.dedos2.getChild("left_dedo_1");
		this.left_longdedo_1 = this.left_dedo_1.getChild("left_longdedo_1");
		this.left_dedo_2 = this.dedos2.getChild("left_dedo_2");
		this.left_longdedo_2 = this.left_dedo_2.getChild("left_longdedo_2");
		this.left_dedo_3 = this.dedos2.getChild("left_dedo_3");
		this.left_longdedo_3 = this.left_dedo_3.getChild("left_longdedo_3");
		this.left_dedo_4 = this.dedos2.getChild("left_dedo_4");
		this.left_longdedo_4 = this.left_dedo_4.getChild("left_longdedo_4");
		this.left_dedo_5 = this.dedos2.getChild("left_dedo_5");
		this.left_longdedo_5 = this.left_dedo_5.getChild("left_longdedo_5");
		this.head = root.getChild("head");
		this.right_leg = root.getChild("right_leg");
		this.antepierna2 = this.right_leg.getChild("antepierna2");
		this.right_foot = this.antepierna2.getChild("right_foot");
		this.left_leg = root.getChild("left_leg");
		this.antepierna = this.left_leg.getChild("antepierna");
		this.left_ffoot = this.antepierna.getChild("left_ffoot");
		this.dark_ball = root.getChild("dark_ball");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(2.0F, -23.0F, 22.0F));
		PartDefinition tail_1 = tail.addOrReplaceChild("tail_1", CubeListBuilder.create(), PartPose.offset(-3.0F, 45.0F, -10.0F));
		PartDefinition cube_r1 = tail_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(154, 67).addBox(-5.0F, -14.0F, 0.0F, 13.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 10.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r2 = tail_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(126, 137).addBox(-5.0F, -16.0F, 0.0F, 13.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition tail_2 = tail_1.addOrReplaceChild("tail_2", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0F, 18.0F));
		PartDefinition cube_r3 = tail_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(152, 51).addBox(-8.0F, -14.0F, 0.0F, 20.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 5.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r4 = tail_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(152, 97).addBox(-6.0F, -14.0F, 0.0F, 16.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));
		PartDefinition tail_3 = tail_2.addOrReplaceChild("tail_3", CubeListBuilder.create(), PartPose.offset(-4.2F, -63.4F, -4.0F));
		PartDefinition cube_r5 = tail_3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(152, 36).addBox(-8.0F, -12.0F, 1.0F, 20.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2F, 48.4F, 9.0F, 1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r6 = tail_3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 20).addBox(-31.0F, -14.0F, -2.0F, 39.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 15.8F, 0.4F, 1.5708F, 0.1745F, -1.5708F));
		PartDefinition cube_r7 = tail_3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 132).addBox(-8.0F, -11.0F, 1.0F, 20.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4F, 29.6F, 5.0F, 1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r8 = tail_3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(108, 20).addBox(-10.0F, -11.0F, 1.0F, 24.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2F, 40.4F, 7.0F, 1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r9 = tail_3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-33.0F, -11.0F, -2.0F, 41.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 14.8F, 7.4F, 1.5708F, 0.1745F, -1.5708F));
		PartDefinition cube_r10 = tail_3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(132, 115).addBox(-3.0F, -11.0F, -3.0F, 11.0F, 5.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 14.8F, 2.4F, 1.5708F, 0.1745F, -1.5708F));
		PartDefinition tail_4 = tail_3.addOrReplaceChild("tail_4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r11 = tail_4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(210, 36).addBox(-1.0F, -11.0F, 1.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 6.0F, 5.8F, 1.5708F, 0.1745F, -1.5708F));
		PartDefinition cube_r12 = tail_4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(208, 51).addBox(-1.0F, -14.0F, 1.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 6.8F, -0.6F, 1.5708F, 0.1745F, -1.5708F));
		PartDefinition cube_r13 = tail_4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(196, 164).addBox(-1.0F, -11.0F, 1.0F, 12.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 7.9F, 1.2F, 1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r14 = tail_4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(210, 130).addBox(3.0F, -10.0F, 1.0F, 7.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7453F, 0.0F, 0.0F));
		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(-1.0F, 4.0F, -3.0F));
		PartDefinition cube_r15 = torso.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(212, 207).addBox(-4.0F, -2.0F, 12.0F, 11.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r16 = torso.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(38, 201).addBox(4.0F, -2.0F, 5.0F, 3.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(148, 191).addBox(-11.0F, -2.0F, 5.0F, 4.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -0.8F, -12.7F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r17 = torso.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(188, 115).addBox(-7.0F, -11.0F, 8.0F, 16.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, -12.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r18 = torso.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(148, 207).addBox(-7.0F, -10.0F, 8.0F, 16.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -10.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r19 = torso.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(154, 88).addBox(5.0F, -5.0F, 7.0F, 22.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, 3.3F, -13.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r20 = torso.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(82, 97).addBox(-10.0F, -5.0F, -1.0F, 22.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7F, -4.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r21 = torso.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 102).addBox(-9.0F, -5.0F, -1.0F, 20.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.3F, -2.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r22 = torso.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(80, 40).addBox(-10.0F, -5.0F, -1.0F, 22.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r23 = torso.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 80).addBox(-11.0F, -3.0F, -4.0F, 24.0F, 5.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 2.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r24 = torso.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(112, 0).addBox(-10.0F, -5.0F, 0.0F, 22.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 4.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.0F, 3.0F, -1.0F, -1.954F, 0.5427F, -1.1752F));
		PartDefinition hombro = right_arm.addOrReplaceChild("hombro", CubeListBuilder.create(), PartPose.offset(3.0F, -2.0F, 0.0F));
		PartDefinition hombro_r1 = hombro.addOrReplaceChild("hombro_r1", CubeListBuilder.create().texOffs(180, 0).addBox(-5.0F, -7.0F, 1.0F, 9.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.0F, -1.0F, 0.3131F, 0.3535F, -0.4624F));
		PartDefinition brazosuperior = hombro.addOrReplaceChild("brazosuperior", CubeListBuilder.create(), PartPose.offset(-3.0F, 2.0F, -3.0F));
		PartDefinition hombro_r2 = brazosuperior.addOrReplaceChild("hombro_r2", CubeListBuilder.create().texOffs(186, 191).addBox(9.0F, -5.0F, -5.0F, 9.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 6.0F, 7.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition antebrazo = brazosuperior.addOrReplaceChild("antebrazo", CubeListBuilder.create(), PartPose.offset(-3.0F, 5.0F, -8.0F));
		PartDefinition hombro_r3 = antebrazo.addOrReplaceChild("hombro_r3", CubeListBuilder.create().texOffs(74, 202).addBox(7.0F, -3.0F, -11.0F, 8.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 1.0F, 11.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition mano = antebrazo.addOrReplaceChild("mano", CubeListBuilder.create(), PartPose.offset(-3.0F, 5.0F, -8.0F));
		PartDefinition hombro_r4 = mano.addOrReplaceChild("hombro_r4",
				CubeListBuilder.create().texOffs(176, 150).addBox(4.0F, -2.0F, -21.0F, 13.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(196, 67).addBox(5.0F, -4.0F, -21.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 19.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition dedos = mano.addOrReplaceChild("dedos", CubeListBuilder.create(), PartPose.offset(-3.0F, 5.0F, -6.0F));
		PartDefinition right_dedo_2 = dedos.addOrReplaceChild("right_dedo_2", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, -2.0F));
		PartDefinition hombro_r5 = right_dedo_2.addOrReplaceChild("hombro_r5",
				CubeListBuilder.create().texOffs(228, 113).addBox(13.0F, -1.0F, -33.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(218, 7).addBox(13.0F, -2.0F, -27.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -8.0F, 27.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_longdedo_2_ = right_dedo_2.addOrReplaceChild("right_longdedo_2_", CubeListBuilder.create(), PartPose.offset(-3.0F, 5.0F, -7.0F));
		PartDefinition hombro_r6 = right_longdedo_2_.addOrReplaceChild("hombro_r6",
				CubeListBuilder.create().texOffs(140, 36).addBox(13.0F, -1.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 180).addBox(13.0F, 0.0F, -38.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, 34.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_dedo_3 = dedos.addOrReplaceChild("right_dedo_3", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.0F, -2.0F));
		PartDefinition hombro_r7 = right_dedo_3.addOrReplaceChild("hombro_r7",
				CubeListBuilder.create().texOffs(120, 227).addBox(10.0F, -1.0F, -33.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(136, 220).addBox(10.0F, -2.0F, -27.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 27.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_longdedo_3 = right_dedo_3.addOrReplaceChild("right_longdedo_3", CubeListBuilder.create(), PartPose.offset(-4.0F, 3.0F, -6.0F));
		PartDefinition hombro_r8 = right_longdedo_3.addOrReplaceChild("hombro_r8",
				CubeListBuilder.create().texOffs(132, 36).addBox(10.0F, -1.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 180).addBox(10.0F, 0.0F, -38.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -13.0F, 33.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_dedo_4 = dedos.addOrReplaceChild("right_dedo_4", CubeListBuilder.create(), PartPose.offset(-4.0F, 1.0F, 0.0F));
		PartDefinition hombro_r9 = right_dedo_4.addOrReplaceChild("hombro_r9",
				CubeListBuilder.create().texOffs(104, 227).addBox(7.0F, -1.0F, -33.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(152, 220).addBox(7.0F, -2.0F, -27.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -10.0F, 25.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_longdedo_4 = right_dedo_4.addOrReplaceChild("right_longdedo_4", CubeListBuilder.create(), PartPose.offset(-3.0F, 4.0F, -6.0F));
		PartDefinition hombro_r10 = right_longdedo_4.addOrReplaceChild("hombro_r10",
				CubeListBuilder.create().texOffs(96, 180).addBox(7.0F, 0.0F, -38.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(124, 36).addBox(7.0F, -1.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -14.0F, 31.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_dedo_5 = dedos.addOrReplaceChild("right_dedo_5", CubeListBuilder.create(), PartPose.offset(-5.0F, 1.0F, 4.0F));
		PartDefinition hombro_r11 = right_dedo_5.addOrReplaceChild("hombro_r11",
				CubeListBuilder.create().texOffs(88, 226).addBox(4.0F, -1.0F, -33.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(168, 220).addBox(4.0F, -2.0F, -27.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -10.0F, 21.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_longdedo_5 = right_dedo_5.addOrReplaceChild("right_longdedo_5", CubeListBuilder.create(), PartPose.offset(-4.0F, 6.0F, -9.0F));
		PartDefinition hombro_r12 = right_longdedo_5.addOrReplaceChild("hombro_r12",
				CubeListBuilder.create().texOffs(104, 180).addBox(4.0F, 0.0F, -38.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(116, 36).addBox(4.0F, -1.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -16.0F, 30.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_dedo_1 = dedos.addOrReplaceChild("right_dedo_1", CubeListBuilder.create(), PartPose.offset(7.0F, -5.0F, 0.0F));
		PartDefinition hombro_r13 = right_dedo_1.addOrReplaceChild("hombro_r13",
				CubeListBuilder.create().texOffs(224, 199).addBox(17.0F, -1.0F, -29.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(222, 150).addBox(17.0F, -2.0F, -23.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -4.0F, 25.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition right_longdedo_1 = right_dedo_1.addOrReplaceChild("right_longdedo_1", CubeListBuilder.create(), PartPose.offset(-4.0F, 7.0F, -11.0F));
		PartDefinition hombro_r14 = right_longdedo_1.addOrReplaceChild("hombro_r14",
				CubeListBuilder.create().texOffs(222, 160).addBox(17.0F, 0.0F, -34.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(108, 36).addBox(17.0F, -1.0F, -32.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -11.0F, 36.0F, 0.3481F, 0.56F, -0.3836F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(14.0F, 3.0F, -1.0F, -1.954F, -0.5427F, 1.1752F));
		PartDefinition hombro2 = left_arm.addOrReplaceChild("hombro2", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.0F, 2.0F));
		PartDefinition cube_r25 = hombro2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(38, 184).addBox(-4.0F, -7.0F, 1.0F, 9.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 3.0F, -3.0F, 0.3131F, -0.3535F, 0.4624F));
		PartDefinition brazosuperior2 = hombro2.addOrReplaceChild("brazosuperior2", CubeListBuilder.create(), PartPose.offset(1.0F, 3.0F, -6.0F));
		PartDefinition cube_r26 = brazosuperior2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 193).addBox(-18.0F, -5.0F, -5.0F, 9.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 5.0F, 8.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition antebrazo2 = brazosuperior2.addOrReplaceChild("antebrazo2", CubeListBuilder.create(), PartPose.offset(4.0F, 4.0F, -6.0F));
		PartDefinition cube_r27 = antebrazo2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(202, 79).addBox(-15.0F, -3.0F, -11.0F, 8.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 1.0F, 10.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition mano2 = antebrazo2.addOrReplaceChild("mano2", CubeListBuilder.create(), PartPose.offset(4.0F, 5.0F, -9.0F));
		PartDefinition cube_r28 = mano2.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(194, 177).addBox(-16.0F, -4.0F, -21.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(148, 177).addBox(-17.0F, -2.0F, -21.0F, 13.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -4.0F, 19.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition dedos2 = mano2.addOrReplaceChild("dedos2", CubeListBuilder.create(), PartPose.offset(1.0F, 9.0F, -8.0F));
		PartDefinition left_dedo_1 = dedos2.addOrReplaceChild("left_dedo_1", CubeListBuilder.create(), PartPose.offset(-6.0F, -9.0F, 2.0F));
		PartDefinition cube_r29 = left_dedo_1.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(228, 121).addBox(-19.0F, -1.0F, -29.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 137).addBox(-19.0F, -2.0F, -23.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -4.0F, 25.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_longdedo_1 = left_dedo_1.addOrReplaceChild("left_longdedo_1", CubeListBuilder.create(), PartPose.offset(3.0F, 6.0F, -9.0F));
		PartDefinition cube_r30 = left_longdedo_1.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(24, 236).addBox(-18.0F, 0.0F, -34.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(176, 235).addBox(-18.0F, -1.0F, -32.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -10.0F, 34.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_dedo_2 = dedos2.addOrReplaceChild("left_dedo_2", CubeListBuilder.create(), PartPose.offset(-2.0F, -5.0F, 0.0F));
		PartDefinition cube_r31 = left_dedo_2.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(152, 230).addBox(-15.0F, -1.0F, -33.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 226).addBox(-15.0F, -2.0F, -27.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -8.0F, 27.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_longdedo_2 = left_dedo_2.addOrReplaceChild("left_longdedo_2", CubeListBuilder.create(), PartPose.offset(4.0F, 6.0F, -9.0F));
		PartDefinition cube_r32 = left_longdedo_2.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(236, 98).addBox(-14.0F, 0.0F, -38.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(236, 102).addBox(-14.0F, -1.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -14.0F, 36.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_dedo_3 = dedos2.addOrReplaceChild("left_dedo_3", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 1.0F));
		PartDefinition cube_r33 = left_dedo_3.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(136, 230).addBox(-12.0F, -1.0F, -33.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 226).addBox(-12.0F, -2.0F, -27.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -9.0F, 26.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_longdedo_3 = left_dedo_3.addOrReplaceChild("left_longdedo_3", CubeListBuilder.create(), PartPose.offset(4.0F, 5.0F, -7.0F));
		PartDefinition cube_r34 = left_longdedo_3.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(236, 94).addBox(-11.0F, 0.0F, -38.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 236).addBox(-11.0F, -1.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -14.0F, 33.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_dedo_4 = dedos2.addOrReplaceChild("left_dedo_4", CubeListBuilder.create(), PartPose.offset(3.0F, -4.0F, 3.0F));
		PartDefinition cube_r35 = left_dedo_4.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(228, 228).addBox(-9.0F, -1.0F, -33.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 226).addBox(-9.0F, -2.0F, -27.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -9.0F, 24.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_longdedo_4 = left_dedo_4.addOrReplaceChild("left_longdedo_4", CubeListBuilder.create(), PartPose.offset(4.0F, 6.0F, -8.0F));
		PartDefinition cube_r36 = left_longdedo_4.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(48, 236).addBox(-8.0F, 0.0F, -38.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 236).addBox(-8.0F, -1.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -15.0F, 32.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_dedo_5 = dedos2.addOrReplaceChild("left_dedo_5", CubeListBuilder.create(), PartPose.offset(5.0F, -3.0F, 5.0F));
		PartDefinition cube_r37 = left_dedo_5.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(212, 228).addBox(-6.0F, -1.0F, -33.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 189).addBox(-6.0F, -2.0F, -27.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -10.0F, 22.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition left_longdedo_5 = left_dedo_5.addOrReplaceChild("left_longdedo_5", CubeListBuilder.create(), PartPose.offset(4.0F, 6.0F, -9.0F));
		PartDefinition cube_r38 = left_longdedo_5.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(32, 236).addBox(-5.0F, 0.0F, -38.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 236).addBox(-5.0F, -1.0F, -36.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -16.0F, 31.0F, 0.3481F, -0.56F, 0.3836F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(1.0F, 2.0F, -12.0F));
		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 209).addBox(5.0F, -4.0F, 3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 2.0F, -9.0F, 0.4456F, -0.1974F, -0.0934F));
		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(114, 153).addBox(5.0F, -4.0F, 3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 3.0F, -9.0F, 0.4456F, -0.1974F, -0.0934F));
		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(114, 158).addBox(4.0F, -4.0F, 3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 1.0F, -7.0F, 0.4456F, 0.1974F, 0.0934F));
		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(114, 148).addBox(4.0F, -4.0F, 3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 2.0F, -7.0F, 0.4456F, 0.1974F, 0.0934F));
		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(74, 226).addBox(5.0F, -6.0F, 5.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(68, 102)
				.addBox(-5.0F, -6.0F, 5.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(76, 184).addBox(-4.0F, -7.0F, 2.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.0F, -6.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(218, 0).addBox(-3.0F, -7.0F, 9.0F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 6.0F, -4.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(188, 130).addBox(-3.0F, -8.0F, 9.0F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 15.0F, -13.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(216, 17).addBox(-4.0F, -8.0F, 9.0F, 11.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 13.0F, -12.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-10.0F, 18.0F, 2.0F));
		PartDefinition antepierna2 = right_leg.addOrReplaceChild("antepierna2",
				CubeListBuilder.create().texOffs(90, 217).addBox(-1.0F, -5.0F, -2.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 217).addBox(-2.0F, -2.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition right_foot = antepierna2.addOrReplaceChild("right_foot",
				CubeListBuilder.create().texOffs(40, 138).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(168, 230).addBox(-1.8F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(136, 214)
						.addBox(-3.0F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(176, 230).addBox(-0.6F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(184, 231)
						.addBox(0.6F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(192, 231).addBox(2.0F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(234, 7)
						.addBox(2.0F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(230, 160).addBox(0.6F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(234, 11)
						.addBox(-0.6F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 234).addBox(-1.8F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 234)
						.addBox(-3.0F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, -1.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(10.0F, 18.0F, 2.0F));
		PartDefinition antepierna = left_leg.addOrReplaceChild("antepierna",
				CubeListBuilder.create().texOffs(70, 217).addBox(-3.0F, -5.0F, -2.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 217).addBox(-3.0F, -2.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition left_ffoot = antepierna.addOrReplaceChild("left_ffoot",
				CubeListBuilder.create().texOffs(216, 25).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(232, 129).addBox(-3.0F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(200, 231)
						.addBox(-1.6F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 233).addBox(-0.4F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 233)
						.addBox(0.8F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 233).addBox(2.0F, -1.0F, -6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(168, 235)
						.addBox(2.0F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(128, 235).addBox(0.8F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 235)
						.addBox(-0.4F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(104, 235).addBox(-1.6F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(112, 235)
						.addBox(-3.0F, 0.0F, -9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, -1.0F));
		PartDefinition dark_ball = partdefinition.addOrReplaceChild("dark_ball",
				CubeListBuilder.create().texOffs(80, 59).addBox(-9.0F, -12.0F, 0.0F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(68, 115).addBox(-8.0F, -13.0F, 1.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(148, 164)
						.addBox(-6.0F, -14.0F, 3.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 121).addBox(-8.0F, 10.0F, 1.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(176, 137)
						.addBox(-6.0F, 11.0F, 3.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(82, 78).addBox(-9.0F, 9.0F, 0.0F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-10.0F, -11.0F, -1.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 174).addBox(-9.0F, -10.0F, 19.0F, 18.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 196)
						.addBox(-8.0F, -9.0F, 20.0F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(110, 214).addBox(-6.0F, -7.0F, 22.0F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(212, 215)
						.addBox(-6.0F, -7.0F, -5.0F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(200, 95).addBox(-8.0F, -9.0F, -4.0F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(178, 17)
						.addBox(-9.0F, -10.0F, -2.0F, 18.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 138).addBox(-11.0F, -10.0F, 0.0F, 2.0F, 18.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(80, 148)
						.addBox(-12.0F, -9.0F, 1.0F, 1.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(186, 207).addBox(-13.0F, -7.0F, 3.0F, 1.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(114, 164)
						.addBox(12.0F, -9.0F, 1.0F, 1.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 209).addBox(13.0F, -7.0F, 3.0F, 1.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 148)
						.addBox(10.0F, -10.0F, 0.0F, 2.0F, 18.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 15.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		dark_ball.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
