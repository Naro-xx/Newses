package by.news.service;

import by.news.entity.News;

import java.util.List;

/**
 * Created by Narek on 01.04.2015.
 */
public interface INewsService extends IService<News>{
    public List<News> getNews();
    public void deleteNews(List<String> ids);
}
