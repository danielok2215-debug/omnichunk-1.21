package com.danjb.omnichunk.server;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class MasterChunkTask {
    public final int id;
    public final BlockPos blockPos;
    public final BlockState blockState;

    public MasterChunkTask(int id, BlockPos blockPos, BlockState blockState) {
        this.id = id;
        this.blockPos = blockPos;
        this.blockState = blockState;
    }

    public BlockPos getBlockPos() {
        return blockPos;
    }

    public BlockState getBlockState() {
        return blockState;
    }
}
