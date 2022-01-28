package io.rqndomhax.uhcapi.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public final class GameCoHostRemoveEvent extends Event implements Cancellable {

    private final UUID previousCoHost;
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled = false;

    public GameCoHostRemoveEvent(UUID previousCoHost) {
        this.previousCoHost = previousCoHost;
    }

    public UUID getPreviousCoHost() {
        return previousCoHost;
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
