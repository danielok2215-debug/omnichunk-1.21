package com.danjb.omnichunk.server;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlockEventHandler {
    private static final Logger LOGGER = LogManager.getLogger();
    
    private final ChunkTracker chunkTracker;

    public BlockEventHandler(ChunkTracker chunkTracker) {
        this.chunkTracker = chunkTracker;
    }

    @SubscribeEvent
    public void onBlockPlaced(BlockEvent.EntityPlaceEvent event) {
        if (event.isCanceled()) return;
        if (event.getLevel().isClientSide()) return;
        
        BlockPos pos = event.getPos();
        BlockState placedBlock = event.getPlacedBlock();
        ServerLevel level = (ServerLevel) event.getLevel();
        
        MasterChunk masterChunk = MasterChunk.getFor(level);
        
        if (masterChunk != null) {
            BlockPos chunkStart = new BlockPos(
                (pos.getX() >> 4)
