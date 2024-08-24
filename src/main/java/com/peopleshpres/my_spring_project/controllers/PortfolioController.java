package com.peopleshpres.my_spring_project.controllers;

import com.peopleshpres.my_spring_project.entities.Portfolio;
import com.peopleshpres.my_spring_project.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolios")
@CrossOrigin

public class PortfolioController {
    @Autowired
    PortfolioService portfolioService;

    @GetMapping
    List<Portfolio> getAllAccount(){
        return portfolioService.getAllPortfolio();
    }

    @PostMapping
    public void postPortfolio(Portfolio portfolio){
        portfolioService.createPortfolio(portfolio);
    }
}
