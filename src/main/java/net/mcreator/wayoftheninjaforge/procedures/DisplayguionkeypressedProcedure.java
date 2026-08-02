package net.mcreator.wayoftheninjaforge.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.wayoftheninjaforge.world.inventory.GuistatsMenu;
import net.mcreator.wayoftheninjaforge.world.inventory.GuiMenu;
import net.mcreator.wayoftheninjaforge.network.WayOfTheNinjaForge1201ModVariables;

import io.netty.buffer.Unpooled;

public class DisplayguionkeypressedProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(WayOfTheNinjaForge1201ModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WayOfTheNinjaForge1201ModVariables.PlayerVariables())).character_has_been_created == true) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Guistats");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new GuistatsMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			return true;
		}
		if (entity instanceof Player _plr1 && _plr1.containerMenu instanceof GuiMenu) {
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		if (entity instanceof ServerPlayer _ent) {
			BlockPos _bpos = BlockPos.containing(x, y, z);
			NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Gui");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new GuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
				}
			}, _bpos);
		}
		return false;
	}
}
