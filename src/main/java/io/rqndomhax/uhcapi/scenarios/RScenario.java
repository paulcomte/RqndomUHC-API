/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.scenarios;

import io.rqndomhax.uhcapi.game.RGamePlayer;
import io.rqndomhax.uhcapi.utils.RValue;

public interface RScenario {

    RValue getScenarioInfos();

    void init();

    void init(RGamePlayer gamePlayer);

    void destroy();
}
