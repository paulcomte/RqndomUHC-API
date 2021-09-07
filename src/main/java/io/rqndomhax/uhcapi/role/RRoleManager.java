package io.rqndomhax.uhcapi.role;

import io.rqndomhax.uhcapi.game.RGamePlayer;

import java.util.HashMap;
import java.util.Set;

public interface RRoleManager {

    void addTeam(String teamKey, Class<?> team);

    void removeTeam(Class<?> team);

    void removeTeam(String teamKey);

    void createRole(String roleKey, RRole role);

    void deleteRole(String roleKey);

    void deleteRole(RRole target);

    Set<RGamePlayer> getGamePlayers(RRole role, Set<RGamePlayer> gamePlayers);

    RRole getRole(RGamePlayer gamePlayer);

    HashMap<String, RRole> getRoles();

    void enableRole(RRole role);

    void enableRole(String roleKey);

    void disableRole(RRole role);

    void disableRole(String roleKey);

    HashMap<String, RRole> getActiveRoles();

    void dispatchRoles(Set<RGamePlayer> gamePlayers);
}
