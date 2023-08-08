package com.booleven.consistentmushrooms.core.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CMCreativeModeTab {
    public static final CreativeModeTab CONSISTENT_MUSHROOMS_TAB = new CreativeModeTab("consistent_mushrooms_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CMBlocks.BROWN_MUSHROOM_STEM.get());
        }
    };
}
