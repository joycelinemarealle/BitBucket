package com.peopleshpres.my_spring_project.repos;

import com.peopleshpres.my_spring_project.entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaPortfolioRepository extends JpaRepository<Portfolio, Long> {
    List<Portfolio> findAllPortfolioByName(String name);

}
