package by.news.databaceDAO;

import java.io.Serializable;

/**
 * Created by Narek on 24.03.2015.
 */
public interface Dao<T> {
        T add(T t);

        void update(T t);

        T get(Class<T> clazz, Serializable id);

        void delete(T t);

        void refresh(T t);

}
