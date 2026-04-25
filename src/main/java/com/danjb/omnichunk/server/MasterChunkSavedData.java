package com.danjb.omnichunk.server;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.saveddata.SavedData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class MasterChunkSavedData extends SavedData {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String ID = "masterchunk";
    
    private final ServerLevel level;

    public MasterChunkSavedData(Supplier
