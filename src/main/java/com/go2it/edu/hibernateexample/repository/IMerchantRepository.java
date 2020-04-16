package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Merchant;

public interface IMerchantRepository {
    public Merchant findById(int id);
}

