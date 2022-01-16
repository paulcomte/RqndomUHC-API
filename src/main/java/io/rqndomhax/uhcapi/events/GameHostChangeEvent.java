package io.rqndomhax.uhcapi.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public final class GameHostChangeEvent extends Event implements Cancellable {

    private final UUID previousHost;
    private final UUID newHost;
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled = false;

    public GameHostChangeEvent(UUID previousHost, UUID newHost) {
        this.previousHost = previousHost;
        this.newHost = newHost;
    }

    public UUID getPreviousHost() {
        return previousHost;
    }

    public UUID getNewHost() {
        return newHost;
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
