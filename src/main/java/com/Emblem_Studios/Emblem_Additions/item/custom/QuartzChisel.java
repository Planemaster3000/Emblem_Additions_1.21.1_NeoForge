package com.Emblem_Studios.Emblem_Additions.item.custom;

import com.Emblem_Studios.Emblem_Additions.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Map;

import static com.Emblem_Studios.Emblem_Additions.block.custom.QuartzTileBlock.INVERTED;
import static net.minecraft.world.level.block.Block.popResourceFromFace;

public class QuartzChisel extends Item {
    private static final Map<Block, Block> QUARTZ_CHISEL_BLOCK_MAP =
            Map.of(
                    Blocks.QUARTZ_BLOCK, ModBlocks.WHITE_QUARTZ_TILES.get(),
                    ModBlocks.ROSE_QUARTZ_BLOCK.get(), ModBlocks.ROSE_QUARTZ_TILES.get(),
                    ModBlocks.SMOKY_QUARTZ_BLOCK.get(), ModBlocks.SMOKY_QUARTZ_TILES.get(),
                    ModBlocks.SOUL_QUARTZ_BLOCK.get(), ModBlocks.SOUL_QUARTZ_TILES.get(),
                    ModBlocks.POLISHED_AMETHYST.get(), ModBlocks.AMETHYST_TILES.get()
            );
    private static final Map<Block, Block> RUINED_BRICKS_MAP =
            Map.of(
                    Blocks.BRICKS, ModBlocks.RUINED_BRICKS.get()
            );

    public QuartzChisel(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();

        boolean isQuartzTiles = false;
        if (isQuartzTiles) {
            if (!level.isClientSide()) {
                boolean currentState = level.getBlockState(pContext.getClickedPos()).getValue(INVERTED);
                level.setBlockAndUpdate(pContext.getClickedPos(), clickedBlock.defaultBlockState().setValue(INVERTED, !currentState));
            }
            return InteractionResult.SUCCESS;
        }else if (QUARTZ_CHISEL_BLOCK_MAP.containsKey(clickedBlock)){
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(pContext.getClickedPos(), QUARTZ_CHISEL_BLOCK_MAP.get(clickedBlock).defaultBlockState());

                pContext.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), ((ServerPlayer) pContext.getPlayer()),
                        item -> pContext.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, pContext.getClickedPos(), SoundEvents.STONE_BREAK, SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        }else if (RUINED_BRICKS_MAP.containsKey(clickedBlock)){
            if(!level.isClientSide()) {
                int drops = 1 + level.random.nextInt(2);
                popResourceFromFace(level, pContext.getClickedPos(), pContext.getClickedFace(), new ItemStack(Items.BRICK, drops));

                level.setBlockAndUpdate(pContext.getClickedPos(), RUINED_BRICKS_MAP.get(clickedBlock).defaultBlockState());

                pContext.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), ((ServerPlayer) pContext.getPlayer()),
                        item -> pContext.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, pContext.getClickedPos(), SoundEvents.STONE_BREAK, SoundSource.BLOCKS);
            }
            return InteractionResult.SUCCESS;
        }else {
            return InteractionResult.FAIL;
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.translatable("tooltip.emblem_stuff.quartz_chisel"));

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
