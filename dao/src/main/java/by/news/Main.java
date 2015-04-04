package by.news;/**
 * Created by Narek on 26.03.2015.
 */

import by.news.databaceDAO.BaseDao;
import by.news.databaceDAO.DAOImpl.CategoryDAOImpl;
import by.news.databaceDAO.DAOImpl.NewsDAOImpl;
import by.news.databaceDAO.DAOImpl.UserDAOImpl;
import by.news.databaceDAO.util.HibernateUtil;
import by.news.entity.News;
import by.news.entity.NewsCategory;
import by.news.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.jws.soap.SOAPBinding;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static Logger log = Logger.getLogger(NewsesDao.class);
    public static void main(String[] args) throws ParseException {
        Transaction transaction;
//        Session session=HibernateUtil.getHibernateUtil().getSession();
//        NewsCategory newsCategory=null;
//
//        newsCategory= CategoryDAOImpl.getCategoryDAO().get(1);
//        log.info(newsCategory);
//        newsCategory.getNews();
//        log.info(newsCategory);
//        List<News> newses=CategoryDAOImpl.getCategoryDAO().getNews(1);
//        log.info(newses);
//        NewsesDao.getNewsDao().saveCategory(newsCategory);
//        News testNews =new News();
//        java.util.Date dateOfPublic=  new SimpleDateFormat("yyyy-mm-dd").parse("2015-03-03");
//        testNews.setDatePublic(dateOfPublic);
//        testNews.setText("SomeText");
//        testNews.setTitle("Title");
//        testNews.setNewsCategory(newsCategory);
//        log.info(testNews);
//        NewsesDao.getNewsDao().saveNews(testNews);
//        List<NewsCategory> newsCategories=CategoryDAOImpl.getCategoryDAO().getNewsCategories();
//        log.info(newsCategories);
//        String[] ids={"1"};
//
//        List ides= Arrays.asList(ids);
//        NewsDAOImpll.getNewsDAOImpll().deleteNews(ides);
//        User user=new User();
//        user.setPassword("admin123");
//        user.setEmail("nar-x@mail.ru");
//        user.setLastName("Admin");
//        user.setFirstName("Admin");
//        transaction=session.beginTransaction();
//        UserDAOImpll.getUserDAOImpll().saveOrUpdate(user);
//        transaction.commit();
//        HibernateUtil.getHibernateUtil().closeSession(session);
        NewsDAOImpl newsDAO;
    }
}
