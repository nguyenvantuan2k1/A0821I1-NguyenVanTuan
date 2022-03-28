package com.codegym.model;

public class Declaration {
    private String name,age,gender,country,idCard,vehicle;

    public Declaration() {
    }

    public Declaration(String name, String age, String gender, String country, String idCard, String vehicle) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.idCard = idCard;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
