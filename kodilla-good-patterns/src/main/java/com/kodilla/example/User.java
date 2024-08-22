package com.kodilla.example;

public class User {
    private String lastName;
    private String name;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }
}