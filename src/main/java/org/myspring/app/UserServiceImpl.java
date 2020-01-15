package org.myspring.app;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L, "Tom", 22));
        userList.add(new User(2L, "Alic", 12));
        userList.add(new User(3L, "Bob", 32));
        return userList;
    }
}
