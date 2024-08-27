package com.peopleshpres.my_spring_project.repos;

import com.peopleshpres.my_spring_project.entities.Account;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("qa")
public class LocalAccountRepository implements AccountRepository{
    private List<Account> accounts;
    private Account account;
    private JdbcTemplate template;

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
        for (Account account: accounts){
            if(account.getId() == id){
                return account;
            }
        }
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public void batchInsert(List<Account> accounts) {
        String sql = "INSERT INTO ACCOUNT (name, balance) VALUES (?,?)";
       template.batchUpdate(sql,accounts,50,
                (PreparedStatement ps, Account account) ->{
                    ps.setString(1,account.getName());
                    ps.setDouble(2,account.getBalance());
                }
        );
    }
}
