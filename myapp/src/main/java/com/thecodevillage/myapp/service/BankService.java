package com.thecodevillage.myapp.service;

import com.thecodevillage.myapp.models.Customer;

import java.util.List;

public interface BankService {
    static List<Customer> getCustomers() {
        return null;
    }

    List<Customer> getCustomers();

    Customer getCustomerByidNumber(String idNumber);

    static Customer saveCustomer(Customer customer);
}