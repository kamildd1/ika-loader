package com.ikea.loader.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.format.annotation.DateTimeFormat;
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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
