package com.peopleshpres.my_spring_project.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class ExampleServiceQa implements ExampleService{
    @Override
    public void doSomething() {
        System.out.println("Doing QA stuff ...");

    }

}
