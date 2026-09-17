package com.Emblem_Studios.Emblem_Additions.block.custom;

import com.Emblem_Studios.Emblem_Additions.utility.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class QuartzTileBlock extends Block {
    public static final BooleanProperty INVERTED = BooleanProperty.create("inverted");
    private final Component quartzTileType;

    public QuartzTileBlock(Properties properties, Component pQuartzTileType) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(INVERTED, false));
        this.quartzTileType = pQuartzTileType;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(INVERTED);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext pContext) {
        if (pContext.getPlayer().isShiftKeyDown()) {
            return this.defaultBlockState().setValue(INVERTED, true);
        } else {
            return this.defaultBlockState();
        }
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack pStack, BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult) {
        if (pStack.is(ModTags.Items.QUARTZ_CHISELS)) {
            if (!pLevel.isClientSide()) {
               boolean currentState = pState.getValue(INVERTED);
               pLevel.setBlockAndUpdate(pPos, pState.setValue(INVERTED, !currentState));
            }
            return ItemInteractionResult.SUCCESS;
        } else {
            return ItemInteractionResult.FAIL;
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
        pTooltipComponents.add(this.quartzTileType);

    }
}
