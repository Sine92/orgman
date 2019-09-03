package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryImplTest {
    private User user;
    private UserRepository userRepository;
    @Test
    public void a_create() {
       userRepository = UserRepositoryImpl.getUserRepository();
       user = UserFactory.buildUser("kewuti@gmail.com","Sinetemba","Kewuti");
       assertEquals(userRepository.create(user),userRepository.create(user));

    }

    @Test
    public void b_read() {
        userRepository = UserRepositoryImpl.getUserRepository();
        user = UserFactory.buildUser("kewuti@gmail.com","Sinetemba","Kewuti");
        assertEquals(userRepository.read(user.getUserEmail()),userRepository.read(user.getUserEmail()));
    }

    @Test
    public void c_update() {
        userRepository = UserRepositoryImpl.getUserRepository();
        user = UserFactory.buildUser("kewuti@gmail.com","Sinetemba","Kewuti");
        assertEquals(userRepository.update(user),userRepository.update(user));
    }

    @Test
    public void e_delete() {
        userRepository = UserRepositoryImpl.getUserRepository();
        user = UserFactory.buildUser("kewuti@gmail.com","Sinetemba","Kewuti");
        this.userRepository.delete(user.getUserEmail());
    }

    @Test
    public void d_getAll() {
        userRepository = UserRepositoryImpl.getUserRepository();
        user = UserFactory.buildUser("kewuti@gmail.com","Sinetemba","Kewuti");
        Set<User> all = this.userRepository.getAll();
        assertEquals(all,all);

    }
}