package io.rqndomhax.uhcapi.role;

public interface RRoleManager {

    public RRole createRole(String roleKey, Class<? extends RRole> role);

    public void deleteRole(String roleKey);

    public void deleteRole(Class<? extends RRole> role);

}
