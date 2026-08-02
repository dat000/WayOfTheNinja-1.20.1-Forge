
package net.mcreator.wayoftheninjaforge.item;

import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.wayoftheninjaforge.client.model.Modeluchiha_guard_chestplate;

import java.util.function.Consumer;
import java.util.Map;
import java.util.Collections;

public abstract class SasukearmorItem extends ArmorItem {
	public SasukearmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 15;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{2, 5, 6, 2}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "sasukearmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Chestplate extends SasukearmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("body", new Modeluchiha_guard_chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(Modeluchiha_guard_chestplate.LAYER_LOCATION)).jonin_chestplate, "left_arm",
									new Modeluchiha_guard_chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(Modeluchiha_guard_chestplate.LAYER_LOCATION)).jonin_left_arm, "right_arm",
									new Modeluchiha_guard_chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(Modeluchiha_guard_chestplate.LAYER_LOCATION)).jonin_right_arm, "head",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
									"left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "way_of_the_ninja_forge_1_20_1:textures/entities/sasuke_chestplate_texture.png";
		}
	}

	public static class Leggings extends SasukearmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "way_of_the_ninja_forge_1_20_1:textures/models/armor/default_preset_armor_layer_2.png";
		}
	}

	public static class Boots extends SasukearmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "way_of_the_ninja_forge_1_20_1:textures/models/armor/default_preset_armor_layer_1.png";
		}
	}
}
