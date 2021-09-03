/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface RGamePlayer {

    UUID getUniqueID();

    String getName();

    Player getPlayer();

    OfflinePlayer getOfflinePlayer();

    boolean isAlive();

    List<UUID> getKills();

    Location getPlayerLocation();

}
