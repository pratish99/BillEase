package com.billease.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Making invoice as an entity for database with the help of hibernate
public class Invoice {
    @Id //setting id as a primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // For automatic generation of id
    private long id;
    private String vendor;
    private String product;
    private int amount;
    private String date;
    private String action;

    public Invoice() {}

    public Invoice(String vendor, String product, int amount, String date, String action) {
        this.id = 2;
        this.vendor = vendor;
        this.product = product;
        this.amount = amount;
        this.date = date;
        this.action = action;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
