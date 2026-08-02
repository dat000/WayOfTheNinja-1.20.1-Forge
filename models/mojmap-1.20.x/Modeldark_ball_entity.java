// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldark_ball_entity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dark_ball_entity"), "main");
	private final ModelPart dark_ball;

	public Modeldark_ball_entity(ModelPart root) {
		this.dark_ball = root.getChild("dark_ball");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition dark_ball = partdefinition.addOrReplaceChild("dark_ball",
				CubeListBuilder.create().texOffs(0, 40)
						.addBox(-9.0F, -12.0F, 0.0F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(72, 40)
						.addBox(-8.0F, -13.0F, 1.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(74, 110)
						.addBox(-6.0F, -14.0F, 3.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(72, 57)
						.addBox(-8.0F, 10.0F, 1.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(112, 74)
						.addBox(-6.0F, 11.0F, 3.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-9.0F, 9.0F, 0.0F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -11.0F, -1.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(112, 87)
						.addBox(-9.0F, -10.0F, 19.0F, 18.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 0)
						.addBox(-8.0F, -9.0F, 20.0F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 123)
						.addBox(-6.0F, -7.0F, 22.0F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 130)
						.addBox(-6.0F, -7.0F, -5.0F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 18)
						.addBox(-8.0F, -9.0F, -4.0F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(-9.0F, -10.0F, -2.0F, 18.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 74)
						.addBox(-11.0F, -10.0F, 0.0F, 2.0F, 18.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(80, 0)
						.addBox(-12.0F, -9.0F, 1.0F, 1.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(40, 78)
						.addBox(-13.0F, -7.0F, 3.0F, 1.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 110)
						.addBox(12.0F, -9.0F, 1.0F, 1.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(122, 106)
						.addBox(13.0F, -7.0F, 3.0F, 1.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 78)
						.addBox(10.0F, -10.0F, 0.0F, 2.0F, 18.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 15.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		dark_ball.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}