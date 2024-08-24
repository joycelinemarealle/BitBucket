package com.peopleshpres.my_spring_project;

import com.peopleshpres.my_spring_project.entities.Portfolio;
import com.peopleshpres.my_spring_project.repos.JpaPortfolioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class PortfolioTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private JpaPortfolioRepository repo;

    @BeforeEach
    void beforeEach(){
        Portfolio portfolio = new Portfolio("Joyceline");
        entityManager.persistAndFlush(portfolio);
    }

    @Test
    void findAllPortfoliosByName_returnsCorrectly(){
        List<Portfolio> pList = repo.findAllPortfoliosByName("Joyceline");
        assertThat(pList).allMatch(p-> "Joyceline".equals(p.getName()));
    }
}
