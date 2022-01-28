/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.managers;

import io.rqndomhax.uhcapi.game.IScenario;

import java.util.HashMap;

public interface RScenariosManager {

    HashMap<String, IScenario> getScenarios();

    void clearScenarios();

    IScenario getScenario(String scenarioKey);

    void registerScenario(String scenarioKey, IScenario scenario);

    void unregisterScenario(String scenarioKey);

    void unregisterScenario(IScenario scenario);

    void activateScenario(IScenario scenario);

    void activateScenario(String scenarioKey);

    void deactivateScenario(IScenario scenario);

    void deactivateScenario(String scenarioKey);

    HashMap<String, IScenario> getActiveScenarios();

    void clearActiveScenarios();

    void enableScenarios();

    void enableScenario(IScenario scenario);

    void enableScenario(String scenarioKey);

    void disableScenarios();

    void disableScenario(IScenario scenario);

    void disableScenario(String scenarioKey);

}
