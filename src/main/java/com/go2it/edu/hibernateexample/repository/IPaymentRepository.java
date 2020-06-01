package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface IPaymentRepository extends CrudRepository<Payment, Long> {
}
