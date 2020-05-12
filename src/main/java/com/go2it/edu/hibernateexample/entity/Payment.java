package com.go2it.edu.hibernateexample.entity;

import javax.persistence.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

@Entity(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double charge;
    private double total;
    private String goods;
    private java.sql.Date dt;
    @ManyToOne
    @JoinColumn(name = "merchantId")
    private Merchant merchant;

    public Payment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        String txt = "id = " + id + ";   date = ";
        SimpleDateFormat dtFrm = new SimpleDateFormat("dd.MM.yyyy");
        txt += dtFrm.format(dt) + ";   merchant = " + merchant.getName();
        txt += ";   total = " + total + ";    charge = " + charge;
        return txt;
    }

}