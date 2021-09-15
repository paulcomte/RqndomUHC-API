/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.scenarios;

import java.util.HashMap;

public interface RScenariosManager {

    HashMap<String, RScenario> getScenarios();

    RScenario getScenario(String scenarioKey);

    void registerScenario(String scenarioKey, RScenario scenario);

    void unregisterScenario(String scenarioKey);

    void unregisterScenario(RScenario scenario);

    void activateScenario(RScenario scenario);

    void activateScenario(String scenarioKey);

    void deactivateScenario(RScenario scenario);

    void deactivateScenario(String scenarioKey);

    HashMap<String, RScenario> getActiveScenarios();

    void enableScenarios();

    void enableScenario(RScenario scenario);

    void enableScenario(String scenarioKey);

    void disableScenarios();

    void disableScenario(RScenario scenario);

    void disableScenario(String scenarioKey);

}
