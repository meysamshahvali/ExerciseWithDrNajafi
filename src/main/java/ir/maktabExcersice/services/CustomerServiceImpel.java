package ir.maktabExcersice.services;

import ir.maktabExcersice.models.Customer;
import ir.maktabExcersice.repositories.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpel implements CustomerService {
    @Autowired
    CustomerRepositoryImpl customerRepository;
    @Override
    public void createCustomer(Customer customer) {
        customerRepository.createCustomer(customer);
    }

    @Override
    public List<Customer> getCustomerList() {
        return customerRepository.getCustomerList();
    }
}
