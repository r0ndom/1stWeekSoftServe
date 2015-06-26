package com.softserve.task.manager.util;

import com.softserve.task.manager.dao.TaskListDao;
import com.softserve.task.manager.dao.impl.TaskListCollectionDaoImpl;
import com.softserve.task.manager.model.TaskList;

/**
 * Created by r0ndom on 26.06.15.
 */
public class TaskListFactory implements AbstractDaoFactory<TaskList> {

    private TaskListDao taskListDao = new TaskListCollectionDaoImpl();
    private static TaskListFactory taskListFactory;

    private TaskListFactory(){}

    @Override
    public TaskListDao getDao() {
        return taskListFactory.taskListDao;
    }

    public static TaskListFactory getFactory() {
        if (taskListFactory == null) {
            taskListFactory = new TaskListFactory();
        }
        return taskListFactory;
    }
}
