package com.Emblem_Studios.Emblem_Additions.loot;

import com.Emblem_Studios.Emblem_Additions.Emblem_Additions;
import com.mojang.serialization.MapCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModLootModifers {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Emblem_Additions.MOD_ID);

    public static final Supplier<MapCodec<? extends IGlobalLootModifier>> ADD_SINGLE_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_single_item", () -> AddItemModifier.CODEC);
    public static final Supplier<MapCodec<? extends IGlobalLootModifier>> ADD_DOUBLE_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_double_item", () -> AddItemDoubleModifier.CODEC);

    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}
