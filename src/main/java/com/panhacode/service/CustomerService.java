package com.panhacode.service;

import com.panhacode.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    Optional<Customer> findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer updateCustomer(Long id, Customer customerDetails);
}
