package com.Emblem_Studios.Emblem_Additions.worldgen;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> NETHER_ROSE_QUARTZ_ORE_DENSE_KEY = registerKey("nether_rose_quartz_ore_dense");
    public static final ResourceKey<PlacedFeature> NETHER_ROSE_QUARTZ_ORE_RARE_KEY = registerKey("nether_rose_quartz_ore_rare");
    public static final ResourceKey<PlacedFeature> NETHER_SMOKY_QUARTZ_ORE_DENSE_KEY = registerKey("nether_smoky_quartz_ore_dense");
    public static final ResourceKey<PlacedFeature> NETHER_SMOKY_QUARTZ_ORE_RARE_KEY = registerKey("nether_smoky_quartz_ore_rare");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, NETHER_ROSE_QUARTZ_ORE_DENSE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ROSE_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(32,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));
        register(context, NETHER_ROSE_QUARTZ_ORE_RARE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ROSE_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));
        register(context, NETHER_SMOKY_QUARTZ_ORE_DENSE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SMOKY_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(32,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));
        register(context, NETHER_SMOKY_QUARTZ_ORE_RARE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SMOKY_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Emblem_Additions.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
