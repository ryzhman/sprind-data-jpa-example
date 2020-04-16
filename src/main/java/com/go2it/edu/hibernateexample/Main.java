package com.go2it.edu.hibernateexample;

import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.service.MerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MerchantService merchantService = context.getBean(MerchantService.class);
        Merchant m1 = merchantService.findById(1);
        System.out.println("name = " + m1.getName());
    }
}

