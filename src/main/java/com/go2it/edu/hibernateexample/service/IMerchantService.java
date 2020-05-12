package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.dto.Result;

import java.util.List;

public interface IMerchantService {
    public Merchant findById(int id);

    List<Result> getTotalReport();

    List<Merchant> getSortedByNeedToPay();
}
