/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

public interface IGameTask {

    List<Class<? extends GameTask>> getTasks();

    GameTask getCurrentTask();

    int getEpisode();

    int getElapsedTime();

    int getElapsedRawTime();

    boolean startNextTask() throws IllegalAccessException, InvocationTargetException, InstantiationException;

}
