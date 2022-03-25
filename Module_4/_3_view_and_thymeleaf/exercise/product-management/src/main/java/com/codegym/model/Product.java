package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String manufacturer;



    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Product() {
    }

    public Product(int id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getManufacturer() {
        return manufacturer;
    }
}