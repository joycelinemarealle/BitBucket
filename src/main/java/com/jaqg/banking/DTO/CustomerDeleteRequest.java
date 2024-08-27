package com.jaqg.banking.DTO;

import com.jaqg.banking.entities.Account;

import java.util.List;

public record CustomerDeleteRequest(Long ID, String name, List<Account> accounts) {};

