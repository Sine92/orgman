package ac.za.cput.adp3.xyzcongolmerate.repository.misc.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.repository.misc.RoleRepository;

import java.util.HashSet;
import java.util.Set;

public class RoleRepositoryImpl implements RoleRepository {

    private Set<Role> roleDB;
    private static RoleRepository roleRepository = null;

    private RoleRepositoryImpl() {
        this.roleDB = new HashSet<>();
    }

    public static RoleRepository getRoleRepository() {
        if (roleRepository == null) roleRepository = new RoleRepositoryImpl();
        return roleRepository;
    }
    private Role findRole(String roleId)
    {
        return this.roleDB.stream()
                .filter(role -> role.getRoleId().trim().equals(roleId))
                .findAny()
                .orElse(null);

    }


    @Override
    public Role create(Role role) {
       this.roleDB.add(role);
       return role;
    }


    @Override
    public Role read(String roleId) {
        Role role = findRole(roleId);
        return role;
    }


    @Override
    public Role update(Role role) {
        Role toUpdate = findRole(role.getRoleId());
        if(toUpdate!=null){
            this.roleDB.remove(toUpdate);
            return  create(role);
        }
        return null;
    }


    @Override
    public void delete(String roleId) {

        Role toDelete = findRole(roleId);
        this.roleDB.remove(toDelete);

    }


    @Override
    public Set<Role> getAll() {
       return this.roleDB;
    }
}
