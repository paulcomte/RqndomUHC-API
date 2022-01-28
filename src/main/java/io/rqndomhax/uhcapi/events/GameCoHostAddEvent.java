package io.rqndomhax.uhcapi.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public final class GameCoHostAddEvent extends Event implements Cancellable {

    private final UUID newCoHost;
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled = false;

    public GameCoHostAddEvent(UUID newCoHost) {
        this.newCoHost = newCoHost;
    }

    public UUID getNewCoHost() {
        return newCoHost;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
}
