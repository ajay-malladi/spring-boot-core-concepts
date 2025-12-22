package com.example.webappPropertiesfile;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping("/home")

    public String home(){
        return "home";
    }
}


//With Jasper:
//Controller → ViewResolver → JSP → HTML → Browser
//
//Without Jasper:
//Controller → JSP file → Browser → Download