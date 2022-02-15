package thepoultryman.food_is_healthy.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import thepoultryman.food_is_healthy.FoodIsHealthy;

@Mixin(TitleScreen.class)
public class FoodIsHealthyMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		FoodIsHealthy.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
