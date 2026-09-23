package com.Emblem_Studios.Emblem_Additions.item;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.Emblem_Studios.Emblem_Additions.block.ModBlocks.*;
import static com.Emblem_Studios.Emblem_Additions.item.ModItems.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Emblem_Additions.MOD_ID);

    public static final Supplier<CreativeModeTab> EMBLEM_ADDITIONS_TAB = CREATIVE_MODE_TABS.register("emblem_additions_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(QUARTZ_TILES_WHITE_SMOKY))
                    .title(Component.translatable("creativetab.emblem_stuff.emblem_additions"))
                    .displayItems((parameters, output) -> {
                        output.accept(MOSS_CLUMP);
                        output.accept(ELDER_PRISMARINE_SHARD);
                        output.accept(ROSE_QUARTZ);
                        output.accept(SMOKY_QUARTZ);
                        output.accept(SOUL_QUARTZ);

                        output.accept(QUARTZ_CHISEL);

                        output.accept(CRACKED_STONE_BRICK_STAIRS);
                        output.accept(CRACKED_STONE_BRICK_SLAB);
                        output.accept(CRACKED_STONE_BRICK_WALL);
                        output.accept(MOSSY_CHISILED_STONE_BRICKS);
                        output.accept(CRACKED_CHISILED_STONE_BRICKS);
                        output.accept(STONE_BRICK_PILLAR);
                        output.accept(MOSSY_STONE_BRICK_PILLAR);
                        output.accept(CRACKED_STONE_BRICK_PILLAR);
                        output.accept(MOSSY_COBBLED_DEEPSLATE);
                        output.accept(MOSSY_COBBLED_DEEPSLATE_STAIRS);
                        output.accept(MOSSY_COBBLED_DEEPSLATE_SLAB);
                        output.accept(MOSSY_COBBLED_DEEPSLATE_WALL);
                        output.accept(MOSSY_DEEPSLATE_BRICKS);
                        output.accept(MOSSY_DEEPSLATE_BRICK_STAIRS);
                        output.accept(MOSSY_DEEPSLATE_BRICK_SLAB);
                        output.accept(MOSSY_DEEPSLATE_BRICK_WALL);
                        output.accept(CRACKED_DEEPSLATE_BRICK_STAIRS);
                        output.accept(CRACKED_DEEPSLATE_BRICK_SLAB);
                        output.accept(CRACKED_DEEPSLATE_BRICK_WALL);
                        output.accept(MOSSY_DEEPSLATE_TILES);
                        output.accept(MOSSY_DEEPSLATE_TILE_STAIRS);
                        output.accept(MOSSY_DEEPSLATE_TILE_SLAB);
                        output.accept(MOSSY_DEEPSLATE_TILE_WALL);
                        output.accept(CRACKED_DEEPSLATE_TILE_STAIRS);
                        output.accept(CRACKED_DEEPSLATE_TILE_SLAB);
                        output.accept(CRACKED_DEEPSLATE_TILE_WALL);
                        output.accept(POLISHED_GRANITE_WALL);
                        output.accept(GRANITE_BRICKS);
                        output.accept(GRANITE_BRICK_STAIRS);
                        output.accept(GRANITE_BRICK_SLAB);
                        output.accept(GRANITE_BRICK_WALL);
                        output.accept(CHISELED_GRANITE_BRICKS);
                        output.accept(POLISHED_DIORITE_WALL);
                        output.accept(DIORITE_BRICKS);
                        output.accept(DIORITE_BRICK_STAIRS);
                        output.accept(DIORITE_BRICK_SLAB);
                        output.accept(DIORITE_BRICK_WALL);
                        output.accept(CHISELED_DIORITE_BRICKS);
                        output.accept(POLISHED_ANDESITE_WALL);
                        output.accept(ANDESITE_BRICKS);
                        output.accept(ANDESITE_BRICK_STAIRS);
                        output.accept(ANDESITE_BRICK_SLAB);
                        output.accept(ANDESITE_BRICK_WALL);
                        output.accept(CHISELED_ANDESITE_BRICKS);
                        output.accept(DRIPSTONE_STAIRS);
                        output.accept(DRIPSTONE_SLAB);
                        output.accept(DRIPSTONE_WALL);
                        output.accept(POLISHED_DRIPSTONE);
                        output.accept(POLISHED_DRIPSTONE_STAIRS);
                        output.accept(POLISHED_DRIPSTONE_SLAB);
                        output.accept(POLISHED_DRIPSTONE_WALL);
                        output.accept(DRIPSTONE_BRICKS);
                        output.accept(DRIPSTONE_BRICK_STAIRS);
                        output.accept(DRIPSTONE_BRICK_SLAB);
                        output.accept(DRIPSTONE_BRICK_WALL);
                        output.accept(CHISELED_DRIPSTONE_BRICKS);
                        output.accept(MOSSY_BRICKS);
                        output.accept(MOSSY_BRICK_STAIRS);
                        output.accept(MOSSY_BRICK_SLAB);
                        output.accept(MOSSY_BRICK_WALL);
                        output.accept(CRACKED_BRICKS);
                        output.accept(CRACKED_BRICK_STAIRS);
                        output.accept(CRACKED_BRICK_SLAB);
                        output.accept(CRACKED_BRICK_WALL);
                        output.accept(RUINED_BRICKS);
                        output.accept(RUINED_BRICK_STAIRS);
                        output.accept(RUINED_BRICK_SLAB);
                        output.accept(RUINED_BRICK_WALL);
                        output.accept(POLISHED_PRISMARINE);   //PRISMARINE SETS
                        output.accept(POLISHED_PRISMARINE_STAIRS);
                        output.accept(POLISHED_PRISMARINE_SLAB);
                        output.accept(POLISHED_PRISMARINE_WALL);
                        output.accept(PRISMARINE_BRICK_WALL);
                        output.accept(CHISELED_PRISMARINE_BRICKS);
                        output.accept(DARK_PRISMARINE_WALL);
                        output.accept(ELDER_SEA_LANTERN);
                        output.accept(ELDER_PRISMARINE);
                        output.accept(ELDER_PRISMARINE_STAIRS);
                        output.accept(ELDER_PRISMARINE_SLAB);
                        output.accept(ELDER_PRISMARINE_WALL);
                        output.accept(POLISHED_ELDER_PRISMARINE);
                        output.accept(POLISHED_ELDER_PRISMARINE_STAIRS);
                        output.accept(POLISHED_ELDER_PRISMARINE_SLAB);
                        output.accept(POLISHED_ELDER_PRISMARINE_WALL);
                        output.accept(ELDER_PRISMARINE_BRICKS);
                        output.accept(ELDER_PRISMARINE_BRICK_STAIRS);
                        output.accept(ELDER_PRISMARINE_BRICK_SLAB);
                        output.accept(ELDER_PRISMARINE_BRICK_WALL);
                        output.accept(CHISELED_ELDER_PRISMARINE_BRICKS);
                        output.accept(DARK_ELDER_PRISMARINE);
                        output.accept(DARK_ELDER_PRISMARINE_STAIRS);
                        output.accept(DARK_ELDER_PRISMARINE_SLAB);
                        output.accept(DARK_ELDER_PRISMARINE_WALL);
                        output.accept(NETHER_ROSE_QUARTZ_ORE);    //QUARTZ SETS
                        output.accept(NETHER_SMOKY_QUARTZ_ORE);
                        output.accept(QUARTZ_BRICK_STAIRS);
                        output.accept(QUARTZ_BRICK_SLAB);
                        output.accept(WHITE_QUARTZ_TILES);
                        output.accept(ROSE_QUARTZ_BLOCK);
                        output.accept(ROSE_QUARTZ_STAIRS);
                        output.accept(ROSE_QUARTZ_SLAB);
                        output.accept(CHISELED_ROSE_QUARTZ_BLOCK);
                        output.accept(ROSE_QUARTZ_PILLAR);
                        output.accept(ROSE_QUARTZ_BRICKS);
                        output.accept(ROSE_QUARTZ_BRICK_STAIRS);
                        output.accept(ROSE_QUARTZ_BRICK_SLAB);
                        output.accept(ROSE_QUARTZ_TILES);
                        output.accept(SMOOTH_ROSE_QUARTZ);
                        output.accept(SMOOTH_ROSE_QUARTZ_STAIRS);
                        output.accept(SMOOTH_ROSE_QUARTZ_SLAB);
                        output.accept(SMOKY_QUARTZ_BLOCK);
                        output.accept(SMOKY_QUARTZ_STAIRS);
                        output.accept(SMOKY_QUARTZ_SLAB);
                        output.accept(CHISELED_SMOKY_QUARTZ_BLOCK);
                        output.accept(SMOKY_QUARTZ_PILLAR);
                        output.accept(SMOKY_QUARTZ_BRICKS);
                        output.accept(SMOKY_QUARTZ_BRICK_STAIRS);
                        output.accept(SMOKY_QUARTZ_BRICK_SLAB);
                        output.accept(SMOKY_QUARTZ_TILES);
                        output.accept(SMOOTH_SMOKY_QUARTZ);
                        output.accept(SMOOTH_SMOKY_QUARTZ_STAIRS);
                        output.accept(SMOOTH_SMOKY_QUARTZ_SLAB);
                        output.accept(SOUL_QUARTZ_BLOCK);
                        output.accept(SOUL_QUARTZ_STAIRS);
                        output.accept(SOUL_QUARTZ_SLAB);
                        output.accept(CHISELED_SOUL_QUARTZ_BLOCK);
                        output.accept(SOUL_QUARTZ_PILLAR);
                        output.accept(SOUL_QUARTZ_BRICKS);
                        output.accept(SOUL_QUARTZ_BRICK_STAIRS);
                        output.accept(SOUL_QUARTZ_BRICK_SLAB);
                        output.accept(SOUL_QUARTZ_TILES);
                        output.accept(SMOOTH_SOUL_QUARTZ);
                        output.accept(SMOOTH_SOUL_QUARTZ_STAIRS);
                        output.accept(SMOOTH_SOUL_QUARTZ_SLAB);
                        output.accept(POLISHED_AMETHYST);
                        output.accept(POLISHED_AMETHYST_STAIRS);
                        output.accept(POLISHED_AMETHYST_SLAB);
                        output.accept(CHISELED_AMETHYST_BLOCK);
                        output.accept(AMETHYST_PILLAR);
                        output.accept(AMETHYST_BRICKS);
                        output.accept(AMETHYST_BRICK_STAIRS);
                        output.accept(AMETHYST_BRICK_SLAB);
                        output.accept(AMETHYST_TILES);
                        output.accept(SMOOTH_AMETHYST);
                        output.accept(SMOOTH_AMETHYST_STAIRS);
                        output.accept(SMOOTH_AMETHYST_SLAB);
                        output.accept(QUARTZ_TILES_WHITE_ROSE);
                        output.accept(QUARTZ_TILES_WHITE_SMOKY);
                        output.accept(QUARTZ_TILES_ROSE_SMOKY);
                        output.accept(QUARTZ_TILES_WHITE_SOUL);
                        output.accept(QUARTZ_TILES_SOUL_ROSE);
                        output.accept(QUARTZ_TILES_SOUL_SMOKY);
                        output.accept(QUARTZ_TILES_WHITE_AMETHYST);
                        output.accept(QUARTZ_TILES_ROSE_AMETHYST);
                        output.accept(QUARTZ_TILES_SMOKY_AMETHYST);
                        output.accept(QUARTZ_TILES_SOUL_AMETHYST);    //QUARTZ SETS END
                        output.accept(ModItems.BLAZE_BLOCK);
                        output.accept(BREEZE_BLOCK);

                        output.accept(BLANK_SMITHING_TEMPLATE);

                        output.accept(INFESTED_MOSSY_CHISILED_STONE_BRICKS);
                        output.accept(INFESTED_CRACKED_CHISILED_STONE_BRICKS);
                        output.accept(INFESTED_STONE_BRICK_PILLAR);
                        output.accept(INFESTED_MOSSY_STONE_BRICK_PILLAR);
                        output.accept(INFESTED_CRACKED_STONE_BRICK_PILLAR);

                        //output.accept();
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
