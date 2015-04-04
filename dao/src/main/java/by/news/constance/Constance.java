package by.news.constance;

public class Constance {
	public static final String SQL_QUERY_DELETE_USER = "DELETE FROM users WHERE email=?";
	public static final String SQL_QUERY_CHECK_USER = "SELECT * FROM users WHERE email = ? AND password = ?";
	public static final String SQL_QUERY_ADD_USER = "INSERT INTO users (email,first_name,last_name,password) VALUES (?,?,?,?)";
	public static final String SQL_QUERY_DELETE_NEWS = "DELETE FROM news WHERE title=?";
	public static final String SQL_QUERY_ADD_NEWS = "INSERT INTO news (title,date,text) VALUES (?,?,?)";
	public static final String SQL_QUERY_GET_NEWS = "SELECT * FROM news";
	public static final String SQL_QUERY_GET_NEWS_TITLE = "SELECT * FROM news WHERE title = ?";

	public static final String PARAM_FIRST_NAME = "firstName";
	public static final String PARAM_LAST_NAME = "lastName";
	public static final String PARAM_EMAIL = "email";
	public static final String PARAM_PASSWORD = "password";

	public static final String PARAM_TITLE = "title";
	public static final String PARAM_DATE = "datePublic";
	public static final String PARAM_TEXT = "text";

	public static final String MAIN_PAGE = "/pages/mainPage.jsp";
	public static final String ADD_NEWS_PAGE = "/pages/addnews.jsp";
	public static final String REGISTER_PAGE ="/pages/registration.jsp";
}
