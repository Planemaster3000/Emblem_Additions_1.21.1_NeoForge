package com.Emblem_Studios.Emblem_Additions.block;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import com.Emblem_Studios.Emblem_Additions.block.custom.AmethystPillarBlock;
import com.Emblem_Studios.Emblem_Additions.block.custom.AmethystSlabBlock;
import com.Emblem_Studios.Emblem_Additions.block.custom.AmethystStairBlock;
import com.Emblem_Studios.Emblem_Additions.block.custom.QuartzTileBlock;
import com.Emblem_Studios.Emblem_Additions.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Emblem_Additions.MOD_ID);

    //Stone Blocks
    public static final DeferredBlock<StairBlock> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            () -> new StairBlock(Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> MOSSY_CHISILED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CRACKED_CHISILED_STONE_BRICKS = registerBlock("cracked_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<RotatedPillarBlock> STONE_BRICK_PILLAR = registerBlock("stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<RotatedPillarBlock> MOSSY_STONE_BRICK_PILLAR = registerBlock("mossy_stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<RotatedPillarBlock> CRACKED_STONE_BRICK_PILLAR = registerBlock("cracked_stone_brick_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<InfestedBlock> INFESTED_MOSSY_CHISILED_STONE_BRICKS = registerBlock("infested_mossy_chiseled_stone_bricks",
            () -> new InfestedBlock(ModBlocks.MOSSY_CHISILED_STONE_BRICKS.get(), BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<InfestedBlock> INFESTED_CRACKED_CHISILED_STONE_BRICKS = registerBlock("infested_cracked_chiseled_stone_bricks",
            () -> new InfestedBlock(ModBlocks.CRACKED_CHISILED_STONE_BRICKS.get(), BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<InfestedRotatedPillarBlock> INFESTED_STONE_BRICK_PILLAR = registerBlock("infested_stone_brick_pillar",
            () -> new InfestedRotatedPillarBlock(ModBlocks.STONE_BRICK_PILLAR.get(), BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<InfestedRotatedPillarBlock> INFESTED_MOSSY_STONE_BRICK_PILLAR = registerBlock("infested_mossy_stone_brick_pillar",
            () -> new InfestedRotatedPillarBlock(ModBlocks.MOSSY_STONE_BRICK_PILLAR.get(), BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<InfestedRotatedPillarBlock> INFESTED_CRACKED_STONE_BRICK_PILLAR = registerBlock("infested_cracked_stone_brick_pillar",
            () -> new InfestedRotatedPillarBlock(ModBlocks.CRACKED_STONE_BRICK_PILLAR.get(), BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
            ));
    //Deepslate Blocks
    public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
            ));
    public static final DeferredBlock<StairBlock> MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
            ));
    public static final DeferredBlock<SlabBlock> MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
            ));
    public static final DeferredBlock<WallBlock> MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
            ));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS)
            ));
    public static final DeferredBlock<StairBlock> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS)
            ));
    public static final DeferredBlock<SlabBlock> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS)
            ));
    public static final DeferredBlock<WallBlock> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS)
            ));
    public static final DeferredBlock<SlabBlock> CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS)
            ));
    public static final DeferredBlock<WallBlock> CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_BRICKS)
            ));
    public static final DeferredBlock<Block> MOSSY_DEEPSLATE_TILES = registerBlock("mossy_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));
    public static final DeferredBlock<StairBlock> MOSSY_DEEPSLATE_TILE_STAIRS = registerBlock("mossy_deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));
    public static final DeferredBlock<SlabBlock> MOSSY_DEEPSLATE_TILE_SLAB = registerBlock("mossy_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));
    public static final DeferredBlock<WallBlock> MOSSY_DEEPSLATE_TILE_WALL = registerBlock("mossy_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs",
            () -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));
    public static final DeferredBlock<SlabBlock> CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));
    public static final DeferredBlock<WallBlock> CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(3.5f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE_TILES)
            ));
    //Granite Blocks
    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            () -> new StairBlock(ModBlocks.GRANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Diorite Blocks
    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            () -> new StairBlock(ModBlocks.DIORITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Andesite Blocks
    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            () -> new StairBlock(ModBlocks.ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Dripstone Blocks
    public static final DeferredBlock<StairBlock> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<SlabBlock> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<WallBlock> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<StairBlock> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DRIPSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<SlabBlock> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<WallBlock> POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<StairBlock> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            () -> new StairBlock(ModBlocks.DRIPSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<SlabBlock> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<WallBlock> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    public static final DeferredBlock<Block> CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DRIPSTONE_BLOCK)
            ));
    //Brick Blocks
    public static final DeferredBlock<Block> MOSSY_BRICKS = registerBlock("mossy_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CRACKED_BRICKS = registerBlock("cracked_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> CRACKED_BRICK_STAIRS = registerBlock("cracked_brick_stairs",
            () -> new StairBlock(ModBlocks.CRACKED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> CRACKED_BRICK_SLAB = registerBlock("cracked_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> CRACKED_BRICK_WALL = registerBlock("cracked_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> RUINED_BRICKS = registerBlock("ruined_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 6f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> RUINED_BRICK_STAIRS = registerBlock("ruined_brick_stairs",
            () -> new StairBlock(ModBlocks.RUINED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> RUINED_BRICK_SLAB = registerBlock("ruined_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> RUINED_BRICK_WALL = registerBlock("ruined_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Prismarine Blocks
    public static final DeferredBlock<Block> POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> POLISHED_PRISMARINE_STAIRS = registerBlock("polished_prismarine_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_PRISMARINE.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> POLISHED_PRISMARINE_SLAB = registerBlock("polished_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> POLISHED_PRISMARINE_WALL = registerBlock("polished_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Elder Prismarine Blocks
    public static final DeferredBlock<Block> ELDER_SEA_LANTERN = registerBlock("elder_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.QUARTZ)
                    .instrument(NoteBlockInstrument.HAT)
                    .strength(0.3F)
                    .sound(SoundType.GLASS)
                    .lightLevel(blockState -> 15)
                    .isRedstoneConductor(ModBlocks::never)
            ));
    public static final DeferredBlock<Block> ELDER_PRISMARINE = registerBlock("elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> ELDER_PRISMARINE_STAIRS = registerBlock("elder_prismarine_stairs",
            () -> new StairBlock(ModBlocks.ELDER_PRISMARINE.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> ELDER_PRISMARINE_SLAB = registerBlock("elder_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> ELDER_PRISMARINE_WALL = registerBlock("elder_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> POLISHED_ELDER_PRISMARINE = registerBlock("polished_elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> POLISHED_ELDER_PRISMARINE_STAIRS = registerBlock("polished_elder_prismarine_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_ELDER_PRISMARINE.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> POLISHED_ELDER_PRISMARINE_SLAB = registerBlock("polished_elder_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> POLISHED_ELDER_PRISMARINE_WALL = registerBlock("polished_elder_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> ELDER_PRISMARINE_BRICKS = registerBlock("elder_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> ELDER_PRISMARINE_BRICK_STAIRS = registerBlock("elder_prismarine_brick_stairs",
            () -> new StairBlock(ModBlocks.ELDER_PRISMARINE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> ELDER_PRISMARINE_BRICK_SLAB = registerBlock("elder_prismarine_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> ELDER_PRISMARINE_BRICK_WALL = registerBlock("elder_prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CHISELED_ELDER_PRISMARINE_BRICKS = registerBlock("chiseled_elder_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> DARK_ELDER_PRISMARINE = registerBlock("dark_elder_prismarine",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> DARK_ELDER_PRISMARINE_STAIRS = registerBlock("dark_elder_prismarine_stairs",
            () -> new StairBlock(ModBlocks.DARK_ELDER_PRISMARINE.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> DARK_ELDER_PRISMARINE_SLAB = registerBlock("dark_elder_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<WallBlock> DARK_ELDER_PRISMARINE_WALL = registerBlock("dark_elder_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f,6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Quartz Blocks
    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> WHITE_QUARTZ_TILES = registerBlock("white_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Rose Quartz Blocks
    public static final DeferredBlock<Block> NETHER_ROSE_QUARTZ_ORE = registerBlock("nether_rose_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .strength(3f, 3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> ROSE_QUARTZ_STAIRS = registerBlock("rose_quartz_stairs",
            () -> new StairBlock(ModBlocks.ROSE_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> ROSE_QUARTZ_SLAB = registerBlock("rose_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CHISELED_ROSE_QUARTZ_BLOCK = registerBlock("chiseled_rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<RotatedPillarBlock> ROSE_QUARTZ_PILLAR = registerBlock("rose_quartz_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> ROSE_QUARTZ_BRICKS = registerBlock("rose_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> ROSE_QUARTZ_BRICK_STAIRS = registerBlock("rose_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.ROSE_QUARTZ_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> ROSE_QUARTZ_BRICK_SLAB = registerBlock("rose_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> ROSE_QUARTZ_TILES = registerBlock("rose_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> SMOOTH_ROSE_QUARTZ = registerBlock("smooth_rose_quartz",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> SMOOTH_ROSE_QUARTZ_STAIRS = registerBlock("smooth_rose_quartz_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_ROSE_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> SMOOTH_ROSE_QUARTZ_SLAB = registerBlock("smooth_rose_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Smoky Quartz Blocks
    public static final DeferredBlock<Block> NETHER_SMOKY_QUARTZ_ORE = registerBlock("nether_smoky_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .strength(3f, 3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_ORE)
            ));
    public static final DeferredBlock<Block> SMOKY_QUARTZ_BLOCK = registerBlock("smoky_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> SMOKY_QUARTZ_STAIRS = registerBlock("smoky_quartz_stairs",
            () -> new StairBlock(ModBlocks.SMOKY_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> SMOKY_QUARTZ_SLAB = registerBlock("smoky_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CHISELED_SMOKY_QUARTZ_BLOCK = registerBlock("chiseled_smoky_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<RotatedPillarBlock> SMOKY_QUARTZ_PILLAR = registerBlock("smoky_quartz_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> SMOKY_QUARTZ_BRICKS = registerBlock("smoky_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> SMOKY_QUARTZ_BRICK_STAIRS = registerBlock("smoky_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.SMOKY_QUARTZ_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> SMOKY_QUARTZ_BRICK_SLAB = registerBlock("smoky_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> SMOKY_QUARTZ_TILES = registerBlock("smoky_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> SMOOTH_SMOKY_QUARTZ = registerBlock("smooth_smoky_quartz",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> SMOOTH_SMOKY_QUARTZ_STAIRS = registerBlock("smooth_smoky_quartz_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_SMOKY_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> SMOOTH_SMOKY_QUARTZ_SLAB = registerBlock("smooth_smoky_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Soul Quartz Blocks
    public static final DeferredBlock<Block> SOUL_QUARTZ_BLOCK = registerBlock("soul_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> SOUL_QUARTZ_STAIRS = registerBlock("soul_quartz_stairs",
            () -> new StairBlock(ModBlocks.SOUL_QUARTZ_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> SOUL_QUARTZ_SLAB = registerBlock("soul_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> CHISELED_SOUL_QUARTZ_BLOCK = registerBlock("chiseled_soul_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<RotatedPillarBlock> SOUL_QUARTZ_PILLAR = registerBlock("soul_quartz_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> SOUL_QUARTZ_BRICKS = registerBlock("soul_quartz_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> SOUL_QUARTZ_BRICK_STAIRS = registerBlock("soul_quartz_brick_stairs",
            () -> new StairBlock(ModBlocks.SOUL_QUARTZ_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> SOUL_QUARTZ_BRICK_SLAB = registerBlock("soul_quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> SOUL_QUARTZ_TILES = registerBlock("soul_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<Block> SMOOTH_SOUL_QUARTZ = registerBlock("smooth_soul_quartz",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<StairBlock> SMOOTH_SOUL_QUARTZ_STAIRS = registerBlock("smooth_soul_quartz_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_SOUL_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    public static final DeferredBlock<SlabBlock> SMOOTH_SOUL_QUARTZ_SLAB = registerBlock("smooth_soul_quartz_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));
    //Amethyst Blocks
    public static final DeferredBlock<Block> POLISHED_AMETHYST = registerBlock("polished_amethyst",
            () -> new AmethystBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<AmethystStairBlock> POLISHED_AMETHYST_STAIRS = registerBlock("polished_amethyst_stairs",
            () -> new AmethystStairBlock(ModBlocks.POLISHED_AMETHYST.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<AmethystSlabBlock> POLISHED_AMETHYST_SLAB = registerBlock("polished_amethyst_slab",
            () -> new AmethystSlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<Block> CHISELED_AMETHYST_BLOCK = registerBlock("chiseled_amethyst_block",
            () -> new AmethystBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<AmethystPillarBlock> AMETHYST_PILLAR = registerBlock("amethyst_pillar",
            () -> new AmethystPillarBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            () -> new AmethystBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<AmethystStairBlock> AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",
            () -> new AmethystStairBlock(ModBlocks.AMETHYST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<AmethystSlabBlock> AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",
            () -> new AmethystSlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<Block> AMETHYST_TILES = registerBlock("amethyst_tiles",
            () -> new AmethystBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<Block> SMOOTH_AMETHYST = registerBlock("smooth_amethyst",
            () -> new AmethystBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<AmethystStairBlock> SMOOTH_AMETHYST_STAIRS = registerBlock("smooth_amethyst_stairs",
            () -> new AmethystStairBlock(ModBlocks.SMOOTH_AMETHYST.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    public static final DeferredBlock<AmethystSlabBlock> SMOOTH_AMETHYST_SLAB = registerBlock("smooth_amethyst_slab",
            () -> new AmethystSlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
            ));
    //Quartz Tiles
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_WHITE_ROSE = registerBlock("quartz_tiles_white_rose",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.white_rose")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_WHITE_SMOKY = registerBlock("quartz_tiles_white_smoky",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.white_smoky")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_ROSE_SMOKY = registerBlock("quartz_tiles_rose_smoky",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.rose_smoky")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_WHITE_SOUL = registerBlock("quartz_tiles_white_soul",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.white_soul")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_SOUL_ROSE = registerBlock("quartz_tiles_soul_rose",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.soul_rose")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_SOUL_SMOKY = registerBlock("quartz_tiles_soul_smoky",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.soul_smoky")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_WHITE_AMETHYST = registerBlock("quartz_tiles_white_amethyst",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.white_amethyst")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_ROSE_AMETHYST = registerBlock("quartz_tiles_rose_amethyst",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.rose_amethyst")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_SMOKY_AMETHYST = registerBlock("quartz_tiles_smoky_amethyst",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.smoky_amethyst")
            ));
    public static final DeferredBlock<QuartzTileBlock> QUARTZ_TILES_SOUL_AMETHYST = registerBlock("quartz_tiles_soul_amethyst",
            () -> new QuartzTileBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f, 0.8f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE),
                    Component.translatable("tooltip.emblem_stuff.quartz_tiles.soul_amethyst")
            ));
    //Mob Compacting Blocks
    public static final DeferredBlock<RotatedPillarBlock> BLAZE_BLOCK = registerBlockWithoutItem("blaze_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2.0f, 2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BONE_BLOCK)
            ));
    public static final DeferredBlock<RotatedPillarBlock> BREEZE_BLOCK = registerBlock("breeze_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .strength(2.0f, 2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.BONE_BLOCK)
            ));
    //---REGISTRIES---
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static boolean always(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }

    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}