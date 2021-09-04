/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.utils;

import java.util.Set;
import java.util.stream.Collectors;

public class RScenarios extends RValue {

    public Set<RScenario> getScenarios() {
        return getObjects().values().stream().map(object -> (RScenario) object).collect(Collectors.toSet());
    }

    public void registerScenario(String name, RScenario scenario) {
        addObject(name, scenario);
    }

    public void unregisterScenario(String name) {
        removeObject(name);
    }

    public void unregisterScenario(RScenario scenario) {
        removeObject(scenario);
    }
}
