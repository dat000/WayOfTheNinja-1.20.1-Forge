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
import net.mcreator.wayoftheninjaforge.world.inventory.Guipage2Menu;
import net.mcreator.wayoftheninjaforge.world.inventory.GuiMenu;

import io.netty.buffer.Unpooled;

public class NextbuttonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof GuiMenu) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("debug: closed gui"), false);
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Guipage2");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new Guipage2Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("debug: open guipage2"), false);
		} else if (entity instanceof Player _plr5 && _plr5.containerMenu instanceof Guipage2Menu) {
			if (entity instanceof Player _player)
				_player.closeContainer();
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
		}
	}
}
