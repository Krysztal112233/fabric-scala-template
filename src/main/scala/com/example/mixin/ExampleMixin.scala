package com.example.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Array(classOf[MinecraftServer]))
class ExampleMixin {
    @Inject(at = Array(new At(value = "HEAD")), method = Array("loadWorld"))
    def init(info: CallbackInfo) = {
        // This code is injected into the start of MinecraftServer.loadWorld()V
    }
}
