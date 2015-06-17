package springdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springdemo.bean.LoginInfo;
import springdemo.entity.LoginUser;
import springdemo.service.LoginService;
import springdemo.utility.EncryptUtil;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String init() {

        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, LoginInfo userInfo, Model model) {

        String email = userInfo.getUserName();
        String password = userInfo.getPassword();
        LoginUser loginInfo = loginService.getLoginUser(email);
        EncryptUtil encrypt = new EncryptUtil();
        
        String codePassword = encrypt.encrypt(password);
        
        if (!codePassword.equals(loginInfo.getPassword())) {
            model.addAttribute("error","密码错误");
            return "login";
        }
        HttpSession session = request.getSession(true);
        // ユーザ情報はセッションに設定する
        session.setAttribute("userInfo", loginInfo);
        return "redirect:/main";
    }

}
