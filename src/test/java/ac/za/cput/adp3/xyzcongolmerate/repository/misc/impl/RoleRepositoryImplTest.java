package ac.za.cput.adp3.xyzcongolmerate.repository.misc.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.misc.RoleRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleRepositoryImplTest {
    private Role role;
    private RoleRepository roleRepository;

    @Test
    public void a_create() {
        roleRepository = RoleRepositoryImpl.getRoleRepository();
        role = RoleFactory.buildRole("Data Analyst");
        assertEquals(roleRepository.create(role),roleRepository.create(role));

    }

    @Test
    public void b_read() {
        roleRepository = RoleRepositoryImpl.getRoleRepository();
        role = RoleFactory.buildRole("Data Analyst");
        assertEquals(roleRepository.read(role.getRoleId()),roleRepository.read(role.getRoleId()));
    }

    @Test
    public void c_update() {
        roleRepository = RoleRepositoryImpl.getRoleRepository();
        role = RoleFactory.buildRole("Data Analyst");
        assertEquals(roleRepository.update(role),roleRepository.update(role));
    }

    @Test
    public void e_delete() {
        roleRepository = RoleRepositoryImpl.getRoleRepository();
        role = RoleFactory.buildRole("Data Analyst");
        this.roleRepository.delete(role.getRoleId());
    }

    @Test
    public void d_getAll() {
        roleRepository = RoleRepositoryImpl.getRoleRepository();
        role = RoleFactory.buildRole("Data Analyst");
        Set<Role> all = this.roleRepository.getAll();
        assertEquals(all,all);
    }
}