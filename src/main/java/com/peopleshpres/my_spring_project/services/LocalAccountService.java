package com.peopleshpres.my_spring_project.services;

import com.peopleshpres.my_spring_project.entities.Account;
import com.peopleshpres.my_spring_project.repos.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocalAccountService implements AccountService {
    private final AccountRepository accountRepository;
    private final Logger logger = LoggerFactory.getLogger(LocalAccountService.class);


    //spring boost know that we are using AccountRepository  for injection
    //injection in constructor recommended

    // @Autowired
    public LocalAccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> retrieveAllAccounts() {
        logger.info("Getting accounts from Account Repository");
        //System.out.println("Getting accounts from Account Repository");
        return this.accountRepository.getAllAccounts();
    }
}
