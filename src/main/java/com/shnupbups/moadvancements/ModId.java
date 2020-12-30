package com.shnupbups.modid;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

public class ModId implements ModInitializer {
	public static final String MOD_ID = "modid";
	
	@Override
	public void onInitialize() {
	
	}
	
	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}
}
