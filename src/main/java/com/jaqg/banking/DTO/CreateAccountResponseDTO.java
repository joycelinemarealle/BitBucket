package com.jaqg.banking.DTO;

import com.jaqg.banking.entities.Transaction;

import java.util.List;

public record CreateAccountResponseDTO(
        Long number,
        Integer sortCode,
        String name,
        double openingBalance,
        List<Transaction> transactions,
        Double balance,
        Long customerId) {

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }
}
