package io.rqndomhax.uhcapi.events;

import io.rqndomhax.uhcapi.game.IRole;
import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Set;

public final class GameEndEvent extends Event {

    private final Set<IRole> winners;
    private final String winnerTeam;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public GameEndEvent(Set<IRole> winners, String winnerTeam) {
        this.winners = winners;
        this.winnerTeam = winnerTeam;
    }

    public Set<IRole> getWinners() {
        return winners;
    }

    public String getWinnerTeam() {
        return winnerTeam;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

}
