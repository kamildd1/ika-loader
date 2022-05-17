package com.ikea.loader.model;

import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;

import java.io.InputStream;
import java.sql.Date;

@Getter
@Setter
public class Player {

    public String firstName;

    public String lastName;

    public Date dateOfBirth;

    public String club;

    public String degree;

    public String sex;

    public InputStream photo;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("firstName", firstName);
        json.put("lastName", lastName);
        //json.put("dateOfBirth", dateOfBirth);
        json.put("club", club);
        json.put("degree", degree);
        json.put("sex", sex);
        //json.put("photo", photo);
        return json;
    }
}
