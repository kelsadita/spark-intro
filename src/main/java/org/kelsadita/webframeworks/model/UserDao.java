package org.kelsadita.webframeworks.model;

import org.kelsadita.webframeworks.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> getUsersList()
    {
        // Access the database and get users list
        return new ArrayList<User>() {{
            add(new User("kalpesh", "software developer"));
            add(new User("abc", "data scientist"));
        }};
    }
}
