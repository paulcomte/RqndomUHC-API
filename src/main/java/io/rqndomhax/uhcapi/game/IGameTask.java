/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

import io.rqndomhax.uhcapi.game.ITask;
import io.rqndomhax.uhcapi.utils.RValue;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface IGameTask {

    List<Class<? extends ITask>> getTasks();

    ITask getCurrentTask();

    RValue getGameInfos();

    boolean startNextTask() throws IllegalAccessException, InvocationTargetException, InstantiationException;

    void endCurrentTask();

    void setGameState(String gameState);

    String getGameState();

    List<ITask> getBeforeTasks();

    List<ITask> getAfterTasks();

}
