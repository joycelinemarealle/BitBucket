package com.peopleshpres.my_spring_project.controllers;


import com.peopleshpres.my_spring_project.entities.Account;
import com.peopleshpres.my_spring_project.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@CrossOrigin
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    List<Account> getAllAccounts(){
        return accountService.retrieveAllAccounts();
    }


    @PostMapping
    public void statusResponse(Account account){
        accountService.retrieveAllAccounts().add(account);

    }

}
