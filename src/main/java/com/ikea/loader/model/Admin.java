package com.ikea.loader.model;

public class Admin {

    public String login;

    public String password;

    public String role;

    @Override
    public String toString() {
        return "Admin{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
