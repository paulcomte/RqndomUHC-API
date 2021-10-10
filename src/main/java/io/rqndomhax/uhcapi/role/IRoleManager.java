package io.rqndomhax.uhcapi.role;

import io.rqndomhax.uhcapi.game.IGamePlayer;

import java.util.HashMap;
import java.util.Set;

public interface IRoleManager {

    void createRole(String roleKey, IRole role);

    void deleteRole(String roleKey);

    void deleteRole(IRole target);

    Set<IGamePlayer> getGamePlayers(IRole role, Set<IGamePlayer> gamePlayers);

    IRole getRole(IGamePlayer gamePlayer);

    HashMap<String, IRole> getRoles();

    void enableRole(IRole role);

    void enableRole(String roleKey);

    void disableRole(IRole role);

    void disableRole(String roleKey);

    HashMap<String, IRole> getActiveRoles();

    void dispatchRoles(Set<IGamePlayer> gamePlayers);
}
