package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

   private Organisation organisation;
    @Test
    public void buildOrganisation() {
        organisation = OrganisationFactory.buildOrganisation("Woolies");
        assertEquals(organisation.getOrgCode(),organisation.getOrgCode());
        assertEquals(organisation,organisation);

    }
}