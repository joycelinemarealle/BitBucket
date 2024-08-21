package com.peopleshpres.my_spring_project.repos;

import com.peopleshpres.my_spring_project.entities.Account;

import javax.swing.tree.RowMapper;

@Repository
@Profile("h2")

public class JDBCAccountRepo implements AccountRepository {
    private JdbcTemplate template;

    public class JDBCAccountRepo(JdbcTemplate template){

    }

    private RowMapper<Account> getAccountRowMapper(){
        return (resultSet, rowNum) -> {
            Integer id = resultSet.getInteger("id");
            String name = resultSet.getString("name");
            Double balance = resultSet.getBalance("balance");
            return new Account(id,name,balance);
        };
    }
}
