/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import io.rqndomhax.uhcapi.utils.inventory.RInventory;
import io.rqndomhax.uhcapi.utils.inventory.RInventoryData;
import org.bukkit.craftbukkit.libs.it.unimi.dsi.fastutil.Hash;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

import java.util.*;

public class RDynamicInventory implements Listener {

    private final HashMap<String, RInventory> inventoriesName = new HashMap<>();
    private final HashMap<RInventory, String> inventoriesInstance = new HashMap<>();
    private final HashMap<RInventory, Set<Player>> players = new HashMap<>();

    public void addInventory(String inventoryName, RInventory inventory) {
        inventoriesInstance.put(inventory, inventoryName);
        inventoriesName.put(inventoryName, inventory);
        players.put(inventory, new HashSet<>());
    }

    public void openInventory(String inventoryName, Player player) {
        openInventory(inventoriesName.get(inventoryName), player);
    }

    public void openInventory(RInventory inventory, Player player) {
        if (inventory == null)
            return;

        players.get(inventory).add(player);
    }

    public void onInventoryClose(Player player) {
        if (!players.values().stream().anyMatch(playerS -> playerS.contains(player)))
            return;
        player.closeInventory();

        Optional<RInventory> result = players.entrySet().stream().filter(target -> target.getValue().contains(player)).map(inventory -> inventory.getKey()).findFirst();

        if (!result.isPresent())
            return;

        players.get(result.get()).remove(player);
    }

    private void updateInventory(String inventoryName) {
        updateInventory(inventoriesName.get(inventoryName));
    }

    private void updateInventory(RInventory inventory) {
        if (inventory == null)
            return;

        Set<Player> players = this.players.get(inventory);

        for (Player player : players)
            player.updateInventory();
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onInventoryClose(InventoryCloseEvent event) {
        onInventoryClose((Player) event.getPlayer());
    }

}
