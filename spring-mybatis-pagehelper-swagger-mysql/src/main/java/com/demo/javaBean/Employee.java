package com.demo.javaBean;

public class Employee {
    private int id;
    private String lastName;
    private String email;
    private int gender;
    private int dId;

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getGender() {
        return gender;
    }

    public int getdId() {
        return dId;
    }
}
