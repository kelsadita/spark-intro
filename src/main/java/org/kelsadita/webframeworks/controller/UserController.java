package org.kelsadita.webframeworks.controller;

import org.kelsadita.webframeworks.data.User;
import org.kelsadita.webframeworks.model.UserDao;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.List;

public class UserController
{
    public static ModelAndView loadUsers(Request req, Response res) {

        // Getting list of users using the data access object
        UserDao userDao = new UserDao();
        List<User> users = userDao.getUsersList();

        HashMap<String, Object> viewData = new HashMap<>();
        viewData.put("users", users);

        return new ModelAndView(viewData, "users");
    }
}
