package com.softserve.task.manager.util;

import com.softserve.task.manager.dao.GenericDao;
import com.softserve.task.manager.dao.UserDao;
import com.softserve.task.manager.dao.impl.UserCollectionDaoImpl;
import com.softserve.task.manager.model.User;

/**
 * Created by r0ndom on 26.06.15.
 */
public class UserDaoFactory implements AbstractDaoFactory<User> {
    
    private UserDao userDao = new UserCollectionDaoImpl();
    private static UserDaoFactory userDaoFactory;
    
    private UserDaoFactory(){}

    @Override
    public UserDao getDao() {
        return userDaoFactory.userDao;
    }
    
    public static UserDaoFactory getFactory() {
        if (userDaoFactory == null) {
            userDaoFactory = new UserDaoFactory();
        }
        return userDaoFactory;
    }
}
