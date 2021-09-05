package io.rqndomhax.uhcapi.world;

import org.bukkit.World;

import java.io.File;
import java.io.IOException;

public interface RWorldManager {

    public World createWorld(String key, File newDir, String filePath) throws IOException;

    public World createWorld(String key, File newDir, File file) throws IOException;

    public void deleteWorld(World world, boolean saveChunks) throws IOException;

    public void deleteWorld(String key, boolean saveChunks) throws IOException;

    public World getWorld(String key);

}
