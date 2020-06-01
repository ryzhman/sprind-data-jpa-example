package com.go2it.edu.hibernateexample.repository;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.dto.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IMerchantRepository extends JpaRepository<Merchant, Long> {
    List<Merchant> findAllByOrderByNeedToSend();

    @Query("SELECT " +
            "new com.go2it.edu.hibernateexample.entity.dto.Result (p.merchant.name, count(p), SUM(p.charge)) " +
            "FROM " +
            "payment p " +
            "GROUP BY " +
            "p.merchant.name")
    List<Result> getTotalReport();

}

