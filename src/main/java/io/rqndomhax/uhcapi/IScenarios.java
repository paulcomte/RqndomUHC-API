/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import org.bukkit.event.Listener;

import java.util.Set;

public interface IScenarios {

    Set<Listener> getScenarios();

    void registerScenario(String name, Listener listener);

    void unregisterScenario(String name);

    void unregisterScenario(Listener listener);

}
