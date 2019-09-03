package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

   private UserRole userRole;
    @Test
    public void buildUserRole() {
        userRole = UserRoleFactory.buildUserRole("245","kewuti@gmail.com","Manager");
        assertEquals(userRole,userRole);
        assertEquals(userRole.getOrgCode(),userRole.getOrgCode());

    }
}