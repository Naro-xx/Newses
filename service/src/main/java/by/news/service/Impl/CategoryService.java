package by.news.service.Impl;

import by.news.databaceDAO.CategoryDAO;
import by.news.entity.News;
import by.news.entity.NewsCategory;
import by.news.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class CategoryService extends BaseService<NewsCategory> implements ICategoryService{
    @Autowired
    CategoryDAO categoryDAO;

    public List<NewsCategory> getNewsCategories() {
        return categoryDAO.getNewsCategories();
    }

    public List<News> getNews(Serializable id) {
        return categoryDAO.getNews(id);
    }
}
