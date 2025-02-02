package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRoleRepository;

import java.util.HashSet;
import java.util.Set;

public class UserRoleRepositoryImpl implements UserRoleRepository {

    private Set<UserRole> userRoleDB;
    private static UserRoleRepository userRoleRepository = null;

    private UserRoleRepositoryImpl() {
        this.userRoleDB = new HashSet<>();
    }

    public static UserRoleRepository getUserRoleRepository() {
        if (userRoleRepository == null) userRoleRepository = new UserRoleRepositoryImpl();
        return userRoleRepository;
    }

    private UserRole findUserRole(UserRole userRole)
    {
        return this.userRoleDB.stream()
                .filter(userRole1 -> userRole1 == userRole)
                .findAny()
                .orElse(null);
    }

    public UserRole create(UserRole userRole) {
        this.userRoleDB.add(userRole);
        return userRole;
    }


    @Override
    public UserRole read(UserRole userRole) {
        UserRole userRole1 = findUserRole(userRole);
        return userRole1;

    }


    @Override
    public UserRole update(UserRole userRole) {
        UserRole toUpate = findUserRole(userRole);
        if(toUpate!= null){
            this.userRoleDB.remove(toUpate);
            return create(userRole);
        }
        return null;
    }


    @Override
    public void delete(UserRole userRole) {
      UserRole toDelete = findUserRole(userRole);
      if(toDelete!= null){
          this.userRoleDB.remove(toDelete);
      }
    }


    @Override
    public Set<UserRole> getAll() {
        return this.userRoleDB;
    }
}
