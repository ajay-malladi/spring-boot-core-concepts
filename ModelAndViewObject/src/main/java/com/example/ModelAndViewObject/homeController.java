package com.example.ModelAndViewObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class homeController {

    @RequestMapping("/home")
    public ModelAndView home(root r){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("obj",r);

        return mv;
    }
}



//Summary :
// the flow to the working : the client  (localhost:8080/home ) this the request sent  to the  sever
// the controller takes the request and by using the requestMapping , after that  the model and view object is created and
// the data from the client is taken by this object and is sent  to jsp file , and there in the jsp file , this object parameters can be
// accessed and response is given ( in between the properties file gives the connection between  the .jsp file and controller (if you did any configuration)
