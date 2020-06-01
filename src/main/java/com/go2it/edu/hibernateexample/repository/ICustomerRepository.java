package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}
