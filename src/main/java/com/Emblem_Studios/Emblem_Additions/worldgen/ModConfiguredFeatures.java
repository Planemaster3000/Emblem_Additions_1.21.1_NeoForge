package com.Emblem_Studios.Emblem_Additions.worldgen;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import com.Emblem_Studios.Emblem_Additions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ROSE_QUARTZ_ORE_KEY = registerKey("nether_rose_quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SMOKY_QUARTZ_ORE_KEY = registerKey("nether_smoky_quartz_ore");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);

        List<OreConfiguration.TargetBlockState> netherRoseQuartzOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_ROSE_QUARTZ_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherSmokyQuartzOre = List.of(
                OreConfiguration.target(netherrackReplaceables, ModBlocks.NETHER_SMOKY_QUARTZ_ORE.get().defaultBlockState()));

        register(context, NETHER_ROSE_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(netherRoseQuartzOre, 14));
        register(context, NETHER_SMOKY_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(netherSmokyQuartzOre, 14));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Emblem_Additions.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
