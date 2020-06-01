package com.go2it.edu.hibernateexample.entity.dto;

public class Result {
    private String name;
    private double sum;
    private long count;

    public Result() {
    }

    public Result(String name, long count, double sum) {
        this.name = name;
        this.sum = sum;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Result{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", count=" + count +
                '}';
    }
}
