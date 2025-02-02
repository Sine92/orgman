package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRepository;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository {

    private Set<User> userDB;
    private static UserRepository userRepository = null;

    private UserRepositoryImpl() {
        this.userDB = new HashSet<>();
    }

    public static UserRepository getUserRepository() {
        if (userRepository == null) userRepository = new UserRepositoryImpl();
        return userRepository;
    }

    private User findUser(String email)
    {
        return this.userDB.stream()
                .filter(user -> user.getUserEmail().trim().equals(email))
                .findAny()
                .orElse(null);
    }


    @Override
    public User create(User user) {
        this.userDB.add(user);
        return user;
    }


    @Override
    public User read(String email) {
       User user = findUser(email);
       return user;
    }


    @Override
    public User update(User user) {
       User toUpdate = findUser(user.getUserEmail());
       if(toUpdate!= null){
           this.userDB.remove(toUpdate);
           return create(user);
       }
       return null;
    }


    @Override
    public void delete(String email) {

       User toDelete = findUser(email);
       if(toDelete!= null){
           this.userDB.remove(toDelete);
       }
    }


    @Override
    public Set<User> getAll() {
        return  this.userDB;
    }
}
