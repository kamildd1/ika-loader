/**
 * This package includes model for Payment
 */
package com.ika.loader.model;

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
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger idPayments;
    @OneToOne(mappedBy = "player", cascade = CascadeType.MERGE) //MERGE czyli scalenie(jedność), kopiuje stan danego obiektu na trwały o takim samym identyfikatorze
    public String firstName;
    public Long price;
    public String typeOfPrice;
    public LocalDateTime dateTimeActual;
    public String dateAndTime;

    /**
     * This method convert LocalDateTime to formatted string
     * @return String variable containing the current date and time in a specific format
     */
    private String getDateTime(String dateAndTime){
        this.dateAndTime = dateAndTime;
        this.dateTimeActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.dateAndTime = dateTimeActual.format(formatter);
        return this.dateAndTime;
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