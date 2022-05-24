package com.ikea.loader.model;

import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idPayments;

    public long id;
    public String category;

    public String sex;

    public String vintage;

    @OneToOne(cascade = CascadeType.ALL)
    public String lastName;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("idPayments", idPayments);
        json.put("id", id);
        json.put("category", category);
        json.put("sex", sex);
        json.put("vintage", vintage);
        json.put("lastName", lastName);
        return json;
    }
}