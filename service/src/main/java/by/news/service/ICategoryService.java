package by.news.service;

import by.news.entity.News;
import by.news.entity.NewsCategory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Narek on 02.04.2015.
 */
public interface ICategoryService extends IService<NewsCategory>{
    public List<NewsCategory> getNewsCategories();
    public List<News> getNews(Serializable id);
}
