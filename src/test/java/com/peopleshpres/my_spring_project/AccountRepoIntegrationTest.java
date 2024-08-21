package com.peopleshpres.my_spring_project;

import com.peopleshpres.my_spring_project.entities.Account;
import com.peopleshpres.my_spring_project.repos.JDBCAccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


@JdbcTest
 class AccountRepoIntegrationTest {
 JDBCAccountRepository repo;
 JdbcTemplate template;
 List<Account> accounts;
 Account account1;


 @BeforeEach
 void setUp(){
  repo = new JDBCAccountRepository(template);
  account1 = new Account(5, "Elton", 5678.2);
 }

 @Test
 void getAllAccounts_returnsThreeAccounts(){
 accounts = repo.getAllAccounts();
assertThat(accounts).hasSize(3);

 }

 @Test
 void saveAccountTest(){
  repo.saveAccount(account1);
  assertTrue(repo.getAllAccounts().contains(account1));
 }

// @Test
// void batchInsertTest(){
//  List<Account> newAccount = new ArrayList<>();
//
//  repo.batchInsert();
// }
}
