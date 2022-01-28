/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.managers;

import io.rqndomhax.uhcapi.utils.inventory.RInventory;
import org.bukkit.inventory.ItemStack;
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

    void sendToHost(String message); // Send a message to all host connected on the server

    HashMap<JavaPlugin, RInventory> getPluginsConfigInventory(); // The config inventory must be stored in the DynamicInventoryManager

    RInventory getPluginConfigInventory(JavaPlugin plugin);

    ItemStack[] getHostLobbyInventory(); // It will return an inventory the size of a player's inventory

    void setHostLobbyInventory(ItemStack[] newInventory); // It has to be an inventory the size of a player's inventory

}
