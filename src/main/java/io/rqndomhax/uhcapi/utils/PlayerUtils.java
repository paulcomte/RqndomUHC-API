package io.rqndomhax.uhcapi.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public abstract class PlayerUtils {

    public static double getRadius(Location firstLocation, Location secondLocation) {
        Location first = firstLocation.clone();
        first.setY(secondLocation.getY());
        if (!Objects.equals(firstLocation.getWorld(), secondLocation.getWorld()))
            return Double.MAX_VALUE;
        return first.distanceSquared(secondLocation);
    }

    public static void clearInventory(Player player) {
        player.getInventory().clear();
        player.getInventory().setHelmet(null);
        player.getInventory().setChestplate(null);
        player.getInventory().setLeggings(null);
        player.getInventory().setBoots(null);
        player.setItemOnCursor(null);
        player.updateInventory();
    }

    public static void saveInventory(ItemStack[] items, Player player, boolean clear)  {
        for(int slot = 0; slot < 36; slot++){
            ItemStack item = player.getInventory().getItem(slot);
            items[slot] = item;
        }

        items[36] = player.getInventory().getHelmet();
        items[37] = player.getInventory().getChestplate();
        items[38] = player.getInventory().getLeggings();
        items[39] = player.getInventory().getBoots();

        if (clear)
            clearInventory(player);
    }

    public static void giveInventory(ItemStack[] items, Player player) {
        clearInventory(player);

        for(int slot = 0; slot < 36; slot++){
            ItemStack item = items[slot];
            player.getInventory().setItem(slot, item);
        }

        player.getInventory().setHelmet(items[36]);
        player.getInventory().setChestplate(items[37]);
        player.getInventory().setLeggings(items[38]);
        player.getInventory().setBoots(items[39]);
        player.updateInventory();
    }

    public static HostItemStack getHostItemStackInInventory(ItemStack[] items, ItemStack verify) {
        for (int slot = 0; slot < 40; slot++)
            if (items[slot] != null && items[slot].equals(verify))
                return (HostItemStack) items[slot];
        return (null);
    }

}
