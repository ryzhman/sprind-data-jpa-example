package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Payment;

public interface IPaymentService {
    public Payment findById(int id);
}
