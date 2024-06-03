package Task.pp_3_1_2_SpringBoot.dao;



import Task.pp_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
