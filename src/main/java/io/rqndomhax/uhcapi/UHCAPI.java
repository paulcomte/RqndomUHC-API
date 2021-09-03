/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.ScoreboardManager;

public interface UHCAPI {

    IScoreboard getScoreboard();

    IRules getRules();

    JavaPlugin getPlugin();

}
