package com.jaqg.banking.dto;

import java.util.List;

public record CustomerGetRequest(Long id, String fullName, List<Long> accounts) {
}


