package com.codegym.validateregister.model;


import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "email") })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Size(min=5, max=45,message = "tên không hợp lệ")
    private String firstName;
    @NotBlank
    @Size(min=5, max=45,message = "tên không hợp lệ")
    private String lastName;
    @Pattern(regexp = "^[0-9]{9}$",message = "số điện thoại không hợp lệ")
    private String phoneNumber;
    @Min(value = 18,message = "tuổi phải trên 18")
    private int Age;
    @Email(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message = "định dạng mail không đúng")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String firstName, String lastName, String phoneNumber, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        Age = age;
        this.email = email;
    }

    public User() {
    }


}
