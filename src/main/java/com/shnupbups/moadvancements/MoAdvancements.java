package com.shnupbups.moadvancements;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

public class MoAdvancements implements ModInitializer {
	public static final String MOD_ID = "moadvancements";
	
	@Override
	public void onInitialize() {
	
	}
	
	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
}
