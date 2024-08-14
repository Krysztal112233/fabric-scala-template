package com.example.mixin.client;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import scala.annotation.targetName

@Mixin(Array(classOf[MinecraftClient]))
class ExampleClientMixin {
    @Inject(at = Array(new At(value = "HEAD")), method = Array("run"))
    def init(info: CallbackInfo) = {
        // This code is injected into the start of MinecraftClient.run()V
    }
}
