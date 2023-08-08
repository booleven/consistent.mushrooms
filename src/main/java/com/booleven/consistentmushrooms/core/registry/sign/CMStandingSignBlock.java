package com.booleven.consistentmushrooms.core.registry.sign;

import com.booleven.consistentmushrooms.core.registry.CMSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CMStandingSignBlock extends StandingSignBlock {
    public CMStandingSignBlock(Properties p_56990_, WoodType p_56991_) {
        super(p_56990_, p_56991_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos p_154556_, BlockState p_154557_) {
        return new CMSignBlockEntity(p_154556_, p_154557_);
    }
}
