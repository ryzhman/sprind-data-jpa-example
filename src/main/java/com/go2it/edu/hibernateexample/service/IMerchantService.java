package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.dto.Result;

import java.util.List;
import java.util.Optional;

public interface IMerchantService {
    Optional<Merchant> findById(long id);

    void save(Merchant m);

    List<Result> getTotalReport();

    List<Merchant> getSortedByNeedToPay();
}
