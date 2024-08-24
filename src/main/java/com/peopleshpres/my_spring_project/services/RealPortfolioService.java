package com.peopleshpres.my_spring_project.services;

import com.peopleshpres.my_spring_project.entities.Portfolio;
import com.peopleshpres.my_spring_project.repos.JpaPortfolioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RealPortfolioService implements PortfolioService {
    @Autowired
    private JpaPortfolioRepository repo;

    @Override
    public List<Portfolio> getAllPortfolio() {
        return repo.findAll();
    }

    @Override
    public void createPortfolio(Portfolio portfolio) {
         repo.save(portfolio)  ;
    }

    @Override
    public Portfolio getPortfolio(Long id) {
        return repo.getReferenceById(id);
    }
}
