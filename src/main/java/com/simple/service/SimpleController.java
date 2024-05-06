package com.simple.service;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@RestController
public class SimpleController {
    List<SimpleCustomer> customerlist = new ArrayList<SimpleCustomer>();
    @Value("${customer.info.office}")
    private String customerOffice;

    @Value("${customer.info.team}")
    private String customerTeam;

    @Value("${customer.info.contact.api}")
    private String customerApi;



    @RequestMapping(path="/customer", params={"customerId"})
    public SimpleCustomer getCustomerById(@RequestParam String customerId, HttpServletRequest request) {

        Predicate<SimpleCustomer> p = c-> c.getCustomerId().equals(customerId);
        SimpleCustomer customer = customerlist.stream().filter(p).findFirst().get();
        System.out.println("customer details retrieved");
        return customer;
    }

    @RequestMapping(path="/customer", params={"customerPhone"})
    public SimpleCustomer getCustomerByPhone(@RequestParam String customerPhone) {

        Predicate<SimpleCustomer> p = c-> c.getCustomerPhone().equals(customerPhone);
        SimpleCustomer customer = customerlist.stream().filter(p).findFirst().get();
        System.out.println("customer details retrieved");
        return customer;
    }

    @PostConstruct
    public void init() {
        SimpleCustomer fc1 = new SimpleCustomer("100", "Richard Seroter",
                "555-123-4567", new BigDecimal("19.50"),
                new CustomerServiceInfo(customerOffice,customerTeam,customerApi)
        );
        SimpleCustomer fc2 = new SimpleCustomer("101","Jason Salmond", "555-321-7654",
                new BigDecimal("11.25"),
                new CustomerServiceInfo(customerOffice,customerTeam,customerApi)
        );
        SimpleCustomer fc3 = new SimpleCustomer("102", "Lisa Szpunar", "555-987-6543",
                new BigDecimal("35.00"),
                new CustomerServiceInfo(customerOffice,customerTeam,customerApi)
        );
        customerlist.add(fc1);
        customerlist.add(fc2);
        customerlist.add(fc3);
    }

}
