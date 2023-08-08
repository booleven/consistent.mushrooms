package com.booleven.consistentmushrooms.core.registry;

import com.booleven.consistentmushrooms.ConsistentMushrooms;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CMItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ConsistentMushrooms.MOD_ID);

    public static final RegistryObject<Item> BROWN_MUSHROOM_SIGN = ITEMS.register("brown_mushroom_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16),
            CMBlocks.BROWN_MUSHROOM_SIGN.get(), CMBlocks.BROWN_MUSHROOM_WALL_SIGN.get()));
    public static final RegistryObject<Item> RED_MUSHROOM_SIGN = ITEMS.register("red_mushroom_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16),
            CMBlocks.RED_MUSHROOM_SIGN.get(), CMBlocks.RED_MUSHROOM_WALL_SIGN.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
