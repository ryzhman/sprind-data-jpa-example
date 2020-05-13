package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.dto.Result;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MerchantRepository implements IMerchantRepository {
    @PersistenceContext
    private EntityManager em;

    public Merchant findById(int id) {
        Merchant m = em.find(Merchant.class, id);
        return m;
    }

    @Override
    public List<Result> getTotalReport(){
        String txt = "SELECT new com.go2it.edu.hibernateexample.entity.dto.Result (p.merchant.name, SUM(p.merchant.charge), count(p))";
        txt += "FROM payment p GROUP BY p.merchant.name";
        TypedQuery<Result> query = em.createQuery(txt, Result.class);
        return query.getResultList();
    }

    @Override
    public List<Merchant> getSortedByNeedToPay() {
        String txt = "SELECT m FROM merchant m ORDER BY m.needToSend";
        TypedQuery<Merchant> query = em.createQuery(txt, Merchant.class);
        return query.getResultList();
    }

    @Override
    public void save(Merchant m) {
        em.persist(m);
    }
}

