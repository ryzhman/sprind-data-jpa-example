package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PaymentRepository implements IPaymentRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Payment findById(int id) {
        return em.find(Payment.class, id);
    }
}
