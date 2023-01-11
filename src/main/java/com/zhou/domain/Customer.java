package com.zhou.domain;

/**
 * @author zhous
 * @version 1.0
 * @date 2021/6/2 15:27
 */
public class Customer {
    private int id;
    private String name;

    public Customer(int i, String n){
        this.id=i;
        this.name=n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
