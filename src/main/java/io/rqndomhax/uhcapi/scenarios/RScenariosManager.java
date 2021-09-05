/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.scenarios;

import java.util.HashMap;

public interface RScenariosManager {

    HashMap<String, RScenario> getScenarios();

    RScenario getScenario(String key);

    void registerScenario(String name, RScenario scenario);

    void unregisterScenario(String name);

    void unregisterScenario(RScenario scenario);
}
