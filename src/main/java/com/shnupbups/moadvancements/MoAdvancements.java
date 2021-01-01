package com.shnupbups.moadvancements;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.advancement.CriterionRegistry;
import net.fabricmc.fabric.impl.networking.ServerSidePacketRegistryImpl;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.UUID;

public class MoAdvancements implements ModInitializer {
	public static final String MOD_ID = "moadvancements";

	public static final Identifier OPENED_INVENTORY = MoAdvancements.id("opened_inventory");

	@Override
	public void onInitialize() {
		MoAdvancementsCriteria.init();
		MoAdvancementsPackets.init();
	}
	
	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
}
