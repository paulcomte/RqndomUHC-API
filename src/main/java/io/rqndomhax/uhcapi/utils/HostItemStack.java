package io.rqndomhax.uhcapi.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Set;
import java.util.function.Consumer;

public class HostItemStack extends ItemStack {

    private final Consumer<PlayerInteractEvent> itemEvent;
    private final Set<Action> actions;
    private final boolean doesCancelAction;

    public HostItemStack(ItemStack item, Consumer<PlayerInteractEvent> itemEvent, Set<Action> actions, boolean doesCancelAction) {
        super(item);
        this.itemEvent = itemEvent;
        this.actions = actions;
        this.doesCancelAction = doesCancelAction;
    }

    public Consumer<PlayerInteractEvent> getItemEvent() {
        return itemEvent;
    }

    public Set<Action> getActions() {
        return actions;
    }

    public boolean doesCancelAction() {
        return doesCancelAction;
    }
}
