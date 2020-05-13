package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.dto.Result;

import java.util.List;

public interface IMerchantRepository {
    public Merchant findById(int id);

    List<Result> getTotalReport();

    List<Merchant> getSortedByNeedToPay();

    void save(Merchant m);
}

