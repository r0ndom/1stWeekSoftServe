package com.softserve.task.manager.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by r0ndom on 26.06.15.
 */
public class User implements Serializable, Auditable{

    private Long id;
    private String name;
    private String password;
    private List<TaskList> lists;

    public User() {
    }

    public User(Long id, String name, String password, List<TaskList> lists) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.lists = lists;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TaskList> getLists() {
        return lists;
    }

    public void setLists(List<TaskList> lists) {
        this.lists = lists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!id.equals(user.id)) return false;
        if (lists != null ? !lists.equals(user.lists) : user.lists != null) return false;
        if (!name.equals(user.name)) return false;
        if (!password.equals(user.password)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + (lists != null ? lists.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", lists=" + lists +
                '}';
    }
}
