package net.mcreator.wayoftheninjaforge.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.wayoftheninjaforge.WayOfTheNinjaForge1201Mod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WayOfTheNinjaForge1201ModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		WayOfTheNinjaForge1201Mod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		WayOfTheNinjaForge1201Mod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.chakra_limit = original.chakra_limit;
			clone.character_body_type = original.character_body_type;
			clone.character_eye_type = original.character_eye_type;
			clone.character_eyes_color = original.character_eyes_color;
			clone.character_eyes_type = original.character_eyes_type;
			clone.character_hair_color = original.character_hair_color;
			clone.character_hair_type = original.character_hair_type;
			clone.character_has_been_created = original.character_has_been_created;
			clone.character_height = original.character_height;
			clone.character_rotation_yaw = original.character_rotation_yaw;
			clone.character_skin_type = original.character_skin_type;
			clone.character_width = original.character_width;
			clone.characterName = original.characterName;
			clone.front_view_character = original.front_view_character;
			clone.half_left_view_character = original.half_left_view_character;
			clone.half_right_view_character = original.half_right_view_character;
			clone.left_view_character = original.left_view_character;
			clone.right_view_character = original.right_view_character;
			clone.page1_completed = original.page1_completed;
			clone.village = original.village;
			clone.village_selected = original.village_selected;
			clone.experiencie_points = original.experiencie_points;
			clone.experience_points_LIMIT = original.experience_points_LIMIT;
			clone.level = original.level;
			clone.talents_points = original.talents_points;
			clone.global_cooldown = original.global_cooldown;
			clone.cooldown = original.cooldown;
			clone.can_use_jutsu = original.can_use_jutsu;
			clone.jutsu_spec = original.jutsu_spec;
			clone.jutsu_selected = original.jutsu_selected;
			clone.ninjutsu_spec_selected = original.ninjutsu_spec_selected;
			clone.taijutsu_spec_selected = original.taijutsu_spec_selected;
			clone.genjutsu_spec_selected = original.genjutsu_spec_selected;
			clone.talent_151_selected = original.talent_151_selected;
			clone.talent_152_selected = original.talent_152_selected;
			clone.talent_153_selected = original.talent_153_selected;
			clone.talent_15_equiped = original.talent_15_equiped;
			clone.debug_mode = original.debug_mode;
			clone.dodge_cd = original.dodge_cd;
			clone.chakra_is_regenerating = original.chakra_is_regenerating;
			clone.character_name = original.character_name;
			clone.clan = original.clan;
			clone.clan_selected = original.clan_selected;
			clone.nature = original.nature;
			clone.is_naruto_running = original.is_naruto_running;
			if (!event.isWasDeath()) {
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					WayOfTheNinjaForge1201Mod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					WayOfTheNinjaForge1201Mod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					WayOfTheNinjaForge1201Mod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "way_of_the_ninja_forge_1_20_1_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "way_of_the_ninja_forge_1_20_1_mapvars";
		public double character_eyes_type_limit = 5.0;
		public double character_hair_color_limit = 5.0;
		public double character_hair_type_limit = 3.0;
		public double character_skin_types_limit = 4.0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			if (nbt == null) {
				nbt = save(new CompoundTag());
			}
			character_eyes_type_limit = nbt.getDouble("character_eyes_type_limit");
			character_hair_color_limit = nbt.getDouble("character_hair_color_limit");
			character_hair_type_limit = nbt.getDouble("character_hair_type_limit");
			character_skin_types_limit = nbt.getDouble("character_skin_types_limit");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("character_eyes_type_limit", character_eyes_type_limit);
			nbt.putDouble("character_hair_color_limit", character_hair_color_limit);
			nbt.putDouble("character_hair_type_limit", character_hair_type_limit);
			nbt.putDouble("character_skin_types_limit", character_skin_types_limit);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("way_of_the_ninja_forge_1_20_1", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double chakra_limit = 100.0;
		public double character_body_type = 0;
		public double character_eye_type = 1.0;
		public double character_eyes_color = 1.0;
		public double character_eyes_type = 1.0;
		public double character_hair_color = 1.0;
		public double character_hair_type = 1.0;
		public boolean character_has_been_created = false;
		public double character_height = 1.0;
		public double character_rotation_yaw = 0;
		public double character_skin_type = 1.0;
		public double character_width = 1.0;
		public String characterName = "\"\"";
		public boolean front_view_character = true;
		public boolean half_left_view_character = false;
		public boolean half_right_view_character = false;
		public boolean left_view_character = false;
		public boolean right_view_character = false;
		public boolean page1_completed = false;
		public double village = 0;
		public boolean village_selected = false;
		public double experiencie_points = 0;
		public double experience_points_LIMIT = 10.0;
		public double level = 0;
		public double talents_points = 0;
		public double global_cooldown = 100.0;
		public boolean cooldown = false;
		public boolean can_use_jutsu = false;
		public double jutsu_spec = 0;
		public boolean jutsu_selected = false;
		public boolean ninjutsu_spec_selected = false;
		public boolean taijutsu_spec_selected = false;
		public boolean genjutsu_spec_selected = false;
		public boolean talent_151_selected = false;
		public boolean talent_152_selected = false;
		public boolean talent_153_selected = false;
		public double talent_15_equiped = 0;
		public boolean debug_mode = false;
		public boolean dodge_cd = false;
		public boolean chakra_is_regenerating = false;
		public String character_name = "\"\"";
		public double clan = 0;
		public boolean clan_selected = false;
		public double nature = 0;
		public boolean is_naruto_running = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				WayOfTheNinjaForge1201Mod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("chakra_limit", chakra_limit);
			nbt.putDouble("character_body_type", character_body_type);
			nbt.putDouble("character_eye_type", character_eye_type);
			nbt.putDouble("character_eyes_color", character_eyes_color);
			nbt.putDouble("character_eyes_type", character_eyes_type);
			nbt.putDouble("character_hair_color", character_hair_color);
			nbt.putDouble("character_hair_type", character_hair_type);
			nbt.putBoolean("character_has_been_created", character_has_been_created);
			nbt.putDouble("character_height", character_height);
			nbt.putDouble("character_rotation_yaw", character_rotation_yaw);
			nbt.putDouble("character_skin_type", character_skin_type);
			nbt.putDouble("character_width", character_width);
			nbt.putString("characterName", characterName);
			nbt.putBoolean("front_view_character", front_view_character);
			nbt.putBoolean("half_left_view_character", half_left_view_character);
			nbt.putBoolean("half_right_view_character", half_right_view_character);
			nbt.putBoolean("left_view_character", left_view_character);
			nbt.putBoolean("right_view_character", right_view_character);
			nbt.putBoolean("page1_completed", page1_completed);
			nbt.putDouble("village", village);
			nbt.putBoolean("village_selected", village_selected);
			nbt.putDouble("experiencie_points", experiencie_points);
			nbt.putDouble("experience_points_LIMIT", experience_points_LIMIT);
			nbt.putDouble("level", level);
			nbt.putDouble("talents_points", talents_points);
			nbt.putDouble("global_cooldown", global_cooldown);
			nbt.putBoolean("cooldown", cooldown);
			nbt.putBoolean("can_use_jutsu", can_use_jutsu);
			nbt.putDouble("jutsu_spec", jutsu_spec);
			nbt.putBoolean("jutsu_selected", jutsu_selected);
			nbt.putBoolean("ninjutsu_spec_selected", ninjutsu_spec_selected);
			nbt.putBoolean("taijutsu_spec_selected", taijutsu_spec_selected);
			nbt.putBoolean("genjutsu_spec_selected", genjutsu_spec_selected);
			nbt.putBoolean("talent_151_selected", talent_151_selected);
			nbt.putBoolean("talent_152_selected", talent_152_selected);
			nbt.putBoolean("talent_153_selected", talent_153_selected);
			nbt.putDouble("talent_15_equiped", talent_15_equiped);
			nbt.putBoolean("debug_mode", debug_mode);
			nbt.putBoolean("dodge_cd", dodge_cd);
			nbt.putBoolean("chakra_is_regenerating", chakra_is_regenerating);
			nbt.putString("character_name", character_name);
			nbt.putDouble("clan", clan);
			nbt.putBoolean("clan_selected", clan_selected);
			nbt.putDouble("nature", nature);
			nbt.putBoolean("is_naruto_running", is_naruto_running);
			return nbt;
		}

		public void readNBT(Tag tag) {
			if (tag == null) {
				tag = writeNBT();
			}
			CompoundTag nbt = (CompoundTag) tag;
			if (nbt == null) {
				nbt = (CompoundTag) writeNBT();
			}
			chakra_limit = nbt.getDouble("chakra_limit");
			character_body_type = nbt.getDouble("character_body_type");
			character_eye_type = nbt.getDouble("character_eye_type");
			character_eyes_color = nbt.getDouble("character_eyes_color");
			character_eyes_type = nbt.getDouble("character_eyes_type");
			character_hair_color = nbt.getDouble("character_hair_color");
			character_hair_type = nbt.getDouble("character_hair_type");
			character_has_been_created = nbt.getBoolean("character_has_been_created");
			character_height = nbt.getDouble("character_height");
			character_rotation_yaw = nbt.getDouble("character_rotation_yaw");
			character_skin_type = nbt.getDouble("character_skin_type");
			character_width = nbt.getDouble("character_width");
			characterName = nbt.getString("characterName");
			front_view_character = nbt.getBoolean("front_view_character");
			half_left_view_character = nbt.getBoolean("half_left_view_character");
			half_right_view_character = nbt.getBoolean("half_right_view_character");
			left_view_character = nbt.getBoolean("left_view_character");
			right_view_character = nbt.getBoolean("right_view_character");
			page1_completed = nbt.getBoolean("page1_completed");
			village = nbt.getDouble("village");
			village_selected = nbt.getBoolean("village_selected");
			experiencie_points = nbt.getDouble("experiencie_points");
			experience_points_LIMIT = nbt.getDouble("experience_points_LIMIT");
			level = nbt.getDouble("level");
			talents_points = nbt.getDouble("talents_points");
			global_cooldown = nbt.getDouble("global_cooldown");
			cooldown = nbt.getBoolean("cooldown");
			can_use_jutsu = nbt.getBoolean("can_use_jutsu");
			jutsu_spec = nbt.getDouble("jutsu_spec");
			jutsu_selected = nbt.getBoolean("jutsu_selected");
			ninjutsu_spec_selected = nbt.getBoolean("ninjutsu_spec_selected");
			taijutsu_spec_selected = nbt.getBoolean("taijutsu_spec_selected");
			genjutsu_spec_selected = nbt.getBoolean("genjutsu_spec_selected");
			talent_151_selected = nbt.getBoolean("talent_151_selected");
			talent_152_selected = nbt.getBoolean("talent_152_selected");
			talent_153_selected = nbt.getBoolean("talent_153_selected");
			talent_15_equiped = nbt.getDouble("talent_15_equiped");
			debug_mode = nbt.getBoolean("debug_mode");
			dodge_cd = nbt.getBoolean("dodge_cd");
			chakra_is_regenerating = nbt.getBoolean("chakra_is_regenerating");
			character_name = nbt.getString("character_name");
			clan = nbt.getDouble("clan");
			clan_selected = nbt.getBoolean("clan_selected");
			nature = nbt.getDouble("nature");
			is_naruto_running = nbt.getBoolean("is_naruto_running");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WayOfTheNinjaForge1201Mod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.chakra_limit = message.data.chakra_limit;
					variables.character_body_type = message.data.character_body_type;
					variables.character_eye_type = message.data.character_eye_type;
					variables.character_eyes_color = message.data.character_eyes_color;
					variables.character_eyes_type = message.data.character_eyes_type;
					variables.character_hair_color = message.data.character_hair_color;
					variables.character_hair_type = message.data.character_hair_type;
					variables.character_has_been_created = message.data.character_has_been_created;
					variables.character_height = message.data.character_height;
					variables.character_rotation_yaw = message.data.character_rotation_yaw;
					variables.character_skin_type = message.data.character_skin_type;
					variables.character_width = message.data.character_width;
					variables.characterName = message.data.characterName;
					variables.front_view_character = message.data.front_view_character;
					variables.half_left_view_character = message.data.half_left_view_character;
					variables.half_right_view_character = message.data.half_right_view_character;
					variables.left_view_character = message.data.left_view_character;
					variables.right_view_character = message.data.right_view_character;
					variables.page1_completed = message.data.page1_completed;
					variables.village = message.data.village;
					variables.village_selected = message.data.village_selected;
					variables.experiencie_points = message.data.experiencie_points;
					variables.experience_points_LIMIT = message.data.experience_points_LIMIT;
					variables.level = message.data.level;
					variables.talents_points = message.data.talents_points;
					variables.global_cooldown = message.data.global_cooldown;
					variables.cooldown = message.data.cooldown;
					variables.can_use_jutsu = message.data.can_use_jutsu;
					variables.jutsu_spec = message.data.jutsu_spec;
					variables.jutsu_selected = message.data.jutsu_selected;
					variables.ninjutsu_spec_selected = message.data.ninjutsu_spec_selected;
					variables.taijutsu_spec_selected = message.data.taijutsu_spec_selected;
					variables.genjutsu_spec_selected = message.data.genjutsu_spec_selected;
					variables.talent_151_selected = message.data.talent_151_selected;
					variables.talent_152_selected = message.data.talent_152_selected;
					variables.talent_153_selected = message.data.talent_153_selected;
					variables.talent_15_equiped = message.data.talent_15_equiped;
					variables.debug_mode = message.data.debug_mode;
					variables.dodge_cd = message.data.dodge_cd;
					variables.chakra_is_regenerating = message.data.chakra_is_regenerating;
					variables.character_name = message.data.character_name;
					variables.clan = message.data.clan;
					variables.clan_selected = message.data.clan_selected;
					variables.nature = message.data.nature;
					variables.is_naruto_running = message.data.is_naruto_running;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
