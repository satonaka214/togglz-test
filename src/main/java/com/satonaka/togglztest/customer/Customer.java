package com.satonaka.togglztest.customer;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Customer {
    private final String id;
    private final String name;
}
