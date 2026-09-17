package com.Emblem_Studios.Emblem_Additions.event;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import com.Emblem_Studios.Emblem_Additions.block.ModBlocks;
import com.Emblem_Studios.Emblem_Additions.item.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import java.util.List;

import static com.Emblem_Studios.Emblem_Additions.item.custom.MossClumpItem.MOSS_OFF_BY_BLOCK;
import static net.minecraft.world.level.block.Block.popResourceFromFace;

@EventBusSubscriber(modid = Emblem_Additions.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void mossScraping(BlockEvent.BlockToolModificationEvent event) {
        List<Block> slabBlocksToSkipMossDrops = List.of(
                ModBlocks.MOSSY_BRICK_SLAB.get(),
                Blocks.MOSSY_COBBLESTONE_SLAB,
                Blocks.MOSSY_STONE_BRICK_SLAB,
                ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get(),
                ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get(),
                ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get()
        );

        if (!event.isSimulated()) {
            Level level = event.getContext().getLevel();
            Block clickedBlock = level.getBlockState(event.getContext().getClickedPos()).getBlock();
            ItemAbility axeScrapeCheck = event.getItemAbility();

            if (MOSS_OFF_BY_BLOCK.get().containsKey(clickedBlock) && axeScrapeCheck == ItemAbilities.AXE_STRIP) {
                if(!level.isClientSide()) {
                    event.setFinalState(MOSS_OFF_BY_BLOCK.get().get(clickedBlock).withPropertiesOf(event.getContext().getLevel().getBlockState(event.getContext().getClickedPos())));

                    if (!slabBlocksToSkipMossDrops.contains(clickedBlock)) {
                        popResourceFromFace(level, event.getContext().getClickedPos(), event.getContext().getClickedFace(), new ItemStack(ModItems.MOSS_CLUMP.get(), 1));
                    }

                    event.getContext().getItemInHand().hurtAndBreak(1, ((ServerLevel) level), ((ServerPlayer) event.getPlayer()),
                            item -> event.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                    level.playSound(null, event.getContext().getClickedPos(), SoundEvents.TUFF_BREAK, SoundSource.BLOCKS);

                    event.getPlayer().swing(InteractionHand.MAIN_HAND, true);
                }
            }
        }
    }

}
