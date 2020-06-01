package com.go2it.edu.hibernateexample;

import com.go2it.edu.hibernateexample.service.IMerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        IMerchantService merchantService = context.getBean(IMerchantService.class);
        merchantService.findById(1).ifPresent(System.out::println);
    }
}

