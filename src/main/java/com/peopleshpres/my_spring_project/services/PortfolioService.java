package com.peopleshpres.my_spring_project.services;

import com.peopleshpres.my_spring_project.entities.Portfolio;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PortfolioService {
    //List<Portfolio> findAllPortfolioByName(String name);
    //Portfolio findPortfolioByName (String name);

    List<Portfolio> getAllPortfolio();
    void createPortfolio(Portfolio portfolio);
    Portfolio getPortfolio(Long id);
}
