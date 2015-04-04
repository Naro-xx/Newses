package by.news.controller;


import by.news.entity.News;
import by.news.service.INewsService;
import by.news.service.IService;
import by.news.service.Impl.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Narek on 02.04.2015.
 */
@Controller
@RequestMapping("/news")
public class NewsController {



    @Autowired
    INewsService baseService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNews(ModelMap modelMap, News news) {
        if (news!=null){
        baseService.add(news);
            modelMap.put("news",news);
        }
        return "user/main";
    }
}
