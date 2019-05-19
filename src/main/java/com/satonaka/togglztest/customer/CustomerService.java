package com.satonaka.togglztest.customer;

import com.satonaka.togglztest.myfeatures.MyFeatures;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final FeatureManager manager;

    List<Customer> getCustomers() {
        val customerList = new ArrayList<Customer>();
        customerList.add(new Customer("1", "Alice"));
        customerList.add(new Customer("2", "Bob"));
        customerList.add(new Customer("3", "Charlie"));

        if (manager.isActive(MyFeatures.REVERSE)) {
            Collections.reverse(customerList);
        }

        if (manager.isActive(MyFeatures.SHUFFLE)) {
            Collections.shuffle(customerList);
        }

        return customerList;
    }
}
