package com.peopleshpres.my_spring_project.repos;

import com.peopleshpres.my_spring_project.entities.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LocalAccountRepository implements AccountRepository{
    private List<Account> accounts;

    public LocalAccountRepository(){
        this.accounts = new ArrayList<>();
        this.accounts.add(new Account(1, "Jojo", 850.50));
        this.accounts.add(new Account(2, "Juju", 256.78));
        this.accounts.add(new Account(3, "Jeje", 356.78));
    }
    @Override
    public List<Account> getAllAccounts() {
        return accounts;
    }

    @Override
    public Account findAccountById(int id) {
        for (Account account :accounts){
            if (account.getId() == id){
                return account;
            }
        }
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public void batchInsert(List<Account> accounts) {

    }
}
