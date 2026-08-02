// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsamurai_leggins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "samurai_leggins"), "main");
	private final ModelPart Leggins;
	private final ModelPart left;
	private final ModelPart right;

	public Modelsamurai_leggins(ModelPart root) {
		this.Leggins = root.getChild("Leggins");
		this.left = this.Leggins.getChild("left");
		this.right = this.Leggins.getChild("right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Leggins = partdefinition.addOrReplaceChild("Leggins", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left = Leggins.addOrReplaceChild("left",
				CubeListBuilder.create().texOffs(14, 0)
						.addBox(-1.9F, 0.0F, -3.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 7)
						.addBox(-1.9F, 0.0F, 2.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.1F, 0.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, -12.0F, 0.0F));

		PartDefinition right = Leggins.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(14, 21)
						.addBox(-2.1F, 0.0F, -3.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(-2.1F, 0.0F, 2.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-3.1F, 0.0F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Leggins.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}