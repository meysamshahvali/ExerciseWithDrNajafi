package ir.maktabExcersice.repositories;

import ir.maktabExcersice.models.Customer;

import java.util.List;

public interface CustomerRepository {
    void createCustomer(Customer customer);
    List<Customer> getCustomerList();
}
