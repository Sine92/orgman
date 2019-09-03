package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserRoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRoleRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRoleRepositoryImplTest {
    private UserRole userRole;
    private UserRoleRepository userRoleRepository;

    @Test
    public void a_create() {
        userRoleRepository = UserRoleRepositoryImpl.getUserRoleRepository();
        userRole = UserRoleFactory.buildUserRole("245","kewuti@gmail.com","Data Analyst");
        assertEquals(userRoleRepository.create(userRole),userRoleRepository.create(userRole));

    }

    @Test
    public void b_read() {
        userRoleRepository = UserRoleRepositoryImpl.getUserRoleRepository();
        userRole = UserRoleFactory.buildUserRole("245","kewuti@gmail.com","Data Analyst");
        assertEquals(userRoleRepository.read(userRole),userRoleRepository.read(userRole));
    }

    @Test
    public void c_update() {
        userRoleRepository = UserRoleRepositoryImpl.getUserRoleRepository();
        userRole = UserRoleFactory.buildUserRole("245","kewuti@gmail.com","Data Analyst");
        assertEquals(userRoleRepository.update(userRole),userRoleRepository.update(userRole));
    }

    @Test
    public void e_delete() {
        userRoleRepository = UserRoleRepositoryImpl.getUserRoleRepository();
        userRole = UserRoleFactory.buildUserRole("245","kewuti@gmail.com","Data Analyst");
        this.userRoleRepository.delete(userRole);
    }

    @Test
    public void d_getAll() {
        userRoleRepository = UserRoleRepositoryImpl.getUserRoleRepository();
        userRole = UserRoleFactory.buildUserRole("245","kewuti@gmail.com","Data Analyst");
        Set<UserRole> all = this.userRoleRepository.getAll();
    }
}