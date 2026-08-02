package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class ChangehaircolorProcedure {
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
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type == 1) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type != 0) {
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 1 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_1_hair_1.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_1_hair_1.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_1.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_1.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 2 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_2_hair_1.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_2_hair_1.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_1.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_1.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 3 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_3_hair_1.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_3_hair_1.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_1.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_1.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 4 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_4_hair_1.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_4_hair_1.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_1.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_1.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
			}
		} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type == 2) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type != 0) {
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 1 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1textures/entities/skin_color_1_hair_2.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1textures/entities/skin_color_1_hair_2.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_2.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_2.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 2 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_2_hair_2.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_2_hair_2.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_2.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_2.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 3 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_3_hair_2.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_3_hair_2.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_2.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_2.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 4 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_4_hair_2.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_4_hair_2.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_2.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_2.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
			}
		} else if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type == 3) {
			if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_type != 0) {
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 1 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_1_hair_3.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_1_hair_3.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_3.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_3.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 2 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_2_hair_3.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_2_hair_3.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_3.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_3.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 3 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_3_hair_3.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_3_hair_3.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_3.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_3.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
				if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_skin_type == 4 && entity instanceof Player) {
					if (_evt.getRenderer() instanceof LivingEntityRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							_pre.setCanceled(true);
						}
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_4_hair_3.png") != null) {
							_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/skin_color_4_hair_3.png");
						}
						new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
					}
					if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_hair_color == 1) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_3.png") != null) {
								_texture = new ResourceLocation("way_of_the_ninja_forge_1_20_1:textures/entities/hair_type_3.png");
							}
							new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, true, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
						}
					}
				}
			}
		}
	}
}
