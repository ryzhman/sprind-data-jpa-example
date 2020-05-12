package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Customer;

public interface ICustomerRepository {
    Customer findById(int i);
}
