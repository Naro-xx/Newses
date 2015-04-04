package by.news.service;/**
 * Created by Narek on 30.03.2015.
 */

import by.news.NewsesDao;
import by.news.entity.News;
import by.news.entity.NewsCategory;
import by.news.service.Impl.BaseService;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Mains  {
    private static Logger log = Logger.getLogger(NewsesDao.class);
    public static void main(String[] args) throws ParseException {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans-services.xml");
        IService<News> iService=(IService)context.getBean("baseService");

        News testNews =new News();
        java.util.Date dateOfPublic=  new SimpleDateFormat("yyyy-mm-dd").parse("2015-03-03");
        testNews.setDatePublic(dateOfPublic);
        testNews.setText("SomeText");
        testNews.setTitle("Title");
        iService.add(testNews);
//        NewsCategory newsCategory =new NewsCategory();
//        newsCategory.setCategory("Sport");
//        log.info(newsCategory);
//        iService.add(newsCategory);
//        log.info(newsCategory);
//
//        testNews.setNewsCategory(newsCategory);
//        iService.add(testNews);
//        List<News> list=iService.getNews();
//        for(News news:list){
//            log.info(news);
//        }
    }
}
