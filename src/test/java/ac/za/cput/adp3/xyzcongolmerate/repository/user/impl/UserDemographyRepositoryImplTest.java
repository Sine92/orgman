package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserDemographyFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserDemographyRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDemographyRepositoryImplTest {
    private UserDemography userDemography;
    private UserDemographyRepository userDemographyRepository;
    @Test
    public void a_create() {
        Date date = new Date();
       userDemographyRepository = UserDemographyRepositoryImpl.getUserDemographyRepository();
       userDemography = UserDemographyFactory.buildUserDemography("kewuti@gmail.com","Mr",
               "Male","Black",date);
       assertEquals(userDemographyRepository.create(userDemography),userDemographyRepository.create(userDemography));
    }

    @Test
    public void b_read() {
        Date date = new Date();
        userDemographyRepository = UserDemographyRepositoryImpl.getUserDemographyRepository();
        userDemography = UserDemographyFactory.buildUserDemography("kewuti@gmail.com","Mr",
                "Male","Black",date);
        assertEquals(userDemographyRepository.read(userDemography.getGenderId()),userDemographyRepository.read(userDemography.getGenderId()));
    }

    @Test
    public void c_update() {
        Date date = new Date();
        userDemographyRepository = UserDemographyRepositoryImpl.getUserDemographyRepository();
        userDemography = UserDemographyFactory.buildUserDemography("kewuti@gmail.com","Mr",
                "Male","Black",date);
        assertEquals(userDemographyRepository.update(userDemography),userDemographyRepository.update(userDemography));
    }

    @Test
    public void e_delete() {
        Date date = new Date();
        userDemographyRepository = UserDemographyRepositoryImpl.getUserDemographyRepository();
        userDemography = UserDemographyFactory.buildUserDemography("kewuti@gmail.com","Mr",
                "Male","Black",date);
        this.userDemographyRepository.delete(userDemography.getGenderId());
    }

    @Test
    public void d_getAll() {
        Date date = new Date();
        userDemographyRepository = UserDemographyRepositoryImpl.getUserDemographyRepository();
        userDemography = UserDemographyFactory.buildUserDemography("kewuti@gmail.com","Mr",
                "Male","Black",date);
        Set<UserDemography> all = this.userDemographyRepository.getAll();
        assertEquals(all,all);
    }
}