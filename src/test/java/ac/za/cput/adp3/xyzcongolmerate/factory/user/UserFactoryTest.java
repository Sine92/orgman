package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    private User user;
    @Test
    public void buildUser() {
        user = UserFactory.buildUser("kewuti@gmail.com","Sinetemba","Kewuti");
        assertEquals(user,user);
        assertEquals(user.getUserEmail(),user.getUserEmail());

    }
}