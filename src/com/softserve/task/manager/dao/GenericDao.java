package com.softserve.task.manager.dao;


import java.util.List;


public interface GenericDao<T> {

    T create(T t);

    void delete(long id);

    T find(long id);

    T update(T t);

    List<T> findAll();

}
