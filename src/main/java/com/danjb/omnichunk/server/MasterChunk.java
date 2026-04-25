package com.danjb.omnichunk.server;

import com.danjb.omnichunk.common.ChunkUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.state.BlockState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class MasterChunk {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String NBT_KEY_HEIGHT = "height";
    private static final String NBT_KEY_TASKS = "tasks";
    private static final String NBT_KEY_TASK_ID = "taskId";

    private static final Map
