package net.tosiv.simplycotton.mixin;

import net.minecraft.client.MinecraftClient;
import net.tosiv.simplycotton.SimplyCotton;
import net.tosiv.simplycotton.config.SimplyCottonConfig;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.concurrent.CompletableFuture;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
	@Shadow
	@Nullable
	private CompletableFuture<Void> resourceReloadFuture;



	@Inject(method = "reloadResources(Z)Ljava/util/concurrent/CompletableFuture;",at = @At("RETURN"))
	public void reloadMixin(boolean force, CallbackInfoReturnable<CompletableFuture<Void>> cir){
		if (resourceReloadFuture==null){
			SimplyCottonConfig.readData();
			SimplyCotton.LOGGER.info("Reconfigured Simply Cotton");
		}
	}
}
