/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import io.rqndomhax.uhcapi.game.RGamePlayer;
import io.rqndomhax.uhcapi.game.RHost;
import io.rqndomhax.uhcapi.game.RRules;
import io.rqndomhax.uhcapi.utils.RDynamicInventory;
import io.rqndomhax.uhcapi.utils.RScoreboard;
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
