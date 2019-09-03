package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationUserFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationUserRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrganisationUserRepositoryImplTest {
     private OrganisationUser organisationUser;
     private OrganisationUserRepository organisationUserRepository;
    public void a_create() {
       organisationUserRepository = OrganisationUserRepositoryImpl.getOrganisationUserRepository();
       organisationUser = OrganisationUserFactory.buildOrganisationUser("253","kewuti@gmail.com");
       assertEquals(organisationUserRepository.create(organisationUser),organisationUserRepository.create(organisationUser));
    }

    @Test
    public void b_read() {
        organisationUserRepository = OrganisationUserRepositoryImpl.getOrganisationUserRepository();
        organisationUser = OrganisationUserFactory.buildOrganisationUser("253","kewuti@gmail.com");
        assertEquals(organisationUserRepository.read(organisationUser.getOrgCode(),organisationUser.getUserEmail()),
                organisationUserRepository.read(organisationUser.getOrgCode(),organisationUser.getUserEmail()));
    }

    @Test
    public void c_update() {
        organisationUserRepository = OrganisationUserRepositoryImpl.getOrganisationUserRepository();
        organisationUser = OrganisationUserFactory.buildOrganisationUser("253","kewuti@gmail.com");
        assertEquals(organisationUserRepository.update(organisationUser),organisationUserRepository.update(organisationUser));
    }

    @Test
    public void e_delete() {
        organisationUserRepository = OrganisationUserRepositoryImpl.getOrganisationUserRepository();
        organisationUser = OrganisationUserFactory.buildOrganisationUser("253","kewuti@gmail.com");
        this.organisationUserRepository.delete(organisationUser.getOrgCode(),organisationUser.getUserEmail());
    }

    @Test
    public void d_getAll() {
        organisationUserRepository = OrganisationUserRepositoryImpl.getOrganisationUserRepository();
        organisationUser = OrganisationUserFactory.buildOrganisationUser("253","kewuti@gmail.com");
        Set<OrganisationUser> all = this.organisationUserRepository.getAll();
    }
}