package net.rbellodog.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rbellodog.testmod.TestMod;
import net.rbellodog.testmod.item.custom.ChiselItem;

public class ModItems {
    // Define the food component for the grapes
    private static final FoodComponent GRAPES_FOOD = new FoodComponent.Builder()
            .nutrition(4) // Restores 4 hunger points (2 drumsticks)
            .saturationModifier(0.3f) // Moderate saturation
            .build();

    // Register items
    public static final Item GRAPES = registerItem("grapes", new Item(new Item.Settings().food(GRAPES_FOOD)));
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));


    // New Items
    public static final Item AMETHYST = registerItem("amethyst", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item(new Item.Settings()));
    public static final Item PLATINUM_LUMP = registerItem("platinum_lump", new Item(new Item.Settings()));


    // New Tools
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword", new Item(new Item.Settings()));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", new Item(new Item.Settings()));
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe", new Item(new Item.Settings()));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel", new Item(new Item.Settings()));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe", new Item(new Item.Settings()));

    public static final Item RUBY_SWORD = registerItem("ruby_sword", new Item(new Item.Settings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new Item(new Item.Settings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new Item(new Item.Settings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new Item(new Item.Settings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new Item(new Item.Settings()));

    public static final Item PLATINUM_SWORD = registerItem("platinum_sword", new Item(new Item.Settings()));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe", new Item(new Item.Settings()));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe", new Item(new Item.Settings()));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel", new Item(new Item.Settings()));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe", new Item(new Item.Settings()));


    // Helper method to register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name), item);
    }

    // Register all items and their item groups
    public static void registerModItems() {
        TestMod.LOGGER.info("Registering mod items for " + TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(AMETHYST);
            entries.add(RUBY);
            entries.add(RAW_TITANIUM);
            entries.add(TITANIUM_INGOT);
            entries.add(TITANIUM_NUGGET);
            entries.add(PLATINUM_LUMP);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(GRAPES);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(AMETHYST_SWORD);
            entries.add(AMETHYST_PICKAXE);
            entries.add(AMETHYST_AXE);
            entries.add(AMETHYST_SHOVEL);
            entries.add(AMETHYST_HOE);
            entries.add(RUBY_SWORD);
            entries.add(RUBY_PICKAXE);
            entries.add(RUBY_AXE);
            entries.add(RUBY_SHOVEL);
            entries.add(RUBY_HOE);
            entries.add(PLATINUM_SWORD);
            entries.add(PLATINUM_PICKAXE);
            entries.add(PLATINUM_AXE);
            entries.add(PLATINUM_SHOVEL);
            entries.add(PLATINUM_HOE);
        });
    }
}
