package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Payment;

import java.util.Optional;

public interface IPaymentService {
    Optional<Payment> findById(long id);

    void save(Payment p);
}
