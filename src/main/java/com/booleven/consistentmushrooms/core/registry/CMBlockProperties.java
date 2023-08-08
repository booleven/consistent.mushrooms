package com.booleven.consistentmushrooms.core.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class CMBlockProperties {

    public static BlockBehaviour.Properties MushroomWood() {
        return BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(2.0F).sound(SoundType.WOOD);
    }

    public static void registerFlammable(Block block, int encouragement, int flammability) {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        fire.setFlammable(block, encouragement, flammability);
    }

    public static void registerFlammables() {
        registerFlammable(CMBlocks.STRIPPED_BROWN_MUSHROOM_STEM.get(), 5, 20);
        registerFlammable(CMBlocks.STRIPPED_BROWN_MUSHROOM_HYPHAE.get(), 5, 20);
        registerFlammable(CMBlocks.BROWN_MUSHROOM_STEM.get(), 5, 20);
        registerFlammable(CMBlocks.BROWN_MUSHROOM_HYPHAE.get(), 5, 20);
        registerFlammable(CMBlocks.BROWN_MUSHROOM_PLANKS.get(), 5, 20);
        registerFlammable(CMBlocks.STRIPPED_RED_MUSHROOM_STEM.get(), 5, 20);
        registerFlammable(CMBlocks.STRIPPED_RED_MUSHROOM_HYPHAE.get(), 5, 20);
        registerFlammable(CMBlocks.RED_MUSHROOM_STEM.get(), 5, 20);
        registerFlammable(CMBlocks.RED_MUSHROOM_HYPHAE.get(), 5, 20);
        registerFlammable(CMBlocks.RED_MUSHROOM_PLANKS.get(), 5, 20);
    }

}
