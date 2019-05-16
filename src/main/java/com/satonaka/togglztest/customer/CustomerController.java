package com.satonaka.togglztest.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;

    @GetMapping("customers")
    public String getCustomers(Model model) {
        model.addAttribute("customerList", service.getCustomers());

        return "customer-list";
    }
}
