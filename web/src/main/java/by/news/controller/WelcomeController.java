package by.news.controller;

import by.news.service.ICategoryService;
import by.news.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Narek on 03.04.2015.
 */
@Controller
@RequestMapping("/")
public class WelcomeController {
    @Autowired
    INewsService iNewsService;
    @Autowired
    ICategoryService iCategoryService;
    @RequestMapping(value = "/welcome" , method = RequestMethod.GET)
    public String welcome(ModelMap modelMap){
        modelMap.put("news",iNewsService.getNews());
        modelMap.put("category",iCategoryService.getNewsCategories());
        return "welcome";
    }


}
