package de.kxmischesdomi.portal_accessibility.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * @author KxmischesDomi | https://github.com/kxmischesdomi
 * @since 1.0
 */
@Mixin(LocalPlayer.class)
public class LocalPlayerMixin {

	@Redirect(method = "handleNetherPortalClient", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;closeContainer()V"))
	public void handlePortalCloseContainerMixin(LocalPlayer instance) {
	}

	@Redirect(method = "handleNetherPortalClient", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;setScreen(Lnet/minecraft/client/gui/screens/Screen;)V"))
	public void handlePortalCloseContainerMixin(Minecraft instance, Screen screen) {

	}

}
