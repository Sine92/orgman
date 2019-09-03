package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrganisationRepositoryImplTest {
    private Organisation organisation;
    private OrganisationRepository organisationRepository;

    @Test
    public void a_create() {
       organisationRepository = OrganisationRepositoryImpl.getOrganisationRepository();
       organisation = OrganisationFactory.buildOrganisation("Woolies");
       assertEquals(organisationRepository.create(organisation),organisationRepository.create(organisation));

    }

    @Test
    public void b_read() {
        organisationRepository = OrganisationRepositoryImpl.getOrganisationRepository();
        organisation = OrganisationFactory.buildOrganisation("Woolies");
        assertEquals(organisationRepository.read(organisation.getOrgCode()),organisationRepository.read(organisation.getOrgCode()));
    }

    @Test
    public void c_update() {
        organisationRepository = OrganisationRepositoryImpl.getOrganisationRepository();
        organisation = OrganisationFactory.buildOrganisation("Woolies");
        assertEquals(organisationRepository.update(organisation),organisationRepository.update(organisation));
    }

    @Test
    public void e_delete() {
        organisationRepository = OrganisationRepositoryImpl.getOrganisationRepository();
        organisation = OrganisationFactory.buildOrganisation("Woolies");
        this.organisationRepository.delete(organisation.getOrgCode());
    }

    @Test
    public void d_getAll() {
        organisationRepository = OrganisationRepositoryImpl.getOrganisationRepository();
        organisation = OrganisationFactory.buildOrganisation("Woolies");
        Set<Organisation> all = this.organisationRepository.getAll();
        assertEquals(all,all);
    }
}