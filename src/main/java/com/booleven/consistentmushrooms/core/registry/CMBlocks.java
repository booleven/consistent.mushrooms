package com.booleven.consistentmushrooms.core.registry;

import com.booleven.consistentmushrooms.ConsistentMushrooms;
import com.booleven.consistentmushrooms.core.registry.sign.CMStandingSignBlock;
import com.booleven.consistentmushrooms.core.registry.sign.CMWallSignBlock;
import com.booleven.consistentmushrooms.core.util.CMWoodType;
import com.booleven.consistentmushrooms.core.util.StrippableLog;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CMBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ConsistentMushrooms.MOD_ID);

    //brown
    public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_STEM = registerBlock("stripped_brown_mushroom_stem", () -> new RotatedPillarBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE = registerBlock("stripped_brown_mushroom_hyphae", () -> new RotatedPillarBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_STEM = registerBlock("brown_mushroom_stem", () -> new StrippableLog(CMBlockProperties.MushroomWood(), STRIPPED_BROWN_MUSHROOM_STEM.get()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE = registerBlock("brown_mushroom_hyphae", () -> new StrippableLog(CMBlockProperties.MushroomWood(), STRIPPED_BROWN_MUSHROOM_HYPHAE.get()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_PLANKS = registerBlock("brown_mushroom_planks", () -> new Block(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_STAIRS = registerBlock("brown_mushroom_stairs", () -> new StairBlock(() -> CMBlocks.BROWN_MUSHROOM_PLANKS.get().defaultBlockState(), CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_SLAB = registerBlock("brown_mushroom_slab", () -> new SlabBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_FENCE = registerBlock("brown_mushroom_fence", () -> new FenceBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_FENCE_GATE = registerBlock("brown_mushroom_fence_gate", () -> new FenceGateBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_DOOR = registerBlock("brown_mushroom_door", () -> new DoorBlock(CMBlockProperties.MushroomWood().noOcclusion()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_BUTTON = registerBlock("brown_mushroom_button", () -> new WoodButtonBlock(CMBlockProperties.MushroomWood().noCollission()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_TRAPDOOR = registerBlock("brown_mushroom_trapdoor", () -> new TrapDoorBlock(CMBlockProperties.MushroomWood().noOcclusion()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> BROWN_MUSHROOM_PRESSURE_PLATE = registerBlock("brown_mushroom_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);

    //red
    public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_STEM = registerBlock("stripped_red_mushroom_stem", () -> new RotatedPillarBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE = registerBlock("stripped_red_mushroom_hyphae", () -> new RotatedPillarBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_STEM = registerBlock("red_mushroom_stem", () -> new StrippableLog(CMBlockProperties.MushroomWood(), STRIPPED_RED_MUSHROOM_STEM.get()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE = registerBlock("red_mushroom_hyphae", () -> new StrippableLog(CMBlockProperties.MushroomWood(), STRIPPED_RED_MUSHROOM_HYPHAE.get()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_PLANKS = registerBlock("red_mushroom_planks", () -> new Block(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_STAIRS = registerBlock("red_mushroom_stairs", () -> new StairBlock(() -> CMBlocks.RED_MUSHROOM_PLANKS.get().defaultBlockState(), CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_SLAB = registerBlock("red_mushroom_slab", () -> new SlabBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_FENCE = registerBlock("red_mushroom_fence", () -> new FenceBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_FENCE_GATE = registerBlock("red_mushroom_fence_gate", () -> new FenceGateBlock(CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_DOOR = registerBlock("red_mushroom_door", () -> new DoorBlock(CMBlockProperties.MushroomWood().noOcclusion()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_BUTTON = registerBlock("red_mushroom_button", () -> new WoodButtonBlock(CMBlockProperties.MushroomWood().noCollission()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_TRAPDOOR = registerBlock("red_mushroom_trapdoor", () -> new TrapDoorBlock(CMBlockProperties.MushroomWood().noOcclusion()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);
    public static final RegistryObject<Block> RED_MUSHROOM_PRESSURE_PLATE = registerBlock("red_mushroom_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, CMBlockProperties.MushroomWood()) {}, CMCreativeModeTab.CONSISTENT_MUSHROOMS_TAB);

    //signs

    public static final RegistryObject<Block> BROWN_MUSHROOM_SIGN = registerBlockNoItem("brown_mushroom_sign",
            () -> new CMStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), CMWoodType.BROWN_MUSHROOM));
    public static final RegistryObject<Block> BROWN_MUSHROOM_WALL_SIGN = registerBlockNoItem("brown_mushroom_wall_sign",
            () -> new CMWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), CMWoodType.BROWN_MUSHROOM));
    public static final RegistryObject<Block> RED_MUSHROOM_SIGN = registerBlockNoItem("red_mushroom_sign",
            () -> new CMStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), CMWoodType.RED_MUSHROOM));
    public static final RegistryObject<Block> RED_MUSHROOM_WALL_SIGN = registerBlockNoItem("red_mushroom_wall_sign",
            () -> new CMWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), CMWoodType.RED_MUSHROOM));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockNoItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block, CreativeModeTab tab) {
        return CMItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
