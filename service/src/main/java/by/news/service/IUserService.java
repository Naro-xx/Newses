package by.news.service;

import by.news.entity.User;

import java.util.List;

/**
 * Created by Narek on 01.04.2015.
 */
public interface IUserService extends IService<User>{
    public List<User> getUser();
}
