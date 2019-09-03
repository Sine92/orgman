package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;

public class UserFactory {

    //TODO: implement method body ONLY!
    public static User buildUser(String userEmail, String firstName, String lastName) {
        return new User.Builder()
                .userEmail(userEmail)
                .lastName(firstName)
                .firstName(lastName)
                .build();
    }
}
