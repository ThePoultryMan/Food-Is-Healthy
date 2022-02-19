package thepoultryman.food_is_healthy.registry;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class Tags {
    // Common Tags
    public static final Tag<Item> HEALTHY_FOODS = TagFactory.ITEM.create(new Identifier("c", "healthy_foods"));
}
