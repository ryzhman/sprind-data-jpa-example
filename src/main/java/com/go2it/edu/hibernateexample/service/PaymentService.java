package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Payment;
import com.go2it.edu.hibernateexample.repository.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService implements IPaymentService {
    @Autowired
    private IPaymentRepository repository;

    @Override
    public Optional<Payment> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Payment p) {
        repository.save(p);
    }
}
