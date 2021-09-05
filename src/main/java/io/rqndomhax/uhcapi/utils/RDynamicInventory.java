/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.utils;

import io.rqndomhax.uhcapi.utils.inventory.RInventory;
import org.bukkit.entity.Player;

import java.util.HashMap;

public interface RDynamicInventory {

    void addInventory(String inventoryName, RInventory inventory);

    void openInventory(String inventoryName, Player player);

    void openInventory(RInventory inventory, Player player);

    void onInventoryClose(Player player);

    void updateInventory(String inventoryName);

    void updateInventory(RInventory inventory);

    RInventory getInventory(String inventoryName);

    String getInventoryName(RInventory inventory);

    HashMap<String, RInventory> getInventories();
}
