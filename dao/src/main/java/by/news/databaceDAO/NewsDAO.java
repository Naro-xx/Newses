package by.news.databaceDAO;

import by.news.entity.News;

import javax.annotation.Resources;
import java.util.List;

/**
 * Created by Narek on 01.04.2015.
 */
public interface NewsDAO extends Dao<News> {
    public List<News> getNews();
    public void deleteNews(List<String> ids);
}
