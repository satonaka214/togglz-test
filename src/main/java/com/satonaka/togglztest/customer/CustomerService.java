package com.satonaka.togglztest.customer;

import com.satonaka.togglztest.myfeatures.MyFeatures;
import com.satonaka.togglztest.myfeatures.MyFeaturesManager;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final MyFeaturesManager manager;

    List<Customer> getCustomers() {
        val customerList = new ArrayList<Customer>();
        customerList.add(new Customer("1", "Alice"));
        customerList.add(new Customer("2", "Bob"));
        customerList.add(new Customer("3", "Charlie"));

        if (manager.getManager().isActive(MyFeatures.FEATURE_ONE)) {
            customerList.add(new Customer("4", "FEATURE_ONE"));
        }

        if (manager.getManager().isActive(MyFeatures.FEATURE_TWO)) {
            customerList.add(new Customer("5", "FEATURE_TWO"));
        }

        return customerList;
    }
}
