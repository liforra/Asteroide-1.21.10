package spigey.asteroide.mixin;

import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.text.*;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import spigey.asteroide.modules.ClickEventsModule;

@Mixin(ChatHud.class)
public class ChatHudMixin {
    @ModifyVariable( method = "addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V", at = @At("HEAD"), index = 1, argsOnly = true )
    private Text commandInspect(Text value) {
        try {
            // Simply pass through messages - HoverEvent/ClickEvent customization disabled for 1.21.10
            return value;
        } catch(Exception e) {
            return value;
        }
    }

    @Inject(method = "mouseClicked(DD)Z", at = @At("HEAD"), cancellable = true)
    private void onMouseClicked(double mouseX, double mouseY, CallbackInfoReturnable<Boolean> cir) {
        // TODO: Disabled - ClickEvent is an interface in 1.21.10, needs proper implementation
    }
}
