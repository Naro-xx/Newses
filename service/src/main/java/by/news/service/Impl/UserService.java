package by.news.service.Impl;

import by.news.databaceDAO.UserDAO;
import by.news.entity.User;
import by.news.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserService extends BaseService<User> implements IUserService{
    @Autowired
    UserDAO userDAO;

    public List<User> getUser() {
        return userDAO.getUser();
    }
}
