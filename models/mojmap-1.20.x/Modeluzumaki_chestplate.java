// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeluzumaki_chestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "uzumaki_chestplate"), "main");
	private final ModelPart Uzumaki_chestplate;
	private final ModelPart r;
	private final ModelPart l;

	public Modeluzumaki_chestplate(ModelPart root) {
		this.Uzumaki_chestplate = root.getChild("Uzumaki_chestplate");
		this.r = root.getChild("r");
		this.l = root.getChild("l");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Uzumaki_chestplate = partdefinition.addOrReplaceChild("Uzumaki_chestplate",
				CubeListBuilder.create().texOffs(16, 12)
						.addBox(-5.0F, 0.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-2, 24)
						.addBox(4.0F, 0.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Uzumaki_chestplate
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 12.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r2 = Uzumaki_chestplate
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 12.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition r = partdefinition.addOrReplaceChild("r",
				CubeListBuilder.create().texOffs(10, 30)
						.addBox(-3.0F, -2.0F, 2.0F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-3.0F, -2.0F, -3.0F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 14)
						.addBox(-4.0F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 14)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 2)
						.addBox(-3.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition l = partdefinition.addOrReplaceChild("l",
				CubeListBuilder.create().texOffs(39, 10)
						.addBox(0.0F, -2.0F, 2.0F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 20)
						.addBox(0.0F, -2.0F, -3.0F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 27)
						.addBox(3.0F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 27)
						.addBox(-1.0F, -2.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(-1.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Uzumaki_chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}