package com.Emblem_Studios.Emblem_Additions.datagen;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import com.Emblem_Studios.Emblem_Additions.item.ModItems;
import com.Emblem_Studios.Emblem_Additions.loot.AddItemDoubleModifier;
import com.Emblem_Studios.Emblem_Additions.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootTableProvider extends GlobalLootModifierProvider {
    public ModGlobalLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Emblem_Additions.MOD_ID);
    }

    @Override
    protected void start() {

        this.add("blank_template_to_ancient_city",
                new AddItemDoubleModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/ancient_city")).build(),
                        LootItemRandomChanceCondition.randomChance(0.5f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_bastion_bridge",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/bastion_bridge")).build(),
                        LootItemRandomChanceCondition.randomChance(0.6f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_bastion_other",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/bastion_other")).build(),
                        LootItemRandomChanceCondition.randomChance(0.4f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_bastion_treasure",
                new AddItemDoubleModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/bastion_treasure")).build(),
                        LootItemRandomChanceCondition.randomChance(1f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_buried_treasure",
                new AddItemDoubleModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/buried_treasure")).build(),
                        LootItemRandomChanceCondition.randomChance(1f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_desert_pyramid",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/desert_pyramid")).build(),
                        LootItemRandomChanceCondition.randomChance(0.5f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_end_city_treasure",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/end_city_treasure")).build(),
                        LootItemRandomChanceCondition.randomChance(0.75f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_jungle_temple",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/jungle_temple")).build(),
                        LootItemRandomChanceCondition.randomChance(0.7f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_nether_bridge",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/nether_bridge")).build(),
                        LootItemRandomChanceCondition.randomChance(0.75f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_pillager_outpost",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/pillager_outpost")).build(),
                        LootItemRandomChanceCondition.randomChance(0.4f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_ruined_portal",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/ruined_portal")).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_shipwreck_treasure",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/shipwreck_treasure")).build(),
                        LootItemRandomChanceCondition.randomChance(1f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_simple_dungeon",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/simple_dungeon")).build(),
                        LootItemRandomChanceCondition.randomChance(0.6f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_stronghold_corridor",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/stronghold_corridor")).build(),
                        LootItemRandomChanceCondition.randomChance(0.6f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_stronghold_library",
                new AddItemDoubleModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/stronghold_library")).build(),
                        LootItemRandomChanceCondition.randomChance(0.8f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_woodland_mansion",
                new AddItemDoubleModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/woodland_mansion")).build(),
                        LootItemRandomChanceCondition.randomChance(0.9f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_trial_chambers",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/trial_chambers/reward")).build(),
                        LootItemRandomChanceCondition.randomChance(0.5f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
        this.add("blank_template_to_trial_chambers_ominous",
                new AddItemDoubleModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/trial_chambers/reward_ominous")).build(),
                        LootItemRandomChanceCondition.randomChance(0.75f).build()
                }, ModItems.BLANK_SMITHING_TEMPLATE.get()));
    }
}
