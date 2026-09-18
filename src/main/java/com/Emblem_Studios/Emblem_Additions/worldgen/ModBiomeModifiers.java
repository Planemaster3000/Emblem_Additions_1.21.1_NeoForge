package com.Emblem_Studios.Emblem_Additions.worldgen;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ROSE_QUARTZ_ORE_DENSE = registerKey("add_nether_rose_quartz_ore_dense");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ROSE_QUARTZ_ORE_RARE = registerKey("add_nether_rose_quartz_ore_rare");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SMOKY_QUARTZ_ORE_DENSE = registerKey("add_nether_smoky_quartz_ore_dense");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SMOKY_QUARTZ_ORE_RARE = registerKey("add_nether_smoky_quartz_ore_rare");
    public static final ResourceKey<BiomeModifier> REMOVE_QUARTZ_WRONG_BIOMES = registerKey("remove_quartz_ore");
    public static final ResourceKey<BiomeModifier> ADD_DOUBLE_QUARTZ_SSV = registerKey("add_double_quartz_ssv");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_NETHER_ROSE_QUARTZ_ORE_DENSE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.CRIMSON_FOREST), biomes.getOrThrow(Biomes.BASALT_DELTAS)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.NETHER_ROSE_QUARTZ_ORE_DENSE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_NETHER_ROSE_QUARTZ_ORE_RARE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.NETHER_WASTES)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.NETHER_ROSE_QUARTZ_ORE_RARE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_NETHER_SMOKY_QUARTZ_ORE_DENSE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.WARPED_FOREST), biomes.getOrThrow(Biomes.BASALT_DELTAS)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.NETHER_SMOKY_QUARTZ_ORE_DENSE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_NETHER_SMOKY_QUARTZ_ORE_RARE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.NETHER_WASTES)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.NETHER_SMOKY_QUARTZ_ORE_RARE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(REMOVE_QUARTZ_WRONG_BIOMES, new BiomeModifiers.RemoveFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.CRIMSON_FOREST), biomes.getOrThrow(Biomes.WARPED_FOREST), biomes.getOrThrow(Biomes.SOUL_SAND_VALLEY)),
                HolderSet.direct(placedFeature.getOrThrow(OrePlacements.ORE_QUARTZ_NETHER)),
                Set.of(GenerationStep.Decoration.UNDERGROUND_DECORATION)
        ));
        context.register(ADD_DOUBLE_QUARTZ_SSV, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SOUL_SAND_VALLEY)),
                HolderSet.direct(placedFeature.getOrThrow(OrePlacements.ORE_QUARTZ_DELTAS)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Emblem_Additions.MOD_ID, name));
    }
}
