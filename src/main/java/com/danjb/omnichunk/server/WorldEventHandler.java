package com.danjb.omnichunk.server;

import net.minecraft.server.level.ServerLevel;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.level.LevelEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldEventHandler {
    private static final Logger LOGGER = LogManager.getLogger();

    public WorldEventHandler() {
    }

    @SubscribeEvent
    public void onWorldLoad(LevelEvent.Load event) {
        if (event.getLevel().isClientSide()) return;
        
        ServerLevel level = (ServerLevel) event.getLevel();
        MasterChunk masterChunk = MasterChunk.loadOrCreate(level);
        LOGGER.debug("Loaded world: {}", level.dimension().location());
    }

    @SubscribeEvent
    public void onWorldUnload(LevelEvent.Unload event) {
        if (event.getLevel().isClientSide()) return;
        
        ServerLevel level = (ServerLevel) event.getLevel();
        MasterChunk.set(level, null);
        LOGGER.debug("Unloaded world: {}", level.dimension().location());
    }
}
