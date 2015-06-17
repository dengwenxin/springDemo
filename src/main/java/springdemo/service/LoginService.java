package springdemo.service;

import springdemo.entity.LoginUser;

public interface LoginService {

   public LoginUser getLoginUser(String userName);

}