package com.root.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="students",path="students")
public interface studentRepo extends JpaRepository<student,Integer> {


}


// SpringDataRest it doesn't need controller
// need to use , an Annotation @RepositoryRestResource(collectionResourceRel="",path="")
