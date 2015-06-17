package springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springdemo.dao.LoginDao;
import springdemo.entity.LoginUser;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao mainDao;

    public LoginUser getLoginUser(String userName) {
        return mainDao.selectLoginUser(userName);
    }
}