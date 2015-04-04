package by.news;

import by.news.databaceDAO.util.HibernateUtil;
import by.news.entity.News;
import by.news.entity.NewsCategory;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by Narek on 26.03.2015.
 */
public class NewsesDao {
    public static NewsesDao newsesDao;
    private static Logger log = Logger.getLogger(NewsesDao.class);
    Transaction transaction;

    public static synchronized NewsesDao getNewsDao() {
        if (newsesDao == null) {
            newsesDao = new NewsesDao();
        }
        return newsesDao;
    }
    public  void saveCategory(NewsCategory newsCategory){
        try {
            Session session = HibernateUtil.getHibernateUtil().getSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(newsCategory);
            log.info("saveOrUpdate(t):" + newsCategory);
            transaction.commit();
            log.info("Save or update (commit):" + newsCategory);
        } catch (HibernateException e) {
            log.error("Error save or update PERSON in Dao" + e);
            transaction.rollback();
        }
    }
    public void saveNews(News news) {
        try {
            Session session = HibernateUtil.getHibernateUtil().getSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(news);
            log.info("saveOrUpdate(t):" + news);
            transaction.commit();
            log.info("Save or update (commit):" + news);
        } catch (HibernateException e) {
            log.error("Error save or update PERSON in Dao" + e);
            transaction.rollback();
        }

    }
    public NewsCategory get(Serializable id)  {
        log.info("Get class by id:" + id);
        NewsCategory newsCategory = null;
        try {
            Session session = HibernateUtil.getHibernateUtil().getSession();
            transaction = session.beginTransaction();
            newsCategory = (NewsCategory) session.get((Class)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0], id);
            transaction.commit();
            log.info("get clazz:" + newsCategory);
        } catch (HibernateException e) {
            transaction.rollback();
            log.error("Error get "  + " in Dao" + e);
        }
        return newsCategory;
    }
//    private Class getPersistentClass() {
//        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//    }
}
