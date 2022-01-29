package io.rqndomhax.uhcapi.managers;

import org.bukkit.Location;
import org.bukkit.World;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public interface IWorldManager {

    World createWorld(String key, File newDir, String filePath) throws IOException;
    World createWorld(String key, File newDir, File file) throws IOException;

    void createWorld(String key);
    World generateWorld(String key);

    void setMeetupWorld(String key);
    void setMeetupWorld(World world);

    void setPreparationWorld(String key);
    void setPreparationWorld(World world);

    void deleteWorld(World world) throws IOException;
    void deleteWorld(String key) throws IOException;

    World getWorld(String key);
    World getMeetupWorld();
    World getPreparationWorld();

    void generateDefaultLobby(Location center, int radius);
    void destroyDefaultLobby(Location center, int radius);

    void setLobby(Location location);
    Location getLobby();

    void generatePreparationWorld(); // The world pre-gen will follow its WorldBorder

    void generateDefaultEndGameLobby();
    void setEndGameLobby(Location location);

    void clearPlayerData(File path);

    HashMap<String, World> getWorlds();

}
