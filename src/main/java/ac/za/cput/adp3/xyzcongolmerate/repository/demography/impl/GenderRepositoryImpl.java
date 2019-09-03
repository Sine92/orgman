package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepository genderRepository = null;

    private Set<Gender> genderDB;

    private GenderRepositoryImpl() {
        this.genderDB = new HashSet<>();
    }

    public static GenderRepository genderRepository() {
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }
    private Gender findGender(String genderId)
    {
        return this.genderDB.stream()
                .filter(gender -> gender.getGenderId().trim().equals(genderId))
                .findAny()
                .orElse(null);

    }



    @Override
    public Gender create(Gender gender) {
        genderDB.add(gender);
        return gender;
    }


    @Override
    public Gender read(String genderId) {
        Gender gender = findGender(genderId);
        return gender;
    }

    //TODO: Implement body
    @Override
    public Gender update(Gender gender) {
       Gender toUpdate = findGender(gender.getGenderId());
       if(toUpdate!=null){
           this.genderDB.remove(toUpdate);
           return create(gender);
       }
       return null;
    }


    @Override
    public void delete(String genderId) {
        Gender gender = findGender(genderId);
        if(gender!=null){
            this.genderDB.remove(gender);
        }
    }


    @Override
    public Set<Gender> getAll() {
       return this.genderDB;
    }
}
