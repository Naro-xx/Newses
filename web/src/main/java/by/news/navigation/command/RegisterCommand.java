//package by.news.navigation.command;
//
//import javax.servlet.http.HttpServletRequest;
//
//import by.news.entity.User;
//import by.news.service.Impl.NewsService;
//import by.news.service.Impl.UserService;
//import static by.news.constance.Constance.*;
//
//public class RegisterCommand implements Command {
//
//	public String execute(HttpServletRequest request) {
//		String loginUser = request.getParameter(PARAM_EMAIL);
//		String passwordUser = request.getParameter(PARAM_PASSWORD);
//		UserService userService = new UserService();
//		if (loginUser=="" || passwordUser=="") {
//			request.getSession().setAttribute("errors", "Wrong types");
//			return REGISTER_PAGE;
//
//		} else {
//
//			User user = new User();
//			user.setFirstName(request.getParameter(PARAM_FIRST_NAME));
//			user.setLastName(request.getParameter(PARAM_LAST_NAME));
//			user.setEmail(request.getParameter(PARAM_EMAIL));
//			user.setPassword(request.getParameter(PARAM_PASSWORD));
//			userService.addUser(user);
//			NewsService newsService = new NewsService();
//			request.getSession().setAttribute("user", loginUser);
//			request.getSession().setAttribute("news", newsService.getNews());
//			return MAIN_PAGE;
//
//		}
//
//
//	}
//
//}
//
