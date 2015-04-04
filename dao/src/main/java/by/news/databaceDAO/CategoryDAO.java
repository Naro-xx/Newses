package by.news.databaceDAO;

import by.news.entity.News;
import by.news.entity.NewsCategory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Narek on 01.04.2015.
 */
public interface CategoryDAO {
    public List<NewsCategory> getNewsCategories();
    public List<News> getNews(Serializable id);
}
