package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void removeUser(long id);

    void update(User user);

    User getUser(long id);

    List<User> listUsers();

}
