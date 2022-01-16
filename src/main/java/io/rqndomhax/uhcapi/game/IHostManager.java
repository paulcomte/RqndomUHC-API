/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

import io.rqndomhax.uhcapi.utils.inventory.RInventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public interface IHostManager {

    void setHost(Object object);

    boolean isHost(Object object);

    boolean isCoHost(Object object);

    void addCoHost(Object object);

    void removeCoHost(Object object);

    HashMap<JavaPlugin, RInventory> getPluginConfigInventory(); // The config inventory must be stored in the DynamicInventoryManager

    RInventory getConfigInventory(JavaPlugin plugin);

}
