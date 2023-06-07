/**
 * This package includes model for Player
 */
package com.ika.loader.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class contains the Player model, fields identifying the Player
 */
@Getter
@Setter
@Builder
@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger id;
    @OneToOne(mappedBy = "player", cascade = CascadeType.MERGE)
    public String firstName;
    @OneToOne(mappedBy = "player", cascade = CascadeType.MERGE)
    public String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date dateOfBirth;
    public String textDate;
    public String club;
    public String degree;
    public String sex;
    public String pattern;

    /**
     * This method convert Date to formatted string
     * @param textDate Input parameter for the conversion Date
     * @return String variable containing the birthday date and in a specific format
     */
    private String getDate(String textDate){
        this.pattern  = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        this.textDate = simpleDateFormat.format(dateOfBirth);
        return this.textDate;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("firstName", firstName);
        json.put("lastName", lastName);
        json.put("textDate", getDate(textDate));
        json.put("club", club);
        json.put("degree", degree);
        json.put("sex", sex);
        return json;
    }
}