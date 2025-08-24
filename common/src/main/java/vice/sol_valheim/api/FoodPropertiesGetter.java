package vice.sol_valheim.api;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;

public interface FoodPropertiesGetter {
    FoodProperties get(ItemStack stack);
}
