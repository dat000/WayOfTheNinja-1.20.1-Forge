
package net.mcreator.wayoftheninjaforge.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.wayoftheninjaforge.procedures.KonohaninjaOnInitialEntitySpawnProcedure;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModItems;
import net.mcreator.wayoftheninjaforge.init.WayOfTheNinjaForge1201ModEntities;

import javax.annotation.Nullable;

public class KonohaninjaEntity extends Monster {
	public static final EntityDataAccessor<Integer> DATA_ninja_skin = SynchedEntityData.defineId(KonohaninjaEntity.class, EntityDataSerializers.INT);

	public KonohaninjaEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(WayOfTheNinjaForge1201ModEntities.KONOHANINJA.get(), world);
	}

	public KonohaninjaEntity(EntityType<KonohaninjaEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
		setCustomName(Component.literal("Konoha Ninja"));
		setCustomNameVisible(true);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(WayOfTheNinjaForge1201ModItems.KUNAI_STANDARTITEM.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_ninja_skin, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		KonohaninjaOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Dataninja_skin", this.entityData.get(DATA_ninja_skin));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Dataninja_skin"))
			this.entityData.set(DATA_ninja_skin, compound.getInt("Dataninja_skin"));
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
