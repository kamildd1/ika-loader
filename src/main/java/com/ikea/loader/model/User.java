package com.ikea.loader.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@Entity
@Table(name = "users")
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
