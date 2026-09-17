package com.Emblem_Studios.Emblem_Additions;

import com.Emblem_Studios.Emblem_Additions.block.ModBlocks;
import com.Emblem_Studios.Emblem_Additions.item.ModCreativeModeTabs;
import com.Emblem_Studios.Emblem_Additions.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Emblem_Additions.MOD_ID)
public class Emblem_Additions {
    public static final String MOD_ID = "emblem_stuff";
    public static final Logger LOGGER = LogUtils.getLogger();


    public Emblem_Additions(IEventBus modEventBus, ModContainer modContainer) {



        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.MOSS_CLUMP);
            event.accept(ModItems.ELDER_PRISMARINE_SHARD);
            event.accept(ModItems.ROSE_QUARTZ);
            event.accept(ModItems.SMOKY_QUARTZ);
            event.accept(ModItems.SOUL_QUARTZ);
            event.accept(ModItems.BLANK_SMITHING_TEMPLATE);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
            event.accept(ModBlocks.CRACKED_STONE_BRICK_SLAB);
            event.accept(ModBlocks.CRACKED_STONE_BRICK_WALL);
            event.accept(ModBlocks.MOSSY_CHISILED_STONE_BRICKS);
            event.accept(ModBlocks.CRACKED_CHISILED_STONE_BRICKS);
            event.accept(ModBlocks.STONE_BRICK_PILLAR);
            event.accept(ModBlocks.MOSSY_STONE_BRICK_PILLAR);
            event.accept(ModBlocks.CRACKED_STONE_BRICK_PILLAR);
            event.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE);
            event.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
            event.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
            event.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL);
            event.accept(ModBlocks.MOSSY_DEEPSLATE_BRICKS);
            event.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
            event.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
            event.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
            event.accept(ModBlocks.MOSSY_DEEPSLATE_TILES);
            event.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
            event.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
            event.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
            event.accept(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL);
            event.accept(ModBlocks.POLISHED_GRANITE_WALL);
            event.accept(ModBlocks.GRANITE_BRICKS);
            event.accept(ModBlocks.GRANITE_BRICK_STAIRS);
            event.accept(ModBlocks.GRANITE_BRICK_SLAB);
            event.accept(ModBlocks.GRANITE_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_GRANITE_BRICKS);
            event.accept(ModBlocks.POLISHED_DIORITE_WALL);
            event.accept(ModBlocks.DIORITE_BRICKS);
            event.accept(ModBlocks.DIORITE_BRICK_STAIRS);
            event.accept(ModBlocks.DIORITE_BRICK_SLAB);
            event.accept(ModBlocks.DIORITE_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_DIORITE_BRICKS);
            event.accept(ModBlocks.POLISHED_ANDESITE_WALL);
            event.accept(ModBlocks.ANDESITE_BRICKS);
            event.accept(ModBlocks.ANDESITE_BRICK_STAIRS);
            event.accept(ModBlocks.ANDESITE_BRICK_SLAB);
            event.accept(ModBlocks.ANDESITE_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_ANDESITE_BRICKS);
            event.accept(ModBlocks.DRIPSTONE_STAIRS);
            event.accept(ModBlocks.DRIPSTONE_SLAB);
            event.accept(ModBlocks.DRIPSTONE_WALL);
            event.accept(ModBlocks.POLISHED_DRIPSTONE);
            event.accept(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
            event.accept(ModBlocks.POLISHED_DRIPSTONE_SLAB);
            event.accept(ModBlocks.POLISHED_DRIPSTONE_WALL);
            event.accept(ModBlocks.DRIPSTONE_BRICKS);
            event.accept(ModBlocks.DRIPSTONE_BRICK_STAIRS);
            event.accept(ModBlocks.DRIPSTONE_BRICK_SLAB);
            event.accept(ModBlocks.DRIPSTONE_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_DRIPSTONE_BRICKS);
            event.accept(ModBlocks.MOSSY_BRICKS);
            event.accept(ModBlocks.MOSSY_BRICK_STAIRS);
            event.accept(ModBlocks.MOSSY_BRICK_SLAB);
            event.accept(ModBlocks.MOSSY_BRICK_WALL);
            event.accept(ModBlocks.CRACKED_BRICKS);
            event.accept(ModBlocks.CRACKED_BRICK_STAIRS);
            event.accept(ModBlocks.CRACKED_BRICK_SLAB);
            event.accept(ModBlocks.CRACKED_BRICK_WALL);
            event.accept(ModBlocks.RUINED_BRICKS);
            event.accept(ModBlocks.RUINED_BRICK_STAIRS);
            event.accept(ModBlocks.RUINED_BRICK_SLAB);
            event.accept(ModBlocks.RUINED_BRICK_WALL);
            event.accept(ModBlocks.POLISHED_PRISMARINE);
            event.accept(ModBlocks.POLISHED_PRISMARINE_STAIRS);
            event.accept(ModBlocks.POLISHED_PRISMARINE_SLAB);
            event.accept(ModBlocks.POLISHED_PRISMARINE_WALL);
            event.accept(ModBlocks.PRISMARINE_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_PRISMARINE_BRICKS);
            event.accept(ModBlocks.DARK_PRISMARINE_WALL);
            event.accept(ModBlocks.ELDER_SEA_LANTERN);
            event.accept(ModBlocks.ELDER_PRISMARINE);
            event.accept(ModBlocks.ELDER_PRISMARINE_STAIRS);
            event.accept(ModBlocks.ELDER_PRISMARINE_SLAB);
            event.accept(ModBlocks.ELDER_PRISMARINE_WALL);
            event.accept(ModBlocks.POLISHED_ELDER_PRISMARINE);
            event.accept(ModBlocks.POLISHED_ELDER_PRISMARINE_STAIRS);
            event.accept(ModBlocks.POLISHED_ELDER_PRISMARINE_SLAB);
            event.accept(ModBlocks.POLISHED_ELDER_PRISMARINE_WALL);
            event.accept(ModBlocks.ELDER_PRISMARINE_BRICKS);
            event.accept(ModBlocks.ELDER_PRISMARINE_BRICK_STAIRS);
            event.accept(ModBlocks.ELDER_PRISMARINE_BRICK_SLAB);
            event.accept(ModBlocks.ELDER_PRISMARINE_BRICK_WALL);
            event.accept(ModBlocks.CHISELED_ELDER_PRISMARINE_BRICKS);
            event.accept(ModBlocks.DARK_ELDER_PRISMARINE);
            event.accept(ModBlocks.DARK_ELDER_PRISMARINE_STAIRS);
            event.accept(ModBlocks.DARK_ELDER_PRISMARINE_SLAB);
            event.accept(ModBlocks.DARK_ELDER_PRISMARINE_WALL);
            event.accept(ModBlocks.QUARTZ_BRICK_STAIRS);
            event.accept(ModBlocks.QUARTZ_BRICK_SLAB);
            event.accept(ModBlocks.WHITE_QUARTZ_TILES);
            event.accept(ModBlocks.ROSE_QUARTZ_BLOCK);    //Rose Quartz Blocks
            event.accept(ModBlocks.ROSE_QUARTZ_STAIRS);
            event.accept(ModBlocks.ROSE_QUARTZ_SLAB);
            event.accept(ModBlocks.CHISELED_ROSE_QUARTZ_BLOCK);
            event.accept(ModBlocks.ROSE_QUARTZ_PILLAR);
            event.accept(ModBlocks.ROSE_QUARTZ_BRICKS);
            event.accept(ModBlocks.ROSE_QUARTZ_BRICK_STAIRS);
            event.accept(ModBlocks.ROSE_QUARTZ_BRICK_SLAB);
            event.accept(ModBlocks.ROSE_QUARTZ_TILES);
            event.accept(ModBlocks.SMOOTH_ROSE_QUARTZ);
            event.accept(ModBlocks.SMOOTH_ROSE_QUARTZ_STAIRS);
            event.accept(ModBlocks.SMOOTH_ROSE_QUARTZ_SLAB);
            event.accept(ModBlocks.SMOKY_QUARTZ_BLOCK);   //Smoky Quartz Blocks
            event.accept(ModBlocks.SMOKY_QUARTZ_STAIRS);
            event.accept(ModBlocks.SMOKY_QUARTZ_SLAB);
            event.accept(ModBlocks.CHISELED_SMOKY_QUARTZ_BLOCK);
            event.accept(ModBlocks.SMOKY_QUARTZ_PILLAR);
            event.accept(ModBlocks.SMOKY_QUARTZ_BRICKS);
            event.accept(ModBlocks.SMOKY_QUARTZ_BRICK_STAIRS);
            event.accept(ModBlocks.SMOKY_QUARTZ_BRICK_SLAB);
            event.accept(ModBlocks.SMOKY_QUARTZ_TILES);
            event.accept(ModBlocks.SMOOTH_SMOKY_QUARTZ);
            event.accept(ModBlocks.SMOOTH_SMOKY_QUARTZ_STAIRS);
            event.accept(ModBlocks.SMOOTH_SMOKY_QUARTZ_SLAB);
            event.accept(ModBlocks.SOUL_QUARTZ_BLOCK);    //Soul Quartz Blocks
            event.accept(ModBlocks.SOUL_QUARTZ_STAIRS);
            event.accept(ModBlocks.SOUL_QUARTZ_SLAB);
            event.accept(ModBlocks.CHISELED_SOUL_QUARTZ_BLOCK);
            event.accept(ModBlocks.SOUL_QUARTZ_PILLAR);
            event.accept(ModBlocks.SOUL_QUARTZ_BRICKS);
            event.accept(ModBlocks.SOUL_QUARTZ_BRICK_STAIRS);
            event.accept(ModBlocks.SOUL_QUARTZ_BRICK_SLAB);
            event.accept(ModBlocks.SOUL_QUARTZ_TILES);
            event.accept(ModBlocks.SMOOTH_SOUL_QUARTZ);
            event.accept(ModBlocks.SMOOTH_SOUL_QUARTZ_STAIRS);
            event.accept(ModBlocks.SMOOTH_SOUL_QUARTZ_SLAB);
            event.accept(ModBlocks.POLISHED_AMETHYST);    //Amethyst Blocks
            event.accept(ModBlocks.POLISHED_AMETHYST_STAIRS);
            event.accept(ModBlocks.POLISHED_AMETHYST_SLAB);
            event.accept(ModBlocks.CHISELED_AMETHYST_BLOCK);
            event.accept(ModBlocks.AMETHYST_PILLAR);
            event.accept(ModBlocks.AMETHYST_BRICKS);
            event.accept(ModBlocks.AMETHYST_BRICK_STAIRS);
            event.accept(ModBlocks.AMETHYST_BRICK_SLAB);
            event.accept(ModBlocks.AMETHYST_TILES);
            event.accept(ModBlocks.SMOOTH_AMETHYST);
            event.accept(ModBlocks.SMOOTH_AMETHYST_STAIRS);
            event.accept(ModBlocks.SMOOTH_AMETHYST_SLAB);
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.NETHER_ROSE_QUARTZ_ORE);
            event.accept(ModBlocks.NETHER_SMOKY_QUARTZ_ORE);
        }
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModBlocks.INFESTED_MOSSY_CHISILED_STONE_BRICKS);
            event.accept(ModBlocks.INFESTED_CRACKED_CHISILED_STONE_BRICKS);
            event.accept(ModBlocks.INFESTED_STONE_BRICK_PILLAR);
            event.accept(ModBlocks.INFESTED_MOSSY_STONE_BRICK_PILLAR);
            event.accept(ModBlocks.INFESTED_CRACKED_STONE_BRICK_PILLAR);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.QUARTZ_CHISEL);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
