/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import org.bukkit.plugin.java.JavaPlugin;

public interface UHCAPI {

    JavaPlugin getPlugin();

    IScoreboard getScoreboard();

    IRules getRules();

}
