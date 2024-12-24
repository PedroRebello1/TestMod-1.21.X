package net.rbellodog.testmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200),0.15f).build();

    public static final FoodComponent GRAPES_FOOD = new FoodComponent.Builder()
            .nutrition(4) // Restores 4 hunger points (2 drumsticks)
            .saturationModifier(0.3f) // Moderate saturation
            .build();
}
