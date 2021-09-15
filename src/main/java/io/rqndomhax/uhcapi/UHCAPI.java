/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import io.rqndomhax.uhcapi.game.RGamePlayer;
import io.rqndomhax.uhcapi.game.RHostManager;
import io.rqndomhax.uhcapi.game.RRules;
import io.rqndomhax.uhcapi.role.RRoleManager;
import io.rqndomhax.uhcapi.scenarios.RScenariosManager;
import io.rqndomhax.uhcapi.utils.RDynamicInventory;
import io.rqndomhax.uhcapi.utils.RScoreboard;
import io.rqndomhax.uhcapi.world.RWorldManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Set;
import java.util.UUID;

public interface UHCAPI {

    JavaPlugin getPlugin();

    RWorldManager getWorldManager();

    RHostManager getHostManager();

    RScoreboard getScoreboardManager();

    RDynamicInventory getInventories();

    RRules getRules();

    Set<RGamePlayer> getGamePlayers();

    RGamePlayer getGamePlayer(String username);

    RGamePlayer getGamePlayer(UUID uuid);

    RGamePlayer getGamePlayer(Player player);

}
