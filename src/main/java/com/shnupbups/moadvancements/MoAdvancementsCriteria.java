package com.shnupbups.moadvancements;

import net.fabricmc.fabric.api.object.builder.v1.advancement.CriterionRegistry;
import net.fabricmc.fabric.impl.networking.ServerSidePacketRegistryImpl;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class MoAdvancementsCriteria {

	public static final OpenedInventoryCriterion OPENED_INVENTORY_CRITERION = new OpenedInventoryCriterion(MoAdvancements.OPENED_INVENTORY);

	public static void init() {
		CriterionRegistry.register(OPENED_INVENTORY_CRITERION);
	}
}
