// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeluzumaki_leggins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "uzumaki_leggins"), "main");
	private final ModelPart r;
	private final ModelPart l;

	public Modeluzumaki_leggins(ModelPart root) {
		this.r = root.getChild("r");
		this.l = root.getChild("l");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition r = partdefinition.addOrReplaceChild("r",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-2.0F, 0.0F, 2.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(2.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition l = partdefinition.addOrReplaceChild("l",
				CubeListBuilder.create().texOffs(20, 6)
						.addBox(-1.8F, 0.0F, 2.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 9)
						.addBox(-2.8F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(2.2F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-1.8F, 0.0F, -3.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 12)
						.addBox(-7.8F, 1.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}