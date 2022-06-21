package com.ikea.loader.model;

import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger idPayments;
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String firstName;
    public long price;
    public String typeOfPrice;
    public LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    public String dateAndTime = dateTime.format(formatter);

    public Payment(int i, String test, int price, String typeOfPrice, String s) {
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", idPayments);
        json.put("firstName", firstName);
        json.put("price", price);
        json.put("typeOfPrice", typeOfPrice);
        json.put("dateAndTime", dateAndTime);
        return json;
    }
}