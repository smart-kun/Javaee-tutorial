package com.giit.www.college.dao;

import java.util.List;

/**
 * Created by c0de8ug on 16-2-11.
 */
public interface ClassDao {
    public void add(Class clazz);

    public void delete(int clazzId);

    public List<Class> findAll();


}