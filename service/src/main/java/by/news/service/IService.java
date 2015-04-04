package by.news.service;

import java.io.Serializable;

/**
 * Created by Narek on 30.03.2015.
 */
public interface IService<T> {
    void add(T t);

    void update(T t);

    T get(Class<T> clazz, Serializable id);

    void delete(T t);

    void refresh(T t);
}
