/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface RGameTask {

    List<Class<? extends RTask>> getTasks();

    RTask getCurrentTask();

    int getEpisode();

    int getElapsedTime();

    int getElapsedRawTime();

    boolean startNextTask() throws IllegalAccessException, InvocationTargetException, InstantiationException;

}
