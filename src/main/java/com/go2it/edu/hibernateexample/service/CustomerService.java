package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Customer;
import com.go2it.edu.hibernateexample.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    public Optional<Customer> findById(long i) {
        return customerRepository.findById(i);
    }
}
