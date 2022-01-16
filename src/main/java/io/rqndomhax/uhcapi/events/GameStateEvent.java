package io.rqndomhax.uhcapi.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class GameStateEvent extends Event {

    private final String newGameState;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public GameStateEvent(String newGameState) {
        this.newGameState = newGameState;
    }

    public String getNewGameState() {
        return newGameState;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
