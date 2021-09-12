package io.rqndomhax.uhcapi.role;

import io.rqndomhax.uhcapi.game.RGamePlayer;
import io.rqndomhax.uhcapi.utils.RValue;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public interface RRole {

    void onPlayerDeath(PlayerDeathEvent dead);

    void onEntityDeath(EntityDeathEvent dead);

    void onEntityDamage(EntityDamageEvent damaged);

    void onPlayerHit(RGamePlayer damaged);

    void onPlayerKill(RGamePlayer killed);

    void onSelfDeath(PlayerDeathEvent self);

    void onSelfDamage(EntityDamageEvent self);

    void onDesc();

    void giveEffects();

    void onCommand(String[] args);

    void onClaim();

    void onRoleGiven();

    RValue getRoleInfos();

    RGamePlayer getGamePlayer();

    Player getPlayer();

}
