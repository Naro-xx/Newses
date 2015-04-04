//package by.news.navigation.command;
//
//import by.news.service.Impl.NewsService;
//
//import javax.servlet.http.HttpServletRequest;
//
//import static by.news.constance.Constance.*;
//
///**
// * Created by Narek on 20.02.2015.
// */
//public class LoginCommand implements Command {
//    @Override
//    public String execute(HttpServletRequest request) {
//            NewsService newsService = new NewsService();
//            request.getSession().setAttribute("news", newsService.getNews());
//            return MAIN_PAGE;
//    }
//}