package io.rqndomhax.uhcapi.role;

import io.rqndomhax.uhcapi.game.IGamePlayer;

import java.util.HashMap;
import java.util.Set;

public interface IRoleManager {

    void registerRole(String roleKey, IRole role);

    void unregisterRole(String roleKey);

    void unregisterRole(IRole target);

    Set<IGamePlayer> getGamePlayers(Class<? extends IRole> role, Set<IGamePlayer> gamePlayers);

    HashMap<String, IRole> getRoles();

    void enableRole(IRole role);

    void enableRole(String roleKey);

    void disableRole(IRole role);

    void disableRole(String roleKey);

    HashMap<String, IRole> getActiveRoles();

    void dispatchRoles(Set<IGamePlayer> gamePlayers);
}