package com.go2it.edu.hibernateexample;

import com.go2it.edu.hibernateexample.entity.Customer;
import com.go2it.edu.hibernateexample.entity.Merchant;
import com.go2it.edu.hibernateexample.entity.Payment;
import com.go2it.edu.hibernateexample.entity.dto.Result;
import com.go2it.edu.hibernateexample.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = context.getBean(CustomerService.class);
//        Customer customer = customerService.findById(1);
//        if (customer != null) {
//            System.out.println(customer.toString());
//            Collection<Merchant> merchants = customer.getMerchants();
//            for (Merchant m : merchants) {
//                System.out.println(m.getName());
//            }
//        }

        Customer customer = new Customer();
        customer.setName("Save test");
        customer.setAddress("address test");
        customer.seteMail("test@user.com");

        Merchant newMerchant = new Merchant();
        newMerchant.setAccount("123123");
        newMerchant.setBankName("Me1");
        newMerchant.setCharge(5.00);

        Payment payment = new Payment();
        payment.setMerchant(newMerchant);
        IPaymentService paymentService = context.getBean(IPaymentService.class);
        paymentService.
    }
}

