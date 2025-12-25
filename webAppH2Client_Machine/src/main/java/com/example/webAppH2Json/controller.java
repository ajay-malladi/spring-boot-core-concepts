package com.example.webAppH2Json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

    @Autowired
    stdRepo repo;

    @RequestMapping("/")
    public String home() {

        return "home";
    }

    @RequestMapping("/add")
    public String add(student std) {
        repo.save(std);  // this saves the object in the db

        return "home";
    }

    @RequestMapping("/search")
    public ModelAndView search(@RequestParam("sid") int i) {   //@RP("name")  -- is used to fetch data from client(browser) name parameter is imp
        ModelAndView mv = new ModelAndView();
        mv.setViewName("show");    // alway view is name (follow this )
        // you need add think dude!!
        student st = repo.findById(i).orElse(new student());

        mv.addObject("student", st);  //  “Put this Java object (st) into the model,
        //                                              and expose it to the JSP using the name student.”
        //System.out.println(repo.findByAge(22));
        System.out.println(repo.findByNameOrderByAge("Raj"));


        return mv;
    }


}

//Service layer:  controller can get the data from db ,network, input from user. so we need to process something
//                that should be done in the service layer.incase the data is from repository service layer interacts with repository
//

