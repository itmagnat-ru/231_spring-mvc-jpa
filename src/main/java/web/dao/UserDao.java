package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

    void removeUser(long id);

    void addUser(User user);

    void update(User user);

    User getUser(long id);
}
