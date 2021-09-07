/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.utils;

import io.rqndomhax.uhcapi.utils.inventory.RInventory;
import org.bukkit.entity.Player;

import java.util.HashMap;

public interface RDynamicInventory {

    void addInventory(String inventoryKey, RInventory inventory);

    void openInventory(String inventoryKey, Player player);

    void openInventory(RInventory inventoryKey, Player player);

    void onInventoryClose(Player player);

    void updateInventory(String inventoryKey);

    void updateInventory(RInventory inventory);

    RInventory getInventory(String inventoryKey);

    String getInventoryKey(RInventory inventory);

    HashMap<String, RInventory> getInventories();
}
