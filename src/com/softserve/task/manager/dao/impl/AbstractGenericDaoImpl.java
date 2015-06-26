package com.softserve.task.manager.dao.impl;

import com.softserve.task.manager.dao.GenericDao;
import com.softserve.task.manager.model.Auditable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by r0ndom on 26.06.15.
 */
public abstract class AbstractGenericDaoImpl<T extends Auditable> implements GenericDao<T> {

    private List<T> list;

    protected AbstractGenericDaoImpl() {
        list = new ArrayList<T>();
    }

    @Override
    public T create(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(long id){
        T obj = find(id);
        list.remove(obj);
    }

    @Override
    public T find(long id){
        for (T obj : list) {
            if (obj.getId() == id) {
                return obj;
            }
        }
        return null;
    }


    // must be transactional
    @Override
    public T update(T t){
        T obj = find(t.getId());
        list.remove(obj);
        list.add(t);
        return t;
    }

    @Override
    public List<T> findAll(){
        return list;
    }
}
