package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Payment;

public interface IPaymentRepository {
     Payment findById(int id);

}
