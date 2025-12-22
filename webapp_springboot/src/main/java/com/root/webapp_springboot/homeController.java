package com.root.webapp_springboot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("i am working , reset the tomcat");
        return "home.jsp";

    }
}
