package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerRepository implements ICustomerRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Customer findById(int i) {
        return em.find(Customer.class, i);
    }
}
