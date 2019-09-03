package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {
    private Gender gender;
    private GenderRepository genderRepository;
    @Test
    public void a_create() {
        genderRepository = GenderRepositoryImpl.genderRepository();
        gender = GenderFactory.buildGender("Male");

        assertEquals(genderRepository.create(gender),genderRepository.create(gender));

    }

    @Test
    public void b_read() {
        genderRepository = GenderRepositoryImpl.genderRepository();
        gender = GenderFactory.buildGender("Male");
        assertEquals(genderRepository.read(gender.getGenderId()),genderRepository.read(gender.getGenderId()));

    }

    @Test
    public void c_update() {
        genderRepository = GenderRepositoryImpl.genderRepository();
        gender = GenderFactory.buildGender("Male");
        assertEquals(genderRepository.update(gender),genderRepository.update(gender));
    }

    @Test
    public void e_delete() {
        genderRepository = GenderRepositoryImpl.genderRepository();
        gender = GenderFactory.buildGender("Male");
        this.genderRepository.delete(gender.getGenderId());

    }

    @Test
    public void d_getAll() {
        genderRepository = GenderRepositoryImpl.genderRepository();
        gender = GenderFactory.buildGender("Male");
        Set<Gender> all = this.genderRepository.getAll();
        assertEquals(all,all);
    }
}