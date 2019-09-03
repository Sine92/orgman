package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    private UserDemography userDemography;
    Date date = new Date();

    @Test
    public void buildUserDemography() {
        userDemography = UserDemographyFactory.buildUserDemography("kewuti@gmail.com",
                "Dr","Male","raceId",date);

        assertEquals(userDemography,userDemography);
        assertEquals(userDemography.getUserEmail(),userDemography.getUserEmail());

    }
}