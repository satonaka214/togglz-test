package com.satonaka.togglztest.customer;

import lombok.val;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    List<Customer> getCustomers() {
        val customerList = new ArrayList<Customer>();
        customerList.add(new Customer("1", "Alice"));
        customerList.add(new Customer("2", "Bob"));
        customerList.add(new Customer("3", "Charlie"));

        return customerList;
    }
}
