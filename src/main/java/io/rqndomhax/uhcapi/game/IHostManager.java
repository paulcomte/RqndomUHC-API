/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

public interface IHostManager {

    void setHost(Object object);

    boolean isHost(Object object);

    boolean isCoHost(Object object);

    void addCoHost(Object object);

    void removeCoHost(Object object);

}
