package com.example.webAppH2Json;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface stdRepo extends JpaRepository<student, Integer> {  // this creates a table in the database
    List<student> findByAge(int age);


    //filter by name sort by age
    @Query("from student s where s.name = ?1 order by s.age")
    //jpql -jpa(similar to sql)
    List<student> findByNameOrderByAge(String name);


}

//repo.save(object);
//repo.findAll();
//repo.getOne(id);
//repo.delete(object);

//it is interface  we are not implementing this interface anywhere spring data Rest is responsible to do
//behind the scenes there are classes to implement them
//all the crud operations can be implemented
// we can also add the methods


//complex qurey: we are going to implement by own here
//protocols: methodname should startby findBy or getBy