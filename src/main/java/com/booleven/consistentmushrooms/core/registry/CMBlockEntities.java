package com.booleven.consistentmushrooms.core.registry;

import com.booleven.consistentmushrooms.ConsistentMushrooms;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CMBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ConsistentMushrooms.MOD_ID);

    public static final RegistryObject<BlockEntityType<CMSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(CMSignBlockEntity::new,
                            CMBlocks.BROWN_MUSHROOM_SIGN.get(),
                            CMBlocks.BROWN_MUSHROOM_WALL_SIGN.get(),
                            CMBlocks.RED_MUSHROOM_SIGN.get(),
                            CMBlocks.RED_MUSHROOM_WALL_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {BLOCK_ENTITIES.register(eventBus);}
}
