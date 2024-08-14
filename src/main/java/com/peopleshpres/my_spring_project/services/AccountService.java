package com.peopleshpres.my_spring_project.services;

import com.peopleshpres.my_spring_project.entities.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    List <Account> retrieveAllAccounts();


    }



