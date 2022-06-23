package com.ikea.loader.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class contains the Payment model, fields identifying the Payment
 */
@Getter
@Setter
@Builder
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger idPayments;
    @OneToOne(mappedBy = "player", cascade = CascadeType.MERGE)
    public String firstName;
    public Long price;
    public String typeOfPrice;
    public LocalDateTime dateTimeActual;
    public String dateAndTime;

    /**
     * This method convert LocalDateTime to formatted string
     * @param dateAndTime Input parameter for the conversion LocalDateTime
     * @return String variable containing the current date and time in a specific format
     */
    private String getDateTime(String dateAndTime){
        dateTimeActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        dateAndTime = dateTimeActual.format(formatter);
        return dateAndTime;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", idPayments);
        json.put("firstName", firstName);
        json.put("price", price);
        json.put("typeOfPrice", typeOfPrice);
        json.put("dateAndTime", getDateTime(dateAndTime));
        return json;
    }
}