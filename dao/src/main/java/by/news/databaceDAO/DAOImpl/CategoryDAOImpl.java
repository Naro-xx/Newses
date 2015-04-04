package by.news.databaceDAO.DAOImpl;

import by.news.NewsesDao;
import by.news.databaceDAO.BaseDao;
import by.news.databaceDAO.CategoryDAO;
import by.news.entity.News;
import by.news.entity.NewsCategory;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Narek on 27.03.2015.
 */
@Repository
public class CategoryDAOImpl extends BaseDao<NewsCategory> implements CategoryDAO{
    private static Logger log = Logger.getLogger(NewsesDao.class);

    @Autowired
    public CategoryDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<NewsCategory> getNewsCategories() {

        String hql = "FROM NewsCategory N ORDER BY N.category ASC";
        Query query = getSession().createQuery(hql);
        List<NewsCategory> newsCategories = query.list();
        return newsCategories;
    }

    public List<News> getNews(Serializable id) {
        String hql = "SELECT C.news  FROM NewsCategory C WHERE C.categoryId=:categoryId ORDER BY C.category ASC ";
        Query query = getSession().createQuery(hql);
        query.setParameter("categoryId", id);
        List<News> newses = query.list();
//        for(News news:newses){
////            log.info(news);
//        }
        return newses;
    }
}
