package by.news.databaceDAO.DAOImpl;

import by.news.constance.DaoMark;
import by.news.databaceDAO.BaseDao;
import by.news.databaceDAO.UserDAO;
import by.news.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("userDAOImpl")
public class UserDAOImpl extends BaseDao<User> implements UserDAO{

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<User> getUser() {
        String hql = "FROM User U ORDER BY U.id ASC";
        Query query = getSession().createQuery(hql);
        List<User> users = query.list();
        return users;
    }
}
