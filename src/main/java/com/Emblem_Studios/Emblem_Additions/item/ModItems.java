package com.Emblem_Studios.Emblem_Additions.item;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import com.Emblem_Studios.Emblem_Additions.block.ModBlocks;
import com.Emblem_Studios.Emblem_Additions.item.custom.FuelBlockItem;
import com.Emblem_Studios.Emblem_Additions.item.custom.MossClumpItem;
import com.Emblem_Studios.Emblem_Additions.item.custom.QuartzChisel;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Emblem_Additions.MOD_ID);

    public static final DeferredItem<Item> MOSS_CLUMP = ITEMS.register("moss_clump",
            () -> new MossClumpItem(new Item.Properties()));

    public static final DeferredItem<Item> ELDER_PRISMARINE_SHARD = ITEMS.register("elder_prismarine_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMOKY_QUARTZ = ITEMS.register("smoky_quartz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOUL_QUARTZ = ITEMS.register("soul_quartz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLANK_SMITHING_TEMPLATE = ITEMS.register("blank_smithing_template",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final DeferredItem<Item> QUARTZ_CHISEL = ITEMS.register("quartz_chisel",
            () -> new QuartzChisel(new Item.Properties().durability(128)));

    //Block Items
    public static final DeferredItem<Item> BLAZE_BLOCK = ITEMS.register("blaze_block",
            () -> new FuelBlockItem(ModBlocks.BLAZE_BLOCK.get(), new Item.Properties().fireResistant(), 24000));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
