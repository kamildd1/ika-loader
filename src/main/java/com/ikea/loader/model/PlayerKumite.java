package com.ikea.loader.model;

import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;

import java.io.InputStream;
import java.sql.Date;

@Getter
@Setter
public class PlayerKumite {

    public String firstName;

    public String lastName;

    public String club;

    public String degree;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("firstName", firstName);
        json.put("lastName", lastName);
        json.put("club", club);
        json.put("degree", degree);
        return json;
    }
}
