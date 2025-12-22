package com.example.webAppJpaH2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class homeController {

    @Autowired
    peopleRepo repo;

    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(People i) {

        repo.save(i);

        return "index.jsp";
    }

    @RequestMapping("/searchId")
    public ModelAndView searchAge(@RequestParam("id") int i) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("showOut.jsp");

        People m = repo.findById(i).orElse(new People());


        mv.addObject("People", m);

        System.out.println(repo.findByJob("dev"));

        return mv;

    }
}

