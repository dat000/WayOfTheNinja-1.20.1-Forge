// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelanbu_mask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "anbu_mask"), "main");
	private final ModelPart anbu_mask;

	public Modelanbu_mask(ModelPart root) {
		this.anbu_mask = root.getChild("anbu_mask");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition anbu_mask = partdefinition.addOrReplaceChild("anbu_mask",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 22.0F, 0.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 10)
						.addBox(-4.0F, 21.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 12)
						.addBox(2.0F, 21.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-4.0F, 27.0F, 0.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-3.0F, 30.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 13)
						.addBox(-4.0F, 25.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 14)
						.addBox(3.0F, 25.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-1.0F, 25.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -30.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		anbu_mask.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}