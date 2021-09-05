/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.game;

import io.rqndomhax.uhcapi.role.RRoleManager;
import io.rqndomhax.uhcapi.scenarios.RScenariosManager;
import io.rqndomhax.uhcapi.utils.RValue;

public interface RRules {

    String getGameTitle();

    void setGameTitle(String gameTitle);

    RValue getTimers();

    RScenariosManager getScenariosManager();

    RRoleManager getRolesManager();

}
