/*
 * Copyright (c) 2021.
 *  Github: https://github.com/RqndomHax
 */

package io.rqndomhax.uhcapi;

import java.util.HashMap;

public class GameValue {

    final HashMap<String, Object> objects = new HashMap<>();

    public void addObject(String objectName, Object object) {
        objects.put(objectName, object);
    }

    public void removeObject(Object object) {
        objects.remove(object);
    }

    public Object getObject(Object object) {
        return objects.get(object);
    }

    public HashMap<String, Object> getObjects() {
        return objects;
    }

}
