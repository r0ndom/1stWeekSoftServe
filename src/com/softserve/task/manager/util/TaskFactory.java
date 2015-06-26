package com.softserve.task.manager.util;

import com.softserve.task.manager.dao.TaskDao;
import com.softserve.task.manager.dao.impl.TaskCollectionDaoImpl;
import com.softserve.task.manager.model.Task;

/**
 * Created by r0ndom on 26.06.15.
 */
public class TaskFactory implements AbstractDaoFactory<Task> {

    private TaskDao taskDao = new TaskCollectionDaoImpl();
    private static TaskFactory taskFactory;

    private TaskFactory(){}

    @Override
    public TaskDao getDao() {
        return taskFactory.taskDao;
    }

    public static TaskFactory getFactory() {
        if (taskFactory == null) {
            taskFactory = new TaskFactory();
        }
        return taskFactory;
    }
}
