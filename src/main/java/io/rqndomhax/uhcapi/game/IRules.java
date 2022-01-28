/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

import io.rqndomhax.uhcapi.managers.IRoleManager;
import io.rqndomhax.uhcapi.managers.RScenariosManager;
import io.rqndomhax.uhcapi.utils.RValue;

public interface IRules {

    RValue getGameInfos();

    void setGameInfos(RValue gameInfos);

    RScenariosManager getScenariosManager();

    IRoleManager getRolesManager();

}
