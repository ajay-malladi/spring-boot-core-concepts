package com.example.webAppH2Json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

//@Controller // requires a response body
@RestController
public class controller {

    @Autowired
    stdRepo repo;

    @RequestMapping("/")    // these general way of mapping (in parameters we can mention the method type)
    public String home() {

        return "home";
    }

    @PostMapping(path = "/student", consumes = {"application/xml", "application/json"})
    public student add(@RequestBody student std) {  // @RequestBody is used to add the raw data
        //consumes   sever taking from client
        //produce    server send to client
        repo.save(std);  // this saves the object in the db

        return std;
    }

    @DeleteMapping("/student/{sid}")
    public String deleteStd(@PathVariable int sid) {
        student d = repo.getOne(sid);
        repo.delete(d);

        return "deleted";

    }

    @PutMapping(path = "/student", consumes = {"application/json"})   //find diff between put and post
    public student saveOrUpdate(@RequestBody student std) {

        repo.save(std);

        return std;
    }


    @GetMapping(path = "/students", produces = {"application/xml", "application/json"})
    //instead normal mapping we use rest // restricts json(if only mention app/xml)
//    @ResponseBody    not required for the Rest Controller
    public List<student> getStudents() {   //@RP("name")  -- is used to fetch data from client(browser) name parameter is imp

        // here we are returning list , how is converting it into json
        // jackson-core jar file in maven does it for us

        return repo.findAll();
        //return repo.findAll().toString();
        //by default : spring mvc when u return it expect that , you are returning a view name , we to inform it @ResponseBodey
    }


    @GetMapping("student/{sid}")
    public Optional<student> getStudent(@PathVariable("sid") int sid) {  //@pathVariable ??


        return repo.findById(sid);
    }


}

//Service layer:  controller can get the data from db ,network, input from user. so we need to process something
//                that should be done in the service layer.incase the data is from repository service layer interacts with repository

//
//in Rest Api, we have other methods like delete , update  . we use postman(Client)
//

