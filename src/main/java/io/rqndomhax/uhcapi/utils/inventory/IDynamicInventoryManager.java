/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.utils.inventory;

import org.bukkit.entity.Player;

import java.util.HashMap;

public interface IDynamicInventoryManager {

    void addInventory(String inventoryKey, RInventory inventory);

    void removeInventory(String inventoryKey);

    void removeInventory(RInventory inventory);

    void openInventory(String inventoryKey, Player player);

    void openInventory(RInventory inventoryKey, Player player);

    void onInventoryClose(Player player);

    void updateInventory(String inventoryKey);

    void updateInventory(RInventory inventory);

    RInventory getInventory(String inventoryKey);

    String getInventoryKey(RInventory inventory);

    HashMap<String, RInventory> getInventories();
}
