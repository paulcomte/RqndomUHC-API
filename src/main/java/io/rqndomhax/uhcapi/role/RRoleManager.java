package io.rqndomhax.uhcapi.role;

import io.rqndomhax.uhcapi.game.RGamePlayer;

import java.util.HashMap;
import java.util.Set;

public interface RRoleManager {

    void createRole(String roleKey, Class<? extends RRole> role);

    void deleteRole(String roleKey);

    void deleteRole(Class<? extends RRole> target);

    Set<RGamePlayer> getGamePlayer(RRole role);

    RRole getRole(RGamePlayer gamePlayer);
    
    HashMap<String, RRole> getRoles();
}
