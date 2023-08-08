package com.booleven.consistentmushrooms.core.registry.boat;

import com.booleven.consistentmushrooms.core.registry.CMEntityTypes;
import com.booleven.consistentmushrooms.core.registry.CMItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class CMBoat extends Boat {
    private static final EntityDataAccessor<String> WOOD_TYPE = SynchedEntityData.defineId(CMBoat.class, EntityDataSerializers.STRING);

    public CMBoat(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public CMBoat(Level level, double x, double y, double z, String woodType) {
        this(CMEntityTypes.CM_BOAT.get(), level);
        this.xo = x;
        this.yo = y;
        this.zo = z;
        this.entityData.set(WOOD_TYPE, woodType);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(WOOD_TYPE, "cm");
    }

    @Override
    public Item getDropItem() {
        return CMItems.BROWN_MUSHROOM_SIGN.get();
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putString("Type", this.getWoodType());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        this.setWoodType(pCompound.getString("Type"));
    }

    public String getWoodType() {
        return this.entityData.get(WOOD_TYPE);
    }

    public void setWoodType(String woodType) {
        this.entityData.set(WOOD_TYPE, woodType);
    }

    @Override
    public ItemStack getPickResult() {
        return new ItemStack(this.getDropItem());
    }

}
