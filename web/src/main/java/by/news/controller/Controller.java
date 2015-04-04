//package by.news.controller;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import by.news.navigation.command.Command;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//
//
//public class Controller extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private static final Logger LOGGER = Logger.getLogger(Controller.class);
//	/**
//	 * @see HttpServlet#HttpServlet()
//	 */
//	public Controller() {
//
//	}
//	public void init(ServletConfig config) throws ServletException {
//		super.init(config);
//
//		String log4jLoc = config.getInitParameter("log4jLoc");
//		String path = getServletContext().getRealPath(log4jLoc);
//		PropertyConfigurator.configure(path);
//	}
//
//	protected void doGet(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		performAction(request, response);
//
//	}
//
//	protected void doPost(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		performAction(request, response);
//
//	}
//
//	private void performAction(HttpServletRequest request,
//			HttpServletResponse response) throws IOException, ServletException {
//		LOGGER.info("start");
//		String page ;
//		CommandsFactory client = new CommandsFactory();
//		Command command = client.defineCommand(request);
//
//		page = command.execute(request);
//		if (page != null) {
//
//			RequestDispatcher requestDispatcher = request
//					.getRequestDispatcher(page);
//			requestDispatcher.forward(request, response);
//
//
//	}
//}
//
//}
