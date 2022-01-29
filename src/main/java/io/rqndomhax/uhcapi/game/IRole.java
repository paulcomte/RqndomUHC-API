package io.rqndomhax.uhcapi.game;

import io.rqndomhax.uhcapi.game.IGamePlayer;
import io.rqndomhax.uhcapi.utils.RValue;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public interface IRole {

    void onPlayerDeath(IGamePlayer dead);

    void onEntityDeath(EntityDeathEvent dead);

    void onEntityDamage(EntityDamageEvent damaged);

    void onPlayerHit(IGamePlayer damaged);

    void onPlayerAttacked(IGamePlayer attacker, IGamePlayer attacked);

    void onPlayerAttacked(Entity attacker, IGamePlayer attacked);

    void onPlayerKill(IGamePlayer killed);

    void onSelfDeath(PlayerDeathEvent self);

    void onSelfDamage(EntityDamageEvent self);

    void onDesc();

    void giveEffects();

    void onCommand(String[] args);

    void onClaim();

    void onRoleGiven();

    void onNewEpisode();

    RValue getRoleInfos();

    IGamePlayer getGamePlayer();

    Player getPlayer();

}
