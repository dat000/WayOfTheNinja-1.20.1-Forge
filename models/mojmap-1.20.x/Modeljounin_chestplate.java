// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljounin_chestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jounin_chestplate"), "main");
	private final ModelPart jonin_chestplate;
	private final ModelPart jonin_right_arm;
	private final ModelPart jonin_left_arm;

	public Modeljounin_chestplate(ModelPart root) {
		this.jonin_chestplate = root.getChild("jonin_chestplate");
		this.jonin_right_arm = root.getChild("jonin_right_arm");
		this.jonin_left_arm = root.getChild("jonin_left_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition jonin_chestplate = partdefinition.addOrReplaceChild("jonin_chestplate",
				CubeListBuilder.create().texOffs(28, 13)
						.addBox(2.0F, 0.0F, -3.05F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 9)
						.addBox(-5.0F, 0.0F, -3.05F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 43)
						.addBox(-1.0F, 0.0F, -3.05F, 2.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, 0.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-5.0F, 0.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 31)
						.addBox(-5.0F, -2.0F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 13)
						.addBox(4.0F, -2.0F, -2.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition jonin_right_arm = partdefinition.addOrReplaceChild("jonin_right_arm",
				CubeListBuilder.create().texOffs(38, 0)
						.addBox(-3.0F, -2.0F, -3.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 38)
						.addBox(-3.0F, -2.0F, 2.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-4.0F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 20)
						.addBox(-3.0F, -3.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 31)
						.addBox(0.0F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition jonin_left_arm = partdefinition.addOrReplaceChild("jonin_left_arm",
				CubeListBuilder.create().texOffs(38, 38)
						.addBox(0.0F, -2.0F, -3.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(0.0F, -2.0F, 2.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(3.0F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 31)
						.addBox(-1.0F, -2.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 25)
						.addBox(0.0F, -3.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		jonin_chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		jonin_right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		jonin_left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}