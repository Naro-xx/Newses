package by.news.databaceDAO;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class BaseDao<T> implements Dao<T> {
    private static Logger log = Logger.getLogger(BaseDao.class);
    private SessionFactory sessionFactory;

    @Autowired
    public BaseDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public T add(T t) {
        getSession().save(t);
        log.info("Save:" + t);
        return (T) t;
    }

    public void update(T t) {
        getSession().update(t);
        log.info("Update:" + t);
    }

    public T get(Class<T> clazz, Serializable id) {
        log.info("Get:" + id);
        return (T) getSession().load(clazz, id);
    }

    public void delete(T t) {
        log.info("Delete:" + t);
        getSession().delete(t);
    }

    public void refresh(T t) {
        log.info("Refresh:" + t);
        getSession().refresh(t);
    }
}
