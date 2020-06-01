package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Customer;

import java.util.Optional;

public interface ICustomerService {


    Optional<Customer> findById(long i);
}
