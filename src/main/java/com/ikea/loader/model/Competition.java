/**
 * This package includes model for Competition
 */
package com.ikea.loader.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * This class contains the Competition model, fields identifying the Competition
 */
@Getter
@Setter
@Builder
@Entity
@Table(name = "competition")
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public BigInteger idPayments;
    public Long id;
    public String category;
    public String sex;
    public String vintage;

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