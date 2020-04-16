package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Merchant;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MerchantRepository implements IMerchantRepository {
    @PersistenceContext
    private EntityManager em;

    public Merchant findById(int id) {
        Merchant m = em.find(Merchant.class, id);
        return m;
    }
}

