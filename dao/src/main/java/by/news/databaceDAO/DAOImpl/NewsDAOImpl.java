package by.news.databaceDAO.DAOImpl;

import by.news.constance.DaoMark;
import by.news.databaceDAO.BaseDao;
import by.news.databaceDAO.NewsDAO;
import by.news.databaceDAO.util.HibernateUtil;
import by.news.entity.News;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Narek on 25.03.2015.
 */
@Repository
public  class  NewsDAOImpl extends BaseDao<News> implements NewsDAO{
    @Autowired
    public NewsDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<News> getNews() {
        String hql = "FROM News N ORDER BY N.dateOfPublic ASC";
        return getSession().createQuery(hql).list();
    }

    public void deleteNews(List<String> ids) {
        Iterator<String> iterator = ids.iterator();
        String ide;
        Query query;
        while (iterator.hasNext()) {
            ide = iterator.next();
            int id = Integer.parseInt(ide);
            String hql = "DELETE FROM News WHERE id=:id";
            query = getSession().createQuery(hql);
            query.setParameter("id", id);
            query.executeUpdate();
        }
    }

}
