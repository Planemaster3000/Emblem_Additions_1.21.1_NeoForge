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
                    .icon(() -> new ItemStack(QUARTZ_TILES_WHITE_SMOKY.get()))
                    .title(Component.translatable("creativetab.emblem_stuff.emblem_additions"))
                    .displayItems((parameters, output) -> {
                        output.accept(MOSS_CLUMP.get());
                        output.accept(ELDER_PRISMARINE_SHARD.get());
                        output.accept(ROSE_QUARTZ.get());
                        output.accept(SMOKY_QUARTZ.get());
                        output.accept(SOUL_QUARTZ.get());

                        output.accept(QUARTZ_CHISEL.get());

                        output.accept(CRACKED_STONE_BRICK_STAIRS.get());
                        output.accept(CRACKED_STONE_BRICK_SLAB.get());
                        output.accept(CRACKED_STONE_BRICK_WALL.get());
                        output.accept(MOSSY_CHISILED_STONE_BRICKS.get());
                        output.accept(CRACKED_CHISILED_STONE_BRICKS.get());
                        output.accept(STONE_BRICK_PILLAR.get());
                        output.accept(MOSSY_STONE_BRICK_PILLAR.get());
                        output.accept(CRACKED_STONE_BRICK_PILLAR.get());
                        output.accept(MOSSY_COBBLED_DEEPSLATE.get());
                        output.accept(MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
                        output.accept(MOSSY_COBBLED_DEEPSLATE_SLAB.get());
                        output.accept(MOSSY_COBBLED_DEEPSLATE_WALL.get());
                        output.accept(MOSSY_DEEPSLATE_BRICKS.get());
                        output.accept(MOSSY_DEEPSLATE_BRICK_STAIRS.get());
                        output.accept(MOSSY_DEEPSLATE_BRICK_SLAB.get());
                        output.accept(MOSSY_DEEPSLATE_BRICK_WALL.get());
                        output.accept(CRACKED_DEEPSLATE_BRICK_STAIRS.get());
                        output.accept(CRACKED_DEEPSLATE_BRICK_SLAB.get());
                        output.accept(CRACKED_DEEPSLATE_BRICK_WALL.get());
                        output.accept(MOSSY_DEEPSLATE_TILES.get());
                        output.accept(MOSSY_DEEPSLATE_TILE_STAIRS.get());
                        output.accept(MOSSY_DEEPSLATE_TILE_SLAB.get());
                        output.accept(MOSSY_DEEPSLATE_TILE_WALL.get());
                        output.accept(CRACKED_DEEPSLATE_TILE_STAIRS.get());
                        output.accept(CRACKED_DEEPSLATE_TILE_SLAB.get());
                        output.accept(CRACKED_DEEPSLATE_TILE_WALL.get());
                        output.accept(POLISHED_GRANITE_WALL.get());
                        output.accept(GRANITE_BRICKS.get());
                        output.accept(GRANITE_BRICK_STAIRS.get());
                        output.accept(GRANITE_BRICK_SLAB.get());
                        output.accept(GRANITE_BRICK_WALL.get());
                        output.accept(CHISELED_GRANITE_BRICKS.get());
                        output.accept(POLISHED_DIORITE_WALL.get());
                        output.accept(DIORITE_BRICKS.get());
                        output.accept(DIORITE_BRICK_STAIRS.get());
                        output.accept(DIORITE_BRICK_SLAB.get());
                        output.accept(DIORITE_BRICK_WALL.get());
                        output.accept(CHISELED_DIORITE_BRICKS.get());
                        output.accept(POLISHED_ANDESITE_WALL.get());
                        output.accept(ANDESITE_BRICKS.get());
                        output.accept(ANDESITE_BRICK_STAIRS.get());
                        output.accept(ANDESITE_BRICK_SLAB.get());
                        output.accept(ANDESITE_BRICK_WALL.get());
                        output.accept(CHISELED_ANDESITE_BRICKS.get());
                        output.accept(DRIPSTONE_STAIRS.get());
                        output.accept(DRIPSTONE_SLAB.get());
                        output.accept(DRIPSTONE_WALL.get());
                        output.accept(POLISHED_DRIPSTONE.get());
                        output.accept(POLISHED_DRIPSTONE_STAIRS.get());
                        output.accept(POLISHED_DRIPSTONE_SLAB.get());
                        output.accept(POLISHED_DRIPSTONE_WALL.get());
                        output.accept(DRIPSTONE_BRICKS.get());
                        output.accept(DRIPSTONE_BRICK_STAIRS.get());
                        output.accept(DRIPSTONE_BRICK_SLAB.get());
                        output.accept(DRIPSTONE_BRICK_WALL.get());
                        output.accept(CHISELED_DRIPSTONE_BRICKS.get());
                        output.accept(MOSSY_BRICKS.get());
                        output.accept(MOSSY_BRICK_STAIRS.get());
                        output.accept(MOSSY_BRICK_SLAB.get());
                        output.accept(MOSSY_BRICK_WALL.get());
                        output.accept(CRACKED_BRICKS.get());
                        output.accept(CRACKED_BRICK_STAIRS.get());
                        output.accept(CRACKED_BRICK_SLAB.get());
                        output.accept(CRACKED_BRICK_WALL.get());
                        output.accept(RUINED_BRICKS.get());
                        output.accept(RUINED_BRICK_STAIRS.get());
                        output.accept(RUINED_BRICK_SLAB.get());
                        output.accept(RUINED_BRICK_WALL.get());
                        output.accept(POLISHED_PRISMARINE.get());   //PRISMARINE SETS
                        output.accept(POLISHED_PRISMARINE_STAIRS.get());
                        output.accept(POLISHED_PRISMARINE_SLAB.get());
                        output.accept(POLISHED_PRISMARINE_WALL.get());
                        output.accept(PRISMARINE_BRICK_WALL.get());
                        output.accept(CHISELED_PRISMARINE_BRICKS.get());
                        output.accept(DARK_PRISMARINE_WALL.get());
                        output.accept(ELDER_SEA_LANTERN.get());
                        output.accept(ELDER_PRISMARINE.get());
                        output.accept(ELDER_PRISMARINE_STAIRS.get());
                        output.accept(ELDER_PRISMARINE_SLAB.get());
                        output.accept(ELDER_PRISMARINE_WALL.get());
                        output.accept(POLISHED_ELDER_PRISMARINE.get());
                        output.accept(POLISHED_ELDER_PRISMARINE_STAIRS.get());
                        output.accept(POLISHED_ELDER_PRISMARINE_SLAB.get());
                        output.accept(POLISHED_ELDER_PRISMARINE_WALL.get());
                        output.accept(ELDER_PRISMARINE_BRICKS.get());
                        output.accept(ELDER_PRISMARINE_BRICK_STAIRS.get());
                        output.accept(ELDER_PRISMARINE_BRICK_SLAB.get());
                        output.accept(ELDER_PRISMARINE_BRICK_WALL.get());
                        output.accept(CHISELED_ELDER_PRISMARINE_BRICKS.get());
                        output.accept(DARK_ELDER_PRISMARINE.get());
                        output.accept(DARK_ELDER_PRISMARINE_STAIRS.get());
                        output.accept(DARK_ELDER_PRISMARINE_SLAB.get());
                        output.accept(DARK_ELDER_PRISMARINE_WALL.get());
                        output.accept(NETHER_ROSE_QUARTZ_ORE.get());    //QUARTZ SETS
                        output.accept(NETHER_SMOKY_QUARTZ_ORE.get());
                        output.accept(QUARTZ_BRICK_STAIRS.get());
                        output.accept(QUARTZ_BRICK_SLAB.get());
                        output.accept(WHITE_QUARTZ_TILES.get());
                        output.accept(ROSE_QUARTZ_BLOCK.get());
                        output.accept(ROSE_QUARTZ_STAIRS.get());
                        output.accept(ROSE_QUARTZ_SLAB.get());
                        output.accept(CHISELED_ROSE_QUARTZ_BLOCK.get());
                        output.accept(ROSE_QUARTZ_PILLAR.get());
                        output.accept(ROSE_QUARTZ_BRICKS.get());
                        output.accept(ROSE_QUARTZ_BRICK_STAIRS.get());
                        output.accept(ROSE_QUARTZ_BRICK_SLAB.get());
                        output.accept(ROSE_QUARTZ_TILES.get());
                        output.accept(SMOOTH_ROSE_QUARTZ.get());
                        output.accept(SMOOTH_ROSE_QUARTZ_STAIRS.get());
                        output.accept(SMOOTH_ROSE_QUARTZ_SLAB.get());
                        output.accept(SMOKY_QUARTZ_BLOCK.get());
                        output.accept(SMOKY_QUARTZ_STAIRS.get());
                        output.accept(SMOKY_QUARTZ_SLAB.get());
                        output.accept(CHISELED_SMOKY_QUARTZ_BLOCK.get());
                        output.accept(SMOKY_QUARTZ_PILLAR.get());
                        output.accept(SMOKY_QUARTZ_BRICKS.get());
                        output.accept(SMOKY_QUARTZ_BRICK_STAIRS.get());
                        output.accept(SMOKY_QUARTZ_BRICK_SLAB.get());
                        output.accept(SMOKY_QUARTZ_TILES.get());
                        output.accept(SMOOTH_SMOKY_QUARTZ.get());
                        output.accept(SMOOTH_SMOKY_QUARTZ_STAIRS.get());
                        output.accept(SMOOTH_SMOKY_QUARTZ_SLAB.get());
                        output.accept(SOUL_QUARTZ_BLOCK.get());
                        output.accept(SOUL_QUARTZ_STAIRS.get());
                        output.accept(SOUL_QUARTZ_SLAB.get());
                        output.accept(CHISELED_SOUL_QUARTZ_BLOCK.get());
                        output.accept(SOUL_QUARTZ_PILLAR.get());
                        output.accept(SOUL_QUARTZ_BRICKS.get());
                        output.accept(SOUL_QUARTZ_BRICK_STAIRS.get());
                        output.accept(SOUL_QUARTZ_BRICK_SLAB.get());
                        output.accept(SOUL_QUARTZ_TILES.get());
                        output.accept(SMOOTH_SOUL_QUARTZ.get());
                        output.accept(SMOOTH_SOUL_QUARTZ_STAIRS.get());
                        output.accept(SMOOTH_SOUL_QUARTZ_SLAB.get());
                        output.accept(POLISHED_AMETHYST.get());
                        output.accept(POLISHED_AMETHYST_STAIRS.get());
                        output.accept(POLISHED_AMETHYST_SLAB.get());
                        output.accept(CHISELED_AMETHYST_BLOCK.get());
                        output.accept(AMETHYST_PILLAR.get());
                        output.accept(AMETHYST_BRICKS.get());
                        output.accept(AMETHYST_BRICK_STAIRS.get());
                        output.accept(AMETHYST_BRICK_SLAB.get());
                        output.accept(AMETHYST_TILES.get());
                        output.accept(SMOOTH_AMETHYST.get());
                        output.accept(SMOOTH_AMETHYST_STAIRS.get());
                        output.accept(SMOOTH_AMETHYST_SLAB.get());
                        output.accept(QUARTZ_TILES_WHITE_ROSE.get());
                        output.accept(QUARTZ_TILES_WHITE_SMOKY.get());
                        output.accept(QUARTZ_TILES_ROSE_SMOKY.get());
                        output.accept(QUARTZ_TILES_WHITE_SOUL.get());
                        output.accept(QUARTZ_TILES_SOUL_ROSE.get());
                        output.accept(QUARTZ_TILES_SOUL_SMOKY.get());
                        output.accept(QUARTZ_TILES_WHITE_AMETHYST.get());
                        output.accept(QUARTZ_TILES_ROSE_AMETHYST.get());
                        output.accept(QUARTZ_TILES_SMOKY_AMETHYST.get());
                        output.accept(QUARTZ_TILES_SOUL_AMETHYST.get());    //QUARTZ SETS END
                        output.accept(ModItems.BLAZE_BLOCK.get());

                        output.accept(BLANK_SMITHING_TEMPLATE.get());

                        output.accept(INFESTED_MOSSY_CHISILED_STONE_BRICKS.get());
                        output.accept(INFESTED_CRACKED_CHISILED_STONE_BRICKS.get());
                        output.accept(INFESTED_STONE_BRICK_PILLAR.get());
                        output.accept(INFESTED_MOSSY_STONE_BRICK_PILLAR.get());
                        output.accept(INFESTED_CRACKED_STONE_BRICK_PILLAR.get());

                        //output.accept(.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
