package com.example.webAppJpaH2;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface peopleRepo extends CrudRepository<People,Integer> {

    List<People> findByJob(String job);
    List<People> findByIdGreaterThan(int id);





}
