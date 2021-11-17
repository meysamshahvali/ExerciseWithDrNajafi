package ir.maktabExcersice.services;

import ir.maktabExcersice.models.Customer;

import java.util.List;

public interface CustomerService {
    void createCustomer(Customer customer);
    List<Customer> getCustomerList();
}
