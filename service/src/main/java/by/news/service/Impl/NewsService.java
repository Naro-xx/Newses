package by.news.service.Impl;

import by.news.databaceDAO.NewsDAO;
import by.news.entity.News;
import by.news.service.INewsService;
import by.news.service.Impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Narek on 30.03.2015.
 */

@Service
@Transactional
public class NewsService extends BaseService<News>  implements INewsService {

    @Autowired
    NewsDAO newsDAO;

    public List<News> getNews(){
        return newsDAO.getNews();
    }

    @Override
    public void deleteNews(List<String> ids) {

    }


}
