/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Set;

public interface UHCAPI {

    JavaPlugin getPlugin();

    RHost getHostManager();

    RDynamicInventory getInventories();

    RScoreboard getScoreboard();

    RRules getRules();

    Set<RGamePlayer> getGamePlayers();

}
