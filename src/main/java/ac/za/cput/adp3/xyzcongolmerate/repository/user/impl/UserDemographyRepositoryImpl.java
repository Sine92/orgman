package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserDemographyRepository;

import java.util.HashSet;
import java.util.Set;

public class UserDemographyRepositoryImpl implements UserDemographyRepository {

    private Set<UserDemography> userDemographyDB;
    private static UserDemographyRepository userDemographyRepository = null;

    private UserDemographyRepositoryImpl() {
        this.userDemographyDB = new HashSet<>();
    }

    public static UserDemographyRepository getUserDemographyRepository() {
        if (userDemographyRepository == null) userDemographyRepository = new UserDemographyRepositoryImpl();
        return userDemographyRepository;
    }

    private UserDemography findUserDemography(String userEmail)
    {
        return this.userDemographyDB.stream()
                .filter(userDemography -> userDemography.getUserEmail().trim().trim().equals(userEmail))
                .findAny()
                .orElse(null);
    }



    @Override
    public UserDemography create(UserDemography userDemography) {
       this.userDemographyDB.add(userDemography);
       return userDemography;
    }


    @Override
    public UserDemography read(String userEmail) {
        UserDemography userDemography = findUserDemography(userEmail);
        return userDemography;
    }


    @Override
    public UserDemography update(UserDemography userDemography) {
        UserDemography toUpdate = findUserDemography(userDemography.getUserEmail());
                if(toUpdate!= null){
                    this.userDemographyDB.remove(toUpdate);
                    return create(userDemography);
                }
           return null;
    }


    @Override
    public void delete(String userEmail) {
        UserDemography toDelete = findUserDemography(userEmail);
        if(toDelete!=null){
            this.userDemographyDB.remove(toDelete);


        }
    }


    @Override
    public Set<UserDemography> getAll() {
        return this.userDemographyDB;
    }
}
