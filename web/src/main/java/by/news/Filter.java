//package by.news;
//
//import by.news.service.Impl.UserService;
//import org.apache.log4j.Logger;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import static by.news.constance.Constance.*;
//import static by.news.constance.Constance.REGISTER_PAGE;
//
///**
// * Created by Narek on 21.02.2015.
// */
//@WebFilter(filterName = "Filter")
//public class Filter implements javax.servlet.Filter {
//
//    public void destroy() {
//    }
//
//    private static final Logger LOGGER = Logger.getLogger(Filter.class);
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        String loginUser;
//        String passwordUser;
//        UserService userService;
//        HttpSession session = ((HttpServletRequest) req).getSession();
//        String action = ((HttpServletRequest) req).getParameter("page");
//        if (action.equals("Login")) {
//            userService = new UserService();
//            loginUser = req.getParameter(PARAM_EMAIL);
//            passwordUser = req.getParameter(PARAM_PASSWORD);
//            if (userService.checkUser(loginUser, passwordUser)) {
//                session.setAttribute("user", loginUser);
//            } else {
//                RequestDispatcher dispatcher = req.getRequestDispatcher(LOGIN_PAGE);
//                try {
//                    dispatcher.forward(req, resp);
//                    session.setAttribute("error", "Wrong username or password");
//                } catch (FileNotFoundException e) {
//                    LOGGER.error("Filter Not Found exception", e);
//                }
//            }
//
//        } else if (action.equals("Register")) {
//            loginUser = req.getParameter(PARAM_EMAIL);
//            passwordUser = req.getParameter(PARAM_PASSWORD);
//            if ( "".equals(loginUser) || passwordUser == "") {
//                session.setAttribute("errors", "Wrong types");
//                RequestDispatcher dispatcher = req.getRequestDispatcher(REGISTER_PAGE);
//                try {
//                    dispatcher.forward(req, resp);
//                    session.setAttribute("error", "Wrong username or password");
//                } catch (FileNotFoundException e) {
//                    LOGGER.error("Filter Not Found exception", e);
//                }
//            }
//        }
//        chain.doFilter(req, resp);
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//
//    }
//
//}
