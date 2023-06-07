/**
 * This package includes model for Admin
 */
package com.ika.loader.model;

/**
 * This class contains the Admin model, fields identifying the user
 */
public class Admin {

    public String login;

    public String password;

    public String role;

    /**
     * Method converting data to string
     * @return String values
     */
    @Override
    public String toString() {
        return "Admin{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
