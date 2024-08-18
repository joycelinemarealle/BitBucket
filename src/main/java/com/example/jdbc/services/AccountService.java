package com.example.jdbc.services;

import com.example.jdbc.entities.Account;
import com.example.jdbc.repos.AccountRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class AccountService {
    private final AccountRepo accountRepo;

    public AccountService (AccountRepo accountRepo){
        this.accountRepo = accountRepo;
    }

    public List<Account> retrieveAllaccounts(){
        return accountRepo.getAllAccounts();
    }

    public void performBatchInsert(List<Account> accounts){
        accountRepo.batchInsert(accounts);
    }
}
