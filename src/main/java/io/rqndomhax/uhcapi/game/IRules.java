/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

import io.rqndomhax.uhcapi.role.IRoleManager;
import io.rqndomhax.uhcapi.scenarios.RScenariosManager;
import io.rqndomhax.uhcapi.utils.RValue;

public interface IRules {

    String getGameTitle();

    void setGameTitle(String gameTitle);

    RValue getTimers();

    RScenariosManager getScenariosManager();

    void setScenariosManager(RScenariosManager scenariosManager);

    IRoleManager getRolesManager();

    void setRolesManager(IRoleManager rolesManager);

}
