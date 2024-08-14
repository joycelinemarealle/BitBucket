package com.peopleshpres.my_spring_project.repos;

import com.peopleshpres.my_spring_project.entities.Account;

import java.util.List;

public interface AccountRepository {
    List<Account> getAllAccounts();
    Account findAccountById(int id);
    void saveAccount(Account account);
    void batchInsert(List<Account> accounts);

}
