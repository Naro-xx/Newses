//package by.news.navigation.command;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javax.servlet.http.HttpServletRequest;
//
//import static by.news.constance.Constance.PARAM_TITLE;
//import static by.news.constance.Constance.PARAM_DATE;
//import static by.news.constance.Constance.PARAM_TEXT;
//import static by.news.constance.Constance.MAIN_PAGE;
//import by.news.entity.News;
//import by.news.service.Impl.NewsService;
//import org.apache.log4j.Logger;
//
//public class SaveCommand implements Command {
//final static Logger LOGGER= Logger.getLogger(SaveCommand.class);
//	@Override
//	public String execute(HttpServletRequest request) {
//		try {
//			News news = creatNews(request);
//			NewsService newsService = new NewsService();
//			newsService.addNews(news);
//			request.getSession().setAttribute("news", newsService.getNews());
//
//		} catch (ParseException e) {
//			LOGGER.error(e);
//		}
//
//		return MAIN_PAGE;
//	}
//
//	private News creatNews(HttpServletRequest request) throws ParseException {
//		News news = new News();
//		String newsTitle = request.getParameter(PARAM_TITLE);
//		Date datePublic = new SimpleDateFormat("yyyy-MM-dd").parse(request
//				.getParameter(PARAM_DATE));
//		String text = request.getParameter(PARAM_TEXT);
//
//		news.setTitle(newsTitle);
//		news.setDatePublic(datePublic);
//		news.setText(text);
//		return news;
//	}
//
//}
