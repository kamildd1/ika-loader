package com.ikea.loader.model;

import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;

@Getter
@Setter
public class Competition {

    public String category;

    public String sex;

    public String vintage;

    public String lastName;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("category", category);
        json.put("sex", sex);
        json.put("vintage", vintage);
        json.put("lastName", lastName);
        return json;
    }
}
