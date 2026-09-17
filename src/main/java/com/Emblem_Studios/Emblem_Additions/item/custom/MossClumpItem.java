package com.Emblem_Studios.Emblem_Additions.item.custom;

import com.Emblem_Studios.Emblem_Additions.block.ModBlocks;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public class MossClumpItem extends Item {
    public static final Supplier<BiMap<Block, Block>> MOSSABLES = Suppliers.memoize(
            () -> ImmutableBiMap.<Block, Block>builder()
                    .put(Blocks.BRICKS, ModBlocks.MOSSY_BRICKS.get())
                    .put(Blocks.BRICK_STAIRS, ModBlocks.MOSSY_BRICK_STAIRS.get())
                    .put(Blocks.BRICK_SLAB, ModBlocks.MOSSY_BRICK_SLAB.get())
                    .put(Blocks.BRICK_WALL, ModBlocks.MOSSY_BRICK_WALL.get())
                    .put(Blocks.COBBLESTONE, Blocks.MOSSY_COBBLESTONE)
                    .put(Blocks.COBBLESTONE_STAIRS, Blocks.MOSSY_COBBLESTONE_STAIRS)
                    .put(Blocks.COBBLESTONE_SLAB, Blocks.MOSSY_COBBLESTONE_SLAB)
                    .put(Blocks.COBBLESTONE_WALL, Blocks.MOSSY_COBBLESTONE_WALL)
                    .put(Blocks.STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS)
                    .put(Blocks.STONE_BRICK_STAIRS, Blocks.MOSSY_STONE_BRICK_STAIRS)
                    .put(Blocks.STONE_BRICK_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB)
                    .put(Blocks.STONE_BRICK_WALL, Blocks.MOSSY_STONE_BRICK_WALL)
                    .put(Blocks.CHISELED_STONE_BRICKS, ModBlocks.MOSSY_CHISILED_STONE_BRICKS.get())
                    .put(ModBlocks.STONE_BRICK_PILLAR.get(), ModBlocks.MOSSY_STONE_BRICK_PILLAR.get())
                    .put(Blocks.COBBLED_DEEPSLATE, ModBlocks.MOSSY_COBBLED_DEEPSLATE.get())
                    .put(Blocks.COBBLED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get())
                    .put(Blocks.COBBLED_DEEPSLATE_SLAB, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get())
                    .put(Blocks.COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get())
                    .put(Blocks.DEEPSLATE_BRICKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS.get())
                    .put(Blocks.DEEPSLATE_BRICK_STAIRS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get())
                    .put(Blocks.DEEPSLATE_BRICK_SLAB, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get())
                    .put(Blocks.DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get())
                    .put(Blocks.DEEPSLATE_TILES, ModBlocks.MOSSY_DEEPSLATE_TILES.get())
                    .put(Blocks.DEEPSLATE_TILE_STAIRS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get())
                    .put(Blocks.DEEPSLATE_TILE_SLAB, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get())
                    .put(Blocks.DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get())
                    .build()
    );
    public static final Supplier<BiMap<Block, Block>> MOSS_OFF_BY_BLOCK = Suppliers.memoize(() -> MOSSABLES.get().inverse());

    public MossClumpItem(Properties pProperties) {super(pProperties);}

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();

        if (MOSSABLES.get().containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(pContext.getClickedPos(), MOSSABLES.get().get(clickedBlock).withPropertiesOf(level.getBlockState(pContext.getClickedPos())));

                pContext.getItemInHand().consume(1, pContext.getPlayer());

                level.playSound(null, pContext.getClickedPos(), SoundEvents.MOSS_PLACE, SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.FAIL;
        }
    }
}
