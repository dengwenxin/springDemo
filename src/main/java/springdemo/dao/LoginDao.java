package springdemo.dao;

import springdemo.entity.LoginUser;

public interface LoginDao {

    public LoginUser selectLoginUser(String userName);
}
