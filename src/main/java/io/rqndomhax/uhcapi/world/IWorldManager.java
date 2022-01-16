package io.rqndomhax.uhcapi.world;

import org.bukkit.World;
import org.bukkit.WorldBorder;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public interface IWorldManager {

    World createWorld(String key, File newDir, String filePath) throws IOException;
    World createWorld(String key, File newDir, File file) throws IOException;

    World generateWorld(String key);

    void setLobby(String key);
    void setLobby(World world);

    void setMeetupWorld(String key);
    void setMeetupWorld(World world);

    void setPreparationWorld(String key);
    void setPreparationWorld(World world);

    void deleteWorld(World world) throws IOException;
    void deleteWorld(String key) throws IOException;

    World getWorld(String key);
    World getLobby();
    World getMeetupWorld();
    World getPreparationWorld();

    HashMap<String, World> getWorlds();

}
