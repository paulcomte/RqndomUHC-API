package io.rqndomhax.uhcapi.world;

import org.bukkit.World;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public interface IWorldManager {

    World createWorld(String key, File newDir, String filePath) throws IOException;

    World createWorld(String key, File newDir, File file) throws IOException;

    void deleteWorld(World world) throws IOException;

    void deleteWorld(String key) throws IOException;

    World getWorld(String key);

    HashMap<String, World> getWorlds();

    }
