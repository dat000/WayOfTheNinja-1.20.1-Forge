// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltaijutsu_leggins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "taijutsu_leggins"), "main");
	private final ModelPart jounin_leggins;
	private final ModelPart left;
	private final ModelPart right;

	public Modeltaijutsu_leggins(ModelPart root) {
		this.jounin_leggins = root.getChild("jounin_leggins");
		this.left = this.jounin_leggins.getChild("left");
		this.right = this.jounin_leggins.getChild("right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition jounin_leggins = partdefinition.addOrReplaceChild("jounin_leggins", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left = jounin_leggins.addOrReplaceChild("left",
				CubeListBuilder.create().texOffs(12, 18)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-2.0F, 0.0F, 2.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 9)
						.addBox(-2.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, -12.0F, 0.0F));

		PartDefinition right = jounin_leggins.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-3.2F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.2F, 0.0F, 2.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 6)
						.addBox(-2.2F, 0.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		jounin_leggins.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}