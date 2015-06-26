package com.softserve.task.manager.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by r0ndom on 26.06.15.
 */
public class TaskList implements Serializable, Auditable{

    private Long id;
    private String name;
    private Integer priority;
    private List<Task> tasks;

    public TaskList() {
    }

    public TaskList(Long id, String name, Integer priority, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskList taskList = (TaskList) o;

        if (!id.equals(taskList.id)) return false;
        if (!name.equals(taskList.name)) return false;
        if (!priority.equals(taskList.priority)) return false;
        if (tasks != null ? !tasks.equals(taskList.tasks) : taskList.tasks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + priority.hashCode();
        result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", tasks=" + tasks +
                '}';
    }
}
