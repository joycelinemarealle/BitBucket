package com.example.jdbc.repos;
import com.example.jdbc.entities.Account;
import javax.swing.tree.RowMapper;
import java.util.List;

public interface AccountRepo {
    List<Account> getAllAccounts();
    void saveAccount(Account account);
    void batchInsert(List<Account> accounts);


}
