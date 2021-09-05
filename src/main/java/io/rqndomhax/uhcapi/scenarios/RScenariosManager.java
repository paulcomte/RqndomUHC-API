/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.scenarios;

import java.util.Set;

public interface RScenariosManager {

    Set<RScenario> getScenarios();

    RScenario getScenario(String key);

    void registerScenario(String name, RScenario scenario);

    void unregisterScenario(String name);

    void unregisterScenario(RScenario scenario);
}
