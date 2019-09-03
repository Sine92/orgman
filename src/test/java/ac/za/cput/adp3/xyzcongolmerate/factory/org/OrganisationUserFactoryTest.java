package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

   private OrganisationUser organisationUser;
    @Test
    public void buildOrganisationUser() {

         organisationUser = OrganisationUserFactory.buildOrganisationUser("254","kewuti@gmail.com");
         assertEquals(organisationUser,organisationUser);
         assertEquals(organisationUser.getOrgCode(),organisationUser.getOrgCode());
    }
}