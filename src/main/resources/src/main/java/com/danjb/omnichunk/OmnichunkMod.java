package com.danjb.omnichunk;

import com.danjb.omnichunk.server.ChunkTracker;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(OmnichunkMod.MOD_ID)
public class OmnichunkMod {
    public static final String MOD_ID = "omnichunk";
    public static final Logger LOGGER = LogManager.getLogger();

    public OmnichunkMod(IEventBus eventBus) {
        ChunkTracker chunkTracker = new ChunkTracker();
        eventBus.register(chunkTracker);
        eventBus.register(new com.danjb.omnichunk.server.BlockEventHandler(chunkTracker));
        eventBus.register(new com.danjb.omnichunk.server.WorldEventHandler());
        LOGGER.info("Omnichunk loaded!");
    }
}
