package com.shnupbups.moadvancements;

import net.fabricmc.fabric.impl.networking.ServerSidePacketRegistryImpl;

import net.minecraft.server.network.ServerPlayerEntity;

public class MoAdvancementsPackets {
	public static void init() {
		ServerSidePacketRegistryImpl.INSTANCE.register(MoAdvancements.OPENED_INVENTORY, ((context, buf) -> {
			MoAdvancementsCriteria.OPENED_INVENTORY_CRITERION.trigger((ServerPlayerEntity) context.getPlayer());
		}));
	}
}
