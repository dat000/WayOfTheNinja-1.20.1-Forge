package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class ChangeeyescolorProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		Entity _evtEntity = _evt.getEntity();
		PlayerRenderer _pr = null;
		PoseStack poseStack = _evt.getPoseStack();
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
			com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
					(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
			_pr = emptyRenderer;
			emptyRenderer.clearLayers();
			emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
		}
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_type == 1) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color != 0) {
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 1) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_black.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_black.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 2) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_brown.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_brown.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_blue.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_blue.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_purple.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_purple.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 5) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_red.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_1_color_red.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
			}
		} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_type == 2) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color != 0) {
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 1) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_black.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_black.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 2) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_brown.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_brown.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_blue.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_blue.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_purple.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_purple.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 5) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_red.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_2_color_red.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
			}
		} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_type == 3) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color != 0) {
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 1) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_black.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_black.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 2) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_brown.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_brown.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_blue.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_blue.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_purple.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_purple.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 5) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_red.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_3_color_red.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
			}
		} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_type == 4) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color != 0) {
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 1) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_black.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_black.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 2) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_brown.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_brown.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_blue.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_blue.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_purple.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_purple.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 5) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_red.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_4_color_red.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
			}
		} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_type == 5) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color != 0) {
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 1) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_5_color_black.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_5_color_black.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 2) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_5_color_brown.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_5_color_brown.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 3) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_5_color_blue.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_5_color_blue.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 4) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_5_color_purple.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/eyes_type_5_color_purple.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_eyes_color == 5) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1textures/entities/eyes_type_5_color_red.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1textures/entities/eyes_type_5_color_red.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
			}
		}
	}
}
