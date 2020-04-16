package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantService implements IMerchantService {
    @Autowired
    private MerchantRepository merchantRepository;

    public Merchant findById(int id) {
        return merchantRepository.findById(id);
    }
}

