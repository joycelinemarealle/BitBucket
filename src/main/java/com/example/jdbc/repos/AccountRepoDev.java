package com.example.jdbc.repos;

import com.example.jdbc.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
@Profile("dev")
public class AccountRepoDev implements AccountRepo{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private List<Account> accounts ;

    @Override
    public List<Account> getAllAccounts() {
       String sql = "SELECT * fROM Account";
       return jdbcTemplate.query(sql.getAccountRowMapper);

    }

    @Override
    public void saveAccount(Account account) {
        String sql = "INSERT INTO ACCOUNT(name, balance) VALUES (?,?)";
        jdbcTemplate.update(sql,account.getName(), account.getBalance());
    }

    @Override
    public void batchInsert(List<Account> accounts) {
        String sql = "INSERT INTO ACCOUNT (name, balance) VALUES (?,?)";
        jdbcTemplate.batchUpdate(sql,accounts, 50,
                (PreparedStatement ps, Account account) ->{
            ps.setString(1,account.getName());
            ps.setDouble(2,account.getBalance());
                });
    }

    private RowMapper<Account> getAccountRowMapper(){
        return (resultSet, rowNum) -> {
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            Double balance = resultSet.getDouble("balance");
            return new Account (id, name, balance);
        };
    }
}
