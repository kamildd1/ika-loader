package com.ikea.loader.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import javax.persistence.*;
import java.io.InputStream;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Player {

    public String id;
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String firstName;

    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String lastName;

    public Date dateOfBirth;

    public String club;

    public String degree;

    public String sex;

    public InputStream photo;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("firstName", firstName);
        json.put("lastName", lastName);
        json.put("dateOfBirth", dateOfBirth);
        json.put("club", club);
        json.put("degree", degree);
        json.put("sex", sex);
        //json.put("photo", photo);
        return json;
    }
}
