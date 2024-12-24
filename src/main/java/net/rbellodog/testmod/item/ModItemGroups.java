package net.rbellodog.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rbellodog.testmod.TestMod;
import net.rbellodog.testmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TEST_MOD_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(TestMod.MOD_ID,
                    "test_mod_items"), FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.testmod.test_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                        entries.add(ModItems.GRAPES);
                        entries.add(ModItems.CAULIFLOWER);


                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                        entries.add(ModBlocks.OAK_GRAPE_LEAVES);

                        entries.add(ModItems.CHISEL);

                        entries.add(ModBlocks.MAGIC_BLOCK);


                        // new shit

                        entries.add(ModItems.AMETHYST);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.TITANIUM_NUGGET);
                        entries.add(ModItems.PLATINUM_LUMP);


                        entries.add(ModBlocks.AMETHYST_ORE);
                        entries.add(ModBlocks.DEEPSLATE_AMETHYST_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHERRACK_RUBY_ORE);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);


                        entries.add(ModItems.AMETHYST_SWORD);
                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.AMETHYST_SHOVEL);
                        entries.add(ModItems.AMETHYST_HOE);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.PLATINUM_SWORD);
                        entries.add(ModItems.PLATINUM_PICKAXE);
                        entries.add(ModItems.PLATINUM_AXE);
                        entries.add(ModItems.PLATINUM_SHOVEL);
                        entries.add(ModItems.PLATINUM_HOE);

                    })

            .build());


    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registering Item Groups for " + TestMod.MOD_ID);
    }
}
