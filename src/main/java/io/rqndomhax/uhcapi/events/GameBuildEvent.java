package io.rqndomhax.uhcapi.events;

import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class GameBuildEvent extends Event {

    private final Type type;
    private final String name;
    private final Location center;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public GameBuildEvent(Type type, String name, Location center) {
        this.type = type;
        this.name = name;
        this.center = center;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Location getCenter() {
        return center;
    }

    public enum Type {
        STARTED,
        ENDED;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

}
