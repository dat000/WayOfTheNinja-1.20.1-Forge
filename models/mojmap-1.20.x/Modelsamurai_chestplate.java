// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsamurai_chestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "samurai_chestplate"), "main");
	private final ModelPart samurai_chestplate;
	private final ModelPart right_arm;
	private final ModelPart left_arm;

	public Modelsamurai_chestplate(ModelPart root) {
		this.samurai_chestplate = root.getChild("samurai_chestplate");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition samurai_chestplate = partdefinition.addOrReplaceChild("samurai_chestplate",
				CubeListBuilder.create().texOffs(0, 28)
						.addBox(-5.0F, -1.0F, -4.0F, 10.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, 0.0F, 2.0F, 10.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 6)
						.addBox(-2.0F, 2.0F, -4.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 23)
						.addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 53)
						.addBox(2.0F, 5.0F, -4.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 11)
						.addBox(-2.0F, 5.0F, -3.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 57)
						.addBox(2.0F, 2.0F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 58)
						.addBox(-5.0F, 2.0F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 6)
						.addBox(4.0F, 5.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(5.0F, 13.0F, -1.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 46)
						.addBox(-6.0F, 13.0F, -1.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 17)
						.addBox(-5.0F, 5.0F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 46)
						.addBox(-5.0F, 5.0F, -4.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-4.0F, -3.0F, -4.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-7.0F, -2.0F, -2.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-9.0F, -1.0F, -2.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-4.0F, -4.0F, -2.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 28)
						.addBox(-6.0F, -3.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-4.0F, 6.0F, -3.5F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 41)
						.addBox(-4.0F, 0.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-3.0F, 0.0F, -3.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 55)
						.addBox(-3.0F, -2.0F, 2.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 19)
						.addBox(-4.0F, 9.0F, -3.5F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(22, 34)
						.addBox(-1.0F, -4.0F, -2.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 53)
						.addBox(0.0F, -3.0F, -4.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 34)
						.addBox(3.0F, -2.0F, -2.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(3.0F, -1.0F, -2.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(0.0F, 6.0F, -3.5F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(22, 10)
						.addBox(0.0F, 9.0F, -3.5F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 18)
						.addBox(0.0F, 0.0F, -3.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 41)
						.addBox(3.0F, 0.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 55)
						.addBox(0.0F, -2.0F, 2.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 40)
						.addBox(4.0F, -3.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		samurai_chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}