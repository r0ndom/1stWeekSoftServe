package com.softserve.task.manager.util;

import com.softserve.task.manager.dao.GenericDao;

/**
 * Created by r0ndom on 26.06.15.
 */
public interface AbstractDaoFactory<T> {
    GenericDao<T> getDao();
}
