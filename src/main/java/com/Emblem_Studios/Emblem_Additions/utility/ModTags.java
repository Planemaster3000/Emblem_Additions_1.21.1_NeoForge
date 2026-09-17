package com.Emblem_Studios.Emblem_Additions.utility;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static TagKey<Block> QUARTZ_TILES_INVERTABLE = createTag("quartz_tiles_invertable");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Emblem_Additions.MOD_ID, name));
        }
    }

    public static class Items {
        public static TagKey<Item> QUARTZ_CHISELS = createTag("quartz_chisels");
        public static TagKey<Item> QUARTZ_CRAFTING_BASIC = createTag("quartz_crafting_basic");
        public static TagKey<Item> QUARTZ_CRAFTING_ALL = createTag("quartz_crafting_all");
        public static TagKey<Item> QUARTZ_BLOCKS_CRAFTING_BASIC = createTag("quartz_blocks_crafting_basic");
        public static TagKey<Item> QUARTZ_BLOCKS_CRAFTING_ALL = createTag("quartz_blocks_crafting_all");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Emblem_Additions.MOD_ID, name));
        }
    }
}
