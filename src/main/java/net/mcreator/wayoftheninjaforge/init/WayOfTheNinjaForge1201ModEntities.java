
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wayoftheninjaforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.wayoftheninjaforge.entity.ZetsuEntity;
import net.mcreator.wayoftheninjaforge.entity.YugitoNiiEntity;
import net.mcreator.wayoftheninjaforge.entity.YaguraKaratachiEntity;
import net.mcreator.wayoftheninjaforge.entity.UtakataEntity;
import net.mcreator.wayoftheninjaforge.entity.TsunadeEntity;
import net.mcreator.wayoftheninjaforge.entity.TobiramaEntity;
import net.mcreator.wayoftheninjaforge.entity.TobiEntity;
import net.mcreator.wayoftheninjaforge.entity.Toad1Entity;
import net.mcreator.wayoftheninjaforge.entity.TentenEntity;
import net.mcreator.wayoftheninjaforge.entity.TemariEntity;
import net.mcreator.wayoftheninjaforge.entity.TagEntity;
import net.mcreator.wayoftheninjaforge.entity.SunaNinjaEntity;
import net.mcreator.wayoftheninjaforge.entity.ShukakuEntity;
import net.mcreator.wayoftheninjaforge.entity.ShinoEntity;
import net.mcreator.wayoftheninjaforge.entity.ShikamaruEntity;
import net.mcreator.wayoftheninjaforge.entity.SasukeEntity;
import net.mcreator.wayoftheninjaforge.entity.SasoriEntity;
import net.mcreator.wayoftheninjaforge.entity.SamuiEntity;
import net.mcreator.wayoftheninjaforge.entity.SakuraEntity;
import net.mcreator.wayoftheninjaforge.entity.SaiEntity;
import net.mcreator.wayoftheninjaforge.entity.RoshiEntity;
import net.mcreator.wayoftheninjaforge.entity.RockleeEntity;
import net.mcreator.wayoftheninjaforge.entity.RainNinjaEntity;
import net.mcreator.wayoftheninjaforge.entity.RaikageEntity;
import net.mcreator.wayoftheninjaforge.entity.PainEntity;
import net.mcreator.wayoftheninjaforge.entity.OrochimaruEntity;
import net.mcreator.wayoftheninjaforge.entity.OnokiEntity;
import net.mcreator.wayoftheninjaforge.entity.ObitoEntity;
import net.mcreator.wayoftheninjaforge.entity.NejiEntity;
import net.mcreator.wayoftheninjaforge.entity.NarutoEntity;
import net.mcreator.wayoftheninjaforge.entity.NagatoEntity;
import net.mcreator.wayoftheninjaforge.entity.MuEntity;
import net.mcreator.wayoftheninjaforge.entity.MinatoEntity;
import net.mcreator.wayoftheninjaforge.entity.MeiEntity;
import net.mcreator.wayoftheninjaforge.entity.MadaraEntity;
import net.mcreator.wayoftheninjaforge.entity.LogEntity;
import net.mcreator.wayoftheninjaforge.entity.LightningCorpsEntity;
import net.mcreator.wayoftheninjaforge.entity.KushinaEntity;
import net.mcreator.wayoftheninjaforge.entity.KurenaiEntity;
import net.mcreator.wayoftheninjaforge.entity.KunaiTrainingProjectileEntity;
import net.mcreator.wayoftheninjaforge.entity.KunaiProjectileEntity;
import net.mcreator.wayoftheninjaforge.entity.KunaiMultiBombaProjectileEntity;
import net.mcreator.wayoftheninjaforge.entity.KunaiBombaProjectileEntity;
import net.mcreator.wayoftheninjaforge.entity.KonohaninjaEntity;
import net.mcreator.wayoftheninjaforge.entity.KonohamaruEntity;
import net.mcreator.wayoftheninjaforge.entity.KonohaAnbuEntity;
import net.mcreator.wayoftheninjaforge.entity.KonanEntity;
import net.mcreator.wayoftheninjaforge.entity.KisameEntity;
import net.mcreator.wayoftheninjaforge.entity.KillerBeeEntity;
import net.mcreator.wayoftheninjaforge.entity.KibaEntity;
import net.mcreator.wayoftheninjaforge.entity.KazekagesShadowEntity;
import net.mcreator.wayoftheninjaforge.entity.KankuroEntity;
import net.mcreator.wayoftheninjaforge.entity.KakuzuEntity;
import net.mcreator.wayoftheninjaforge.entity.KakashiEntity;
import net.mcreator.wayoftheninjaforge.entity.KabutoEntity;
import net.mcreator.wayoftheninjaforge.entity.JuzoBiwaEntity;
import net.mcreator.wayoftheninjaforge.entity.JiraiyaEntity;
import net.mcreator.wayoftheninjaforge.entity.ItachiuchihaEntity;
import net.mcreator.wayoftheninjaforge.entity.IrukaEntity;
import net.mcreator.wayoftheninjaforge.entity.InoEntity;
import net.mcreator.wayoftheninjaforge.entity.HozukiEntity;
import net.mcreator.wayoftheninjaforge.entity.HiruzenEntity;
import net.mcreator.wayoftheninjaforge.entity.HinataEntity;
import net.mcreator.wayoftheninjaforge.entity.HidanEntity;
import net.mcreator.wayoftheninjaforge.entity.HashiramaEntity;
import net.mcreator.wayoftheninjaforge.entity.HanEntity;
import net.mcreator.wayoftheninjaforge.entity.GaiEntity;
import net.mcreator.wayoftheninjaforge.entity.GaaraEntity;
import net.mcreator.wayoftheninjaforge.entity.FuEntity;
import net.mcreator.wayoftheninjaforge.entity.FireballProjectileEntity;
import net.mcreator.wayoftheninjaforge.entity.DeidaraEntity;
import net.mcreator.wayoftheninjaforge.entity.DarkballtestEntity;
import net.mcreator.wayoftheninjaforge.entity.CloudNinjaEntity;
import net.mcreator.wayoftheninjaforge.entity.ChojiEntity;
import net.mcreator.wayoftheninjaforge.entity.AsumaEntity;
import net.mcreator.wayoftheninjaforge.entity.AnkoEntity;
import net.mcreator.wayoftheninjaforge.entity.AmeOperativesEntity;
import net.mcreator.wayoftheninjaforge.entity.AkamaruEntity;
import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WayOfTheNinjaForge1201ModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WayOfTheNinjaForge1201Mod.MODID);
	public static final RegistryObject<EntityType<FireballProjectileEntity>> FIREBALL_PROJECTILE = register("fireball_projectile", EntityType.Builder.<FireballProjectileEntity>of(FireballProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FireballProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TagEntity>> TAG = register("tag",
			EntityType.Builder.<TagEntity>of(TagEntity::new, MobCategory.MISC).setCustomClientFactory(TagEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LogEntity>> LOG = register("log",
			EntityType.Builder.<LogEntity>of(LogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RockleeEntity>> ROCKLEE = register("rocklee",
			EntityType.Builder.<RockleeEntity>of(RockleeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RockleeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KonohaninjaEntity>> KONOHANINJA = register("konohaninja",
			EntityType.Builder.<KonohaninjaEntity>of(KonohaninjaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KonohaninjaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NarutoEntity>> NARUTO = register("naruto",
			EntityType.Builder.<NarutoEntity>of(NarutoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NarutoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SasukeEntity>> SASUKE = register("sasuke",
			EntityType.Builder.<SasukeEntity>of(SasukeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SasukeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SakuraEntity>> SAKURA = register("sakura",
			EntityType.Builder.<SakuraEntity>of(SakuraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SakuraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KakashiEntity>> KAKASHI = register("kakashi",
			EntityType.Builder.<KakashiEntity>of(KakashiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KakashiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NejiEntity>> NEJI = register("neji",
			EntityType.Builder.<NejiEntity>of(NejiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NejiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TentenEntity>> TENTEN = register("tenten",
			EntityType.Builder.<TentenEntity>of(TentenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TentenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GaiEntity>> GAI = register("gai",
			EntityType.Builder.<GaiEntity>of(GaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GaiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KonohaAnbuEntity>> KONOHA_ANBU = register("konoha_anbu",
			EntityType.Builder.<KonohaAnbuEntity>of(KonohaAnbuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KonohaAnbuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AsumaEntity>> ASUMA = register("asuma",
			EntityType.Builder.<AsumaEntity>of(AsumaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AsumaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShikamaruEntity>> SHIKAMARU = register("shikamaru",
			EntityType.Builder.<ShikamaruEntity>of(ShikamaruEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShikamaruEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InoEntity>> INO = register("ino",
			EntityType.Builder.<InoEntity>of(InoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChojiEntity>> CHOJI = register("choji",
			EntityType.Builder.<ChojiEntity>of(ChojiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChojiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShinoEntity>> SHINO = register("shino",
			EntityType.Builder.<ShinoEntity>of(ShinoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShinoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HinataEntity>> HINATA = register("hinata",
			EntityType.Builder.<HinataEntity>of(HinataEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HinataEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KibaEntity>> KIBA = register("kiba",
			EntityType.Builder.<KibaEntity>of(KibaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KibaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AkamaruEntity>> AKAMARU = register("akamaru",
			EntityType.Builder.<AkamaruEntity>of(AkamaruEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AkamaruEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KurenaiEntity>> KURENAI = register("kurenai",
			EntityType.Builder.<KurenaiEntity>of(KurenaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KurenaiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HashiramaEntity>> HASHIRAMA = register("hashirama",
			EntityType.Builder.<HashiramaEntity>of(HashiramaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HashiramaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TobiramaEntity>> TOBIRAMA = register("tobirama",
			EntityType.Builder.<TobiramaEntity>of(TobiramaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobiramaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HiruzenEntity>> HIRUZEN = register("hiruzen",
			EntityType.Builder.<HiruzenEntity>of(HiruzenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HiruzenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MinatoEntity>> MINATO = register("minato",
			EntityType.Builder.<MinatoEntity>of(MinatoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinatoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TsunadeEntity>> TSUNADE = register("tsunade",
			EntityType.Builder.<TsunadeEntity>of(TsunadeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TsunadeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JiraiyaEntity>> JIRAIYA = register("jiraiya",
			EntityType.Builder.<JiraiyaEntity>of(JiraiyaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JiraiyaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OrochimaruEntity>> OROCHIMARU = register("orochimaru",
			EntityType.Builder.<OrochimaruEntity>of(OrochimaruEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OrochimaruEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SaiEntity>> SAI = register("sai",
			EntityType.Builder.<SaiEntity>of(SaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SaiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KabutoEntity>> KABUTO = register("kabuto",
			EntityType.Builder.<KabutoEntity>of(KabutoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KabutoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KazekagesShadowEntity>> KAZEKAGES_SHADOW = register("kazekages_shadow",
			EntityType.Builder.<KazekagesShadowEntity>of(KazekagesShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KazekagesShadowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SunaNinjaEntity>> SUNA_NINJA = register("suna_ninja",
			EntityType.Builder.<SunaNinjaEntity>of(SunaNinjaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SunaNinjaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RainNinjaEntity>> RAIN_NINJA = register("rain_ninja",
			EntityType.Builder.<RainNinjaEntity>of(RainNinjaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RainNinjaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AmeOperativesEntity>> AME_OPERATIVES = register("ame_operatives",
			EntityType.Builder.<AmeOperativesEntity>of(AmeOperativesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AmeOperativesEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloudNinjaEntity>> CLOUD_NINJA = register("cloud_ninja",
			EntityType.Builder.<CloudNinjaEntity>of(CloudNinjaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloudNinjaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LightningCorpsEntity>> LIGHTNING_CORPS = register("lightning_corps",
			EntityType.Builder.<LightningCorpsEntity>of(LightningCorpsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LightningCorpsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PainEntity>> PAIN = register("pain",
			EntityType.Builder.<PainEntity>of(PainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PainEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NagatoEntity>> NAGATO = register("nagato",
			EntityType.Builder.<NagatoEntity>of(NagatoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NagatoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KonanEntity>> KONAN = register("konan",
			EntityType.Builder.<KonanEntity>of(KonanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KonanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ItachiuchihaEntity>> ITACHIUCHIHA = register("itachiuchiha",
			EntityType.Builder.<ItachiuchihaEntity>of(ItachiuchihaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ItachiuchihaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TobiEntity>> TOBI = register("tobi",
			EntityType.Builder.<TobiEntity>of(TobiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZetsuEntity>> ZETSU = register("zetsu",
			EntityType.Builder.<ZetsuEntity>of(ZetsuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZetsuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeidaraEntity>> DEIDARA = register("deidara",
			EntityType.Builder.<DeidaraEntity>of(DeidaraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeidaraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SasoriEntity>> SASORI = register("sasori",
			EntityType.Builder.<SasoriEntity>of(SasoriEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SasoriEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HidanEntity>> HIDAN = register("hidan",
			EntityType.Builder.<HidanEntity>of(HidanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HidanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KakuzuEntity>> KAKUZU = register("kakuzu",
			EntityType.Builder.<KakuzuEntity>of(KakuzuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KakuzuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KisameEntity>> KISAME = register("kisame",
			EntityType.Builder.<KisameEntity>of(KisameEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KisameEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JuzoBiwaEntity>> JUZO_BIWA = register("juzo_biwa",
			EntityType.Builder.<JuzoBiwaEntity>of(JuzoBiwaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuzoBiwaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ObitoEntity>> OBITO = register("obito",
			EntityType.Builder.<ObitoEntity>of(ObitoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObitoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MadaraEntity>> MADARA = register("madara",
			EntityType.Builder.<MadaraEntity>of(MadaraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadaraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SamuiEntity>> SAMUI = register("samui",
			EntityType.Builder.<SamuiEntity>of(SamuiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SamuiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KonohamaruEntity>> KONOHAMARU = register("konohamaru",
			EntityType.Builder.<KonohamaruEntity>of(KonohamaruEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KonohamaruEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AnkoEntity>> ANKO = register("anko",
			EntityType.Builder.<AnkoEntity>of(AnkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AnkoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IrukaEntity>> IRUKA = register("iruka",
			EntityType.Builder.<IrukaEntity>of(IrukaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IrukaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KushinaEntity>> KUSHINA = register("kushina",
			EntityType.Builder.<KushinaEntity>of(KushinaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KushinaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GaaraEntity>> GAARA = register("gaara",
			EntityType.Builder.<GaaraEntity>of(GaaraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GaaraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KankuroEntity>> KANKURO = register("kankuro",
			EntityType.Builder.<KankuroEntity>of(KankuroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KankuroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TemariEntity>> TEMARI = register("temari",
			EntityType.Builder.<TemariEntity>of(TemariEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TemariEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YugitoNiiEntity>> YUGITO_NII = register("yugito_nii",
			EntityType.Builder.<YugitoNiiEntity>of(YugitoNiiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YugitoNiiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YaguraKaratachiEntity>> YAGURA_KARATACHI = register("yagura_karatachi",
			EntityType.Builder.<YaguraKaratachiEntity>of(YaguraKaratachiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YaguraKaratachiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoshiEntity>> ROSHI = register("roshi",
			EntityType.Builder.<RoshiEntity>of(RoshiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoshiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HanEntity>> HAN = register("han",
			EntityType.Builder.<HanEntity>of(HanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UtakataEntity>> UTAKATA = register("utakata",
			EntityType.Builder.<UtakataEntity>of(UtakataEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UtakataEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FuEntity>> FU = register("fu",
			EntityType.Builder.<FuEntity>of(FuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KillerBeeEntity>> KILLER_BEE = register("killer_bee",
			EntityType.Builder.<KillerBeeEntity>of(KillerBeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KillerBeeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MuEntity>> MU = register("mu",
			EntityType.Builder.<MuEntity>of(MuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OnokiEntity>> ONOKI = register("onoki",
			EntityType.Builder.<OnokiEntity>of(OnokiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OnokiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RaikageEntity>> RAIKAGE = register("raikage",
			EntityType.Builder.<RaikageEntity>of(RaikageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RaikageEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HozukiEntity>> HOZUKI = register("hozuki",
			EntityType.Builder.<HozukiEntity>of(HozukiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HozukiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeiEntity>> MEI = register("mei",
			EntityType.Builder.<MeiEntity>of(MeiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MeiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShukakuEntity>> SHUKAKU = register("shukaku",
			EntityType.Builder.<ShukakuEntity>of(ShukakuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShukakuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Toad1Entity>> TOAD_1 = register("toad_1",
			EntityType.Builder.<Toad1Entity>of(Toad1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Toad1Entity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<KunaiProjectileEntity>> KUNAI_PROJECTILE = register("kunai_projectile", EntityType.Builder.<KunaiProjectileEntity>of(KunaiProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KunaiProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KunaiTrainingProjectileEntity>> KUNAI_TRAINING_PROJECTILE = register("kunai_training_projectile",
			EntityType.Builder.<KunaiTrainingProjectileEntity>of(KunaiTrainingProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(KunaiTrainingProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KunaiBombaProjectileEntity>> KUNAI_BOMBA_PROJECTILE = register("kunai_bomba_projectile", EntityType.Builder.<KunaiBombaProjectileEntity>of(KunaiBombaProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KunaiBombaProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KunaiMultiBombaProjectileEntity>> KUNAI_MULTI_BOMBA_PROJECTILE = register("kunai_multi_bomba_projectile",
			EntityType.Builder.<KunaiMultiBombaProjectileEntity>of(KunaiMultiBombaProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(KunaiMultiBombaProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarkballtestEntity>> DARKBALLTEST = register("darkballtest",
			EntityType.Builder.<DarkballtestEntity>of(DarkballtestEntity::new, MobCategory.MISC).setCustomClientFactory(DarkballtestEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LogEntity.init();
			RockleeEntity.init();
			KonohaninjaEntity.init();
			NarutoEntity.init();
			SasukeEntity.init();
			SakuraEntity.init();
			KakashiEntity.init();
			NejiEntity.init();
			TentenEntity.init();
			GaiEntity.init();
			KonohaAnbuEntity.init();
			AsumaEntity.init();
			ShikamaruEntity.init();
			InoEntity.init();
			ChojiEntity.init();
			ShinoEntity.init();
			HinataEntity.init();
			KibaEntity.init();
			AkamaruEntity.init();
			KurenaiEntity.init();
			HashiramaEntity.init();
			TobiramaEntity.init();
			HiruzenEntity.init();
			MinatoEntity.init();
			TsunadeEntity.init();
			JiraiyaEntity.init();
			OrochimaruEntity.init();
			SaiEntity.init();
			KabutoEntity.init();
			KazekagesShadowEntity.init();
			SunaNinjaEntity.init();
			RainNinjaEntity.init();
			AmeOperativesEntity.init();
			CloudNinjaEntity.init();
			LightningCorpsEntity.init();
			PainEntity.init();
			NagatoEntity.init();
			KonanEntity.init();
			ItachiuchihaEntity.init();
			TobiEntity.init();
			ZetsuEntity.init();
			DeidaraEntity.init();
			SasoriEntity.init();
			HidanEntity.init();
			KakuzuEntity.init();
			KisameEntity.init();
			JuzoBiwaEntity.init();
			ObitoEntity.init();
			MadaraEntity.init();
			SamuiEntity.init();
			KonohamaruEntity.init();
			AnkoEntity.init();
			IrukaEntity.init();
			KushinaEntity.init();
			GaaraEntity.init();
			KankuroEntity.init();
			TemariEntity.init();
			YugitoNiiEntity.init();
			YaguraKaratachiEntity.init();
			RoshiEntity.init();
			HanEntity.init();
			UtakataEntity.init();
			FuEntity.init();
			KillerBeeEntity.init();
			MuEntity.init();
			OnokiEntity.init();
			RaikageEntity.init();
			HozukiEntity.init();
			MeiEntity.init();
			ShukakuEntity.init();
			Toad1Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LOG.get(), LogEntity.createAttributes().build());
		event.put(ROCKLEE.get(), RockleeEntity.createAttributes().build());
		event.put(KONOHANINJA.get(), KonohaninjaEntity.createAttributes().build());
		event.put(NARUTO.get(), NarutoEntity.createAttributes().build());
		event.put(SASUKE.get(), SasukeEntity.createAttributes().build());
		event.put(SAKURA.get(), SakuraEntity.createAttributes().build());
		event.put(KAKASHI.get(), KakashiEntity.createAttributes().build());
		event.put(NEJI.get(), NejiEntity.createAttributes().build());
		event.put(TENTEN.get(), TentenEntity.createAttributes().build());
		event.put(GAI.get(), GaiEntity.createAttributes().build());
		event.put(KONOHA_ANBU.get(), KonohaAnbuEntity.createAttributes().build());
		event.put(ASUMA.get(), AsumaEntity.createAttributes().build());
		event.put(SHIKAMARU.get(), ShikamaruEntity.createAttributes().build());
		event.put(INO.get(), InoEntity.createAttributes().build());
		event.put(CHOJI.get(), ChojiEntity.createAttributes().build());
		event.put(SHINO.get(), ShinoEntity.createAttributes().build());
		event.put(HINATA.get(), HinataEntity.createAttributes().build());
		event.put(KIBA.get(), KibaEntity.createAttributes().build());
		event.put(AKAMARU.get(), AkamaruEntity.createAttributes().build());
		event.put(KURENAI.get(), KurenaiEntity.createAttributes().build());
		event.put(HASHIRAMA.get(), HashiramaEntity.createAttributes().build());
		event.put(TOBIRAMA.get(), TobiramaEntity.createAttributes().build());
		event.put(HIRUZEN.get(), HiruzenEntity.createAttributes().build());
		event.put(MINATO.get(), MinatoEntity.createAttributes().build());
		event.put(TSUNADE.get(), TsunadeEntity.createAttributes().build());
		event.put(JIRAIYA.get(), JiraiyaEntity.createAttributes().build());
		event.put(OROCHIMARU.get(), OrochimaruEntity.createAttributes().build());
		event.put(SAI.get(), SaiEntity.createAttributes().build());
		event.put(KABUTO.get(), KabutoEntity.createAttributes().build());
		event.put(KAZEKAGES_SHADOW.get(), KazekagesShadowEntity.createAttributes().build());
		event.put(SUNA_NINJA.get(), SunaNinjaEntity.createAttributes().build());
		event.put(RAIN_NINJA.get(), RainNinjaEntity.createAttributes().build());
		event.put(AME_OPERATIVES.get(), AmeOperativesEntity.createAttributes().build());
		event.put(CLOUD_NINJA.get(), CloudNinjaEntity.createAttributes().build());
		event.put(LIGHTNING_CORPS.get(), LightningCorpsEntity.createAttributes().build());
		event.put(PAIN.get(), PainEntity.createAttributes().build());
		event.put(NAGATO.get(), NagatoEntity.createAttributes().build());
		event.put(KONAN.get(), KonanEntity.createAttributes().build());
		event.put(ITACHIUCHIHA.get(), ItachiuchihaEntity.createAttributes().build());
		event.put(TOBI.get(), TobiEntity.createAttributes().build());
		event.put(ZETSU.get(), ZetsuEntity.createAttributes().build());
		event.put(DEIDARA.get(), DeidaraEntity.createAttributes().build());
		event.put(SASORI.get(), SasoriEntity.createAttributes().build());
		event.put(HIDAN.get(), HidanEntity.createAttributes().build());
		event.put(KAKUZU.get(), KakuzuEntity.createAttributes().build());
		event.put(KISAME.get(), KisameEntity.createAttributes().build());
		event.put(JUZO_BIWA.get(), JuzoBiwaEntity.createAttributes().build());
		event.put(OBITO.get(), ObitoEntity.createAttributes().build());
		event.put(MADARA.get(), MadaraEntity.createAttributes().build());
		event.put(SAMUI.get(), SamuiEntity.createAttributes().build());
		event.put(KONOHAMARU.get(), KonohamaruEntity.createAttributes().build());
		event.put(ANKO.get(), AnkoEntity.createAttributes().build());
		event.put(IRUKA.get(), IrukaEntity.createAttributes().build());
		event.put(KUSHINA.get(), KushinaEntity.createAttributes().build());
		event.put(GAARA.get(), GaaraEntity.createAttributes().build());
		event.put(KANKURO.get(), KankuroEntity.createAttributes().build());
		event.put(TEMARI.get(), TemariEntity.createAttributes().build());
		event.put(YUGITO_NII.get(), YugitoNiiEntity.createAttributes().build());
		event.put(YAGURA_KARATACHI.get(), YaguraKaratachiEntity.createAttributes().build());
		event.put(ROSHI.get(), RoshiEntity.createAttributes().build());
		event.put(HAN.get(), HanEntity.createAttributes().build());
		event.put(UTAKATA.get(), UtakataEntity.createAttributes().build());
		event.put(FU.get(), FuEntity.createAttributes().build());
		event.put(KILLER_BEE.get(), KillerBeeEntity.createAttributes().build());
		event.put(MU.get(), MuEntity.createAttributes().build());
		event.put(ONOKI.get(), OnokiEntity.createAttributes().build());
		event.put(RAIKAGE.get(), RaikageEntity.createAttributes().build());
		event.put(HOZUKI.get(), HozukiEntity.createAttributes().build());
		event.put(MEI.get(), MeiEntity.createAttributes().build());
		event.put(SHUKAKU.get(), ShukakuEntity.createAttributes().build());
		event.put(TOAD_1.get(), Toad1Entity.createAttributes().build());
	}
}
