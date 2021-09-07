/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.scenarios;

import io.rqndomhax.uhcapi.role.RRole;

import java.util.HashMap;

public interface RScenariosManager {

    HashMap<String, RScenario> getScenarios();

    RScenario getScenario(String scenarioKey);

    void registerScenario(String scenarioKey, RScenario scenario);

    void unregisterScenario(String scenarioKey);

    void unregisterScenario(RScenario scenario);

    void enableScenario(RScenario scenario);

    void enableScenario(String scenarioKey);

    void disableScenario(RScenario scenario);

    void disableScenario(String scenarioKey);

    HashMap<String, RScenario> getActiveScenarios();

}
