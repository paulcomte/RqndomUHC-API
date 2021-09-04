/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

import io.rqndomhax.uhcapi.utils.RValue;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.Set;
import java.util.UUID;

public interface RGamePlayer {

    UUID getUniqueID();

    String getName();

    Player getPlayer();

    OfflinePlayer getOfflinePlayer();

    boolean isAlive();

    void setAlive(boolean isAlive);

    Set<UUID> getKills();

    Location getPlayerLocation();

    RValue getPlayerInfos();

}
