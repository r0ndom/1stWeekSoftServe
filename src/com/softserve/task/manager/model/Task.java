package com.softserve.task.manager.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by r0ndom on 26.06.15.
 */
public class Task implements Serializable, Auditable{

    private Long id;
    private String name;
    private Date deadline;

    public Task() {
    }

    public Task(Long id, String name, Date deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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

        Task task = (Task) o;

        if (!deadline.equals(task.deadline)) return false;
        if (!id.equals(task.id)) return false;
        if (!name.equals(task.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + deadline.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
