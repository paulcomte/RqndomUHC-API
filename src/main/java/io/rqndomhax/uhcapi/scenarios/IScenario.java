/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.scenarios;

import io.rqndomhax.uhcapi.game.IGamePlayer;
import io.rqndomhax.uhcapi.utils.RValue;

public interface IScenario {

    RValue getScenarioInfos();

    void init();

    void init(IGamePlayer gamePlayer);

    void destroy();
}
