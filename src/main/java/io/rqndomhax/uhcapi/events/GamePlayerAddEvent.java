package io.rqndomhax.uhcapi.events;

import io.rqndomhax.uhcapi.game.IGamePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class GamePlayerAddEvent extends Event implements Cancellable {

    private final IGamePlayer gamePlayer;
    private boolean cancel = false;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public GamePlayerAddEvent(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public IGamePlayer getGamePlayer() {
        return gamePlayer;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
