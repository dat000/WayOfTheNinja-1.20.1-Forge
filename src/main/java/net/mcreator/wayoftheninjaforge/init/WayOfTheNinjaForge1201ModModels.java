
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.wayoftheninjaforge.client.model.Modeluzumaki_leggins;
import net.mcreator.wayoftheninjaforge.client.model.Modeluzumaki_chestplate;
import net.mcreator.wayoftheninjaforge.client.model.Modeluzumaki_boots;
import net.mcreator.wayoftheninjaforge.client.model.Modeluchiha_guard_chestplate;
import net.mcreator.wayoftheninjaforge.client.model.Modeltaijutsu_leggins;
import net.mcreator.wayoftheninjaforge.client.model.Modeltaijutsu_chestplate;
import net.mcreator.wayoftheninjaforge.client.model.Modeltaijutsu_boots;
import net.mcreator.wayoftheninjaforge.client.model.Modelshukaku;
import net.mcreator.wayoftheninjaforge.client.model.Modelsamurai_leggins;
import net.mcreator.wayoftheninjaforge.client.model.Modelsamurai_helmet;
import net.mcreator.wayoftheninjaforge.client.model.Modelsamurai_chestplate;
import net.mcreator.wayoftheninjaforge.client.model.Modelsamurai_boots;
import net.mcreator.wayoftheninjaforge.client.model.Modelrock_lee_entity;
import net.mcreator.wayoftheninjaforge.client.model.Modelkleiders_log;
import net.mcreator.wayoftheninjaforge.client.model.Modeljounin_leggins;
import net.mcreator.wayoftheninjaforge.client.model.Modeljounin_chestplate;
import net.mcreator.wayoftheninjaforge.client.model.Modeljounin_boots;
import net.mcreator.wayoftheninjaforge.client.model.Modelforehead;
import net.mcreator.wayoftheninjaforge.client.model.Modelfireball_jutsu;
import net.mcreator.wayoftheninjaforge.client.model.Modeldark_ball_entity;
import net.mcreator.wayoftheninjaforge.client.model.Modelanbu_mask;
import net.mcreator.wayoftheninjaforge.client.model.Modelanbu_chestplate;
import net.mcreator.wayoftheninjaforge.client.model.Modelanbu_boots;
import net.mcreator.wayoftheninjaforge.client.model.Modelakatsuki_robe_leggins;
import net.mcreator.wayoftheninjaforge.client.model.Modelakatsuki_robe;
import net.mcreator.wayoftheninjaforge.client.model.Modelakatsuki_boots;
import net.mcreator.wayoftheninjaforge.client.model.Modelakamaru;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WayOfTheNinjaForge1201ModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelkleiders_log.LAYER_LOCATION, Modelkleiders_log::createBodyLayer);
		event.registerLayerDefinition(Modelanbu_boots.LAYER_LOCATION, Modelanbu_boots::createBodyLayer);
		event.registerLayerDefinition(Modelanbu_mask.LAYER_LOCATION, Modelanbu_mask::createBodyLayer);
		event.registerLayerDefinition(Modelsamurai_chestplate.LAYER_LOCATION, Modelsamurai_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modeljounin_chestplate.LAYER_LOCATION, Modeljounin_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modelakamaru.LAYER_LOCATION, Modelakamaru::createBodyLayer);
		event.registerLayerDefinition(Modelrock_lee_entity.LAYER_LOCATION, Modelrock_lee_entity::createBodyLayer);
		event.registerLayerDefinition(Modeltaijutsu_chestplate.LAYER_LOCATION, Modeltaijutsu_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modeltaijutsu_boots.LAYER_LOCATION, Modeltaijutsu_boots::createBodyLayer);
		event.registerLayerDefinition(Modeltaijutsu_leggins.LAYER_LOCATION, Modeltaijutsu_leggins::createBodyLayer);
		event.registerLayerDefinition(Modelanbu_chestplate.LAYER_LOCATION, Modelanbu_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modelsamurai_helmet.LAYER_LOCATION, Modelsamurai_helmet::createBodyLayer);
		event.registerLayerDefinition(Modelfireball_jutsu.LAYER_LOCATION, Modelfireball_jutsu::createBodyLayer);
		event.registerLayerDefinition(Modeluchiha_guard_chestplate.LAYER_LOCATION, Modeluchiha_guard_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modelakatsuki_robe_leggins.LAYER_LOCATION, Modelakatsuki_robe_leggins::createBodyLayer);
		event.registerLayerDefinition(Modelshukaku.LAYER_LOCATION, Modelshukaku::createBodyLayer);
		event.registerLayerDefinition(Modeljounin_leggins.LAYER_LOCATION, Modeljounin_leggins::createBodyLayer);
		event.registerLayerDefinition(Modeluzumaki_chestplate.LAYER_LOCATION, Modeluzumaki_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modeljounin_boots.LAYER_LOCATION, Modeljounin_boots::createBodyLayer);
		event.registerLayerDefinition(Modelsamurai_leggins.LAYER_LOCATION, Modelsamurai_leggins::createBodyLayer);
		event.registerLayerDefinition(Modelsamurai_boots.LAYER_LOCATION, Modelsamurai_boots::createBodyLayer);
		event.registerLayerDefinition(Modeldark_ball_entity.LAYER_LOCATION, Modeldark_ball_entity::createBodyLayer);
		event.registerLayerDefinition(Modeluzumaki_boots.LAYER_LOCATION, Modeluzumaki_boots::createBodyLayer);
		event.registerLayerDefinition(Modelforehead.LAYER_LOCATION, Modelforehead::createBodyLayer);
		event.registerLayerDefinition(Modelakatsuki_robe.LAYER_LOCATION, Modelakatsuki_robe::createBodyLayer);
		event.registerLayerDefinition(Modelakatsuki_boots.LAYER_LOCATION, Modelakatsuki_boots::createBodyLayer);
		event.registerLayerDefinition(Modeluzumaki_leggins.LAYER_LOCATION, Modeluzumaki_leggins::createBodyLayer);
	}
}
