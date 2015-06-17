package springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired

    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String init() {
        return "main";
    }
    
}
