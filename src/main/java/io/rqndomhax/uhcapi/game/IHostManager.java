/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

import io.rqndomhax.uhcapi.utils.inventory.RInventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public interface IHostManager {

    UUID getHost(); // Host and Co-host are stored in UUIDs

    String getHostName();

    void setHost(Object object); // You can give a Player, OfflinePlayer, String, and UUID

    boolean isHost(Object object);

    boolean isCoHost(Object object);

    void addCoHost(Object object); // Same thing for IHostManager#setHost

    void removeCoHost(Object object);

    HashMap<JavaPlugin, RInventory> getPluginConfigInventory(); // The config inventory must be stored in the DynamicInventoryManager

    RInventory getConfigInventory(JavaPlugin plugin);

}
