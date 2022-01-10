package io.github.maheevil.legacytweaks.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientSidePlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientSidePlayerEntity.class)
public class ClientSidePlayerEntityMixin {
    @Redirect(
            method = "tickAI",
            at = @At(
                    value = "FIELD",
                    target = "net/minecraft/client/MinecraftClient.currentScreen:Lnet/minecraft/client/gui/screen/Screen;",
                    ordinal = 0
            )
    )
    public Screen redirectScreen(MinecraftClient instance){
        return null;
    }
}
