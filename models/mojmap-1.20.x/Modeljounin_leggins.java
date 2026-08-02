// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljounin_leggins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jounin_leggins"), "main");
	private final ModelPart jounin_leggins;
	private final ModelPart left;
	private final ModelPart right;

	public Modeljounin_leggins(ModelPart root) {
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
				CubeListBuilder.create().texOffs(20, 13)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 22)
						.addBox(-2.0F, 0.0F, 2.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(-2.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, -12.0F, 0.0F));

		PartDefinition right = jounin_leggins.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(12, 0)
						.addBox(-3.2F, 0.0F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(0.8F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-2.2F, 0.0F, 2.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-2.2F, 0.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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