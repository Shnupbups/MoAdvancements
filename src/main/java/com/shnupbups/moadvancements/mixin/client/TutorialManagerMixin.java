package com.shnupbups.moadvancements.mixin.client;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.tutorial.TutorialManager;

import com.shnupbups.moadvancements.MoAdvancements;
import com.shnupbups.moadvancements.Packets;

@Mixin(TutorialManager.class)
public abstract class TutorialManagerMixin {
	@Inject(method= "onInventoryOpened()V", at = @At("HEAD"))
	public void sendInventoryOpenedPacket(CallbackInfo ci) {
		MinecraftClient.getInstance().getNetworkHandler().getConnection().send(Packets.createEmptyC2SPacket(MoAdvancements.OPENED_INVENTORY));
	}
}
