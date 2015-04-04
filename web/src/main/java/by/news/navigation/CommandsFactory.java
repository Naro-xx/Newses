//package by.news.navigation;
//
//import by.news.navigation.command.Command;
//import by.news.navigation.command.EmptyCommand;
//import javax.servlet.http.HttpServletRequest;
//import org.apache.log4j.Logger;
//public class CommandsFactory {
//	private static final String PARAM_PAGE = "page";
//	private static final Logger LOGGER = Logger.getLogger(CommandsFactory.class);
//
//	public Command defineCommand (HttpServletRequest request) {
//		String action = request.getParameter(PARAM_PAGE);
//		Command current=new EmptyCommand();
//		if (action == null || action.isEmpty()) {
//			return current;
//		}
//		try {
//			CommandsType currentEnum = CommandsType.valueOf(action.toUpperCase());
//			current = currentEnum.getCommand();
//		} catch (IllegalArgumentException e) {
//			LOGGER.error(e);
//		}
//		return current;
//	}
//}
