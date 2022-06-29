package com.ikea.loader.model;

import net.minidev.json.JSONObject;

public class User {

    public String login;

    public String password;

    public String role;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("login", login);
        json.put("password", password);
        json.put("role", role);
        return json;
    }


}
