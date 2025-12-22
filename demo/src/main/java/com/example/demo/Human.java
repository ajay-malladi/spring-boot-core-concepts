package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Human {
    public Human() {
        System.out.println("Human born(created)");
    }

    private String eye;
    private String ear;

    @Autowired            // it searches by type
    @Qualifier("heart")   // basically this searches bean by name
    private Heart heart;

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public String getEar() {
        return ear;
    }

    public void setEar(String ear) {
        this.ear = ear;
    }

    public void label() {
        System.out.println("i am Human 👱👱👱👱");
        heart.beat();
    }


}
