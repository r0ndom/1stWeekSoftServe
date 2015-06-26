package com.softserve.task.manager;

import com.softserve.task.manager.dao.UserDao;
import com.softserve.task.manager.model.TaskList;
import com.softserve.task.manager.model.User;
import com.softserve.task.manager.util.UserDaoFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDaoFactory userDaoFactory = UserDaoFactory.getFactory();
        UserDao userDao = userDaoFactory.getDao();
        userDao.create(new User(1L, "admin", "admin", null));
        userDao.create(new User(2L, "pasha", "qwerty", null));
        List<TaskList> taskLists = new ArrayList<TaskList>();
        taskLists.add(new TaskList(1L, "main tasks", 1, null));
        userDao.create(new User(3L, "sasha", "12345", taskLists));
        System.out.println(userDao.findAll());
    }
}
