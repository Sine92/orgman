package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    private Role role;
    @Test
    public void buildRole() {
        role = RoleFactory.buildRole("Manager");

        assertEquals(role,role);
        assertEquals(role.getRoleId(),role.getRoleId());
    }
}