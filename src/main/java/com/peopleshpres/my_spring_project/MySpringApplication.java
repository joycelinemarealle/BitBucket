package com.peopleshpres.my_spring_project;
// Package declaration should be here - IntelliJ should make it.

import com.peopleshpres.my_spring_project.services.AccountService;
import com.peopleshpres.my_spring_project.services.PortfolioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.peopleshpres.my_spring_project.services.ExampleService;

@SpringBootApplication
public class MySpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MySpringApplication.class, args);
        ExampleService exampleService = context.getBean(ExampleService.class);
        exampleService.doSomething();
        AccountService accountService = context.getBean(AccountService.class);
        accountService.retrieveAllAccounts();
        PortfolioService portfolioService = context.getBean(PortfolioService.class);
        portfolioService.getAllPortfolio();
    }
}