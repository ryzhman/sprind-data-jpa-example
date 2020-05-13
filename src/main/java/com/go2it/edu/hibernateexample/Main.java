package com.go2it.edu.hibernateexample;

import com.go2it.edu.hibernateexample.entity.Customer;
import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.Payment;
import com.go2it.edu.hibernateexample.entity.dto.Result;
import com.go2it.edu.hibernateexample.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = context.getBean(CustomerService.class);
        Customer customer = customerService.findById(1);

        Merchant newMerchant = new Merchant();
        newMerchant.setAccount("123123");
        newMerchant.setBankName("Cascade save Merchant");
        newMerchant.setCharge(5.00);
        newMerchant.setName("Test merchant 123");
        newMerchant.setSwift("test ");
        newMerchant.setMinSum(100.00);
        newMerchant.setPeriod((short) 5);
//        IMerchantService merchantService = context.getBean(IMerchantService.class);
//        merchantService.save(newMerchant);

        Payment p = new Payment();
        p.setDt(Date.valueOf(LocalDate.now()));
        p.setCustomer(customer);
        p.setMerchant(newMerchant);

        IPaymentService paymentService = context.getBean(IPaymentService.class);
        paymentService.save(p);
    }
}

