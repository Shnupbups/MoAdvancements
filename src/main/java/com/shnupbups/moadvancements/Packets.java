package com.shnupbups.moadvancements;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.c2s.play.CustomPayloadC2SPacket;
import net.minecraft.util.Identifier;

import io.netty.buffer.Unpooled;

public class Packets {
	@Environment(EnvType.CLIENT)
	public static CustomPayloadC2SPacket createEmptyC2SPacket(Identifier id) {
		PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
		return new CustomPayloadC2SPacket(id, buf);
	}
}
