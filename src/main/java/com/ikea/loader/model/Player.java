package com.ikea.loader.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * This class contains the Player model, fields identifying the Player
 */
@Getter
@Setter
@Builder
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger id;
    @OneToOne(mappedBy = "player", cascade = CascadeType.MERGE)
    public String firstName;
    @OneToOne(mappedBy = "player", cascade = CascadeType.MERGE)
    public String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    public Date dateOfBirth;
    public String club;
    public String degree;
    public String sex;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("firstName", firstName);
        json.put("lastName", lastName);
        json.put("dateOfBirth", dateOfBirth);
        json.put("club", club);
        json.put("degree", degree);
        json.put("sex", sex);
        return json;
    }
}