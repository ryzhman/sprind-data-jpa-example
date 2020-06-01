package com.go2it.edu.hibernateexample.service;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.dto.Result;
import com.go2it.edu.hibernateexample.repository.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MerchantService implements IMerchantService {
    @Autowired
    private IMerchantRepository merchantRepository;

    @Override
    public Optional<Merchant> findById(long id) {
        return merchantRepository.findById(id);
    }

    @Transactional
    @Override
    public void save(Merchant m) {
        merchantRepository.save(m);
    }

    @Override
    public List<Result> getTotalReport() {
        return merchantRepository.getTotalReport();
    }

    @Override
    public List<Merchant> getSortedByNeedToPay() {
        return merchantRepository.findAllByOrderByNeedToSend();
    }
}