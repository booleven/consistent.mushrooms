package com.booleven.consistentmushrooms.core.registry.sign;

import com.booleven.consistentmushrooms.core.registry.CMSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CMWallSignBlock extends WallSignBlock {
    public CMWallSignBlock(Properties p_58068_, WoodType p_58069_) {
        super(p_58068_, p_58069_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos p_154556_, BlockState p_154557_) {
        return new CMSignBlockEntity(p_154556_, p_154557_);
    }
}
