/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi.utils;

import java.util.HashMap;
import java.util.Map;

public class RValue {

    final HashMap<String, Object> objects = new HashMap<>();

    public void addObject(String objectKey, Object object) {
        objects.put(objectKey, object);
    }

    public void removeKey(String key) {
        objects.remove(key);
    }

    public void removeObject(Object target) {
        objects.remove(objects.entrySet().stream().filter(object -> object.getValue().equals(target)).map(Map.Entry::getKey).findFirst().orElse(null));
    }

    public Object getObject(String key) {
        return objects.get(key);
    }

    public String getKey(Object target) {
        return objects.entrySet().stream().filter(object -> object.getValue().equals(target)).map(Map.Entry::getKey).findFirst().orElse(null);
    }

    public HashMap<String, Object> getObjects() {
        return objects;
    }

}
