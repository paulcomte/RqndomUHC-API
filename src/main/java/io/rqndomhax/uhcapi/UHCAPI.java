/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import io.rqndomhax.uhcapi.game.IGamePlayer;
import io.rqndomhax.uhcapi.game.IGameTask;
import io.rqndomhax.uhcapi.managers.IHostConfigManager;
import io.rqndomhax.uhcapi.managers.IHostManager;
import io.rqndomhax.uhcapi.game.IRules;
import io.rqndomhax.uhcapi.utils.IScoreboard;
import io.rqndomhax.uhcapi.utils.inventory.IDynamicInventoryManager;
import io.rqndomhax.uhcapi.managers.IWorldManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Set;
import java.util.UUID;

public interface UHCAPI {

    JavaPlugin getPlugin();

    IWorldManager getWorldManager();

    IHostManager getHostManager();

    IHostConfigManager getHostConfigManager();

    IScoreboard getScoreboardManager();

    IDynamicInventoryManager getInventories();

    IRules getRules();

    Set<IGamePlayer> getGamePlayers();

    IGamePlayer getGamePlayer(String username);

    IGamePlayer getGamePlayer(UUID uuid);

    IGamePlayer getGamePlayer(Player player);

    IGamePlayer registerGamePlayer(Player player);

    IGameTask getGameTaskManager();

}
