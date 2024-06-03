package Task.pp_3_1_2_SpringBoot.service;



import Task.pp_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> listUsers();

}
