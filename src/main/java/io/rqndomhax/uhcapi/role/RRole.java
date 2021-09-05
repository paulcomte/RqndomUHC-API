package io.rqndomhax.uhcapi.role;

import io.rqndomhax.uhcapi.game.RGamePlayer;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public interface RRole {

    public void onPlayerDeath(PlayerDeathEvent dead);

    public void onEntityDeath(EntityDeathEvent dead);

    public void onEntityDamage(EntityDamageEvent damaged);

    public void onPlayerHit(RGamePlayer damaged);

    public void onPlayerKill(RGamePlayer killed);

    public void onSelfDeath(PlayerDeathEvent self);

    public void onSelfDamage(EntityDamageEvent self);

    public void onDesc();

    public void giveEffects();

    public void onCommand(String[] args);

    public void onClaim();

    public void onRoleGiven();

}
