package com.booleven.consistentmushrooms.core.registry;

import com.booleven.consistentmushrooms.ConsistentMushrooms;
import com.booleven.consistentmushrooms.core.registry.boat.CMBoat;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CMEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ConsistentMushrooms.MOD_ID);

    public static final RegistryObject<EntityType<CMBoat>> CM_BOAT = ENTITIES.register("cm_boat",
            () -> EntityType.Builder.<CMBoat>of(CMBoat::new,
                    MobCategory.MISC).sized(1.375f, 0.5625f).clientTrackingRange(10)
                    .build(new ResourceLocation(ConsistentMushrooms.MOD_ID, "cm_boat").toString()));
}
