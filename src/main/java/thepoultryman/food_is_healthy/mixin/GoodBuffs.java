package thepoultryman.food_is_healthy.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import thepoultryman.food_is_healthy.FoodIsHealthy;
import thepoultryman.food_is_healthy.registry.Tags;

@Mixin(LivingEntity.class)
public abstract class GoodBuffs {
    @Shadow public abstract void heal(float amount);

    @Inject(at = @At("TAIL"), method = "eatFood")
    public void eatFood(World world, ItemStack stack, CallbackInfoReturnable<ItemStack> cir) {
        if (stack.isIn(Tags.HEALTHY_FOODS))
            this.heal(0.5f);
    }
}
