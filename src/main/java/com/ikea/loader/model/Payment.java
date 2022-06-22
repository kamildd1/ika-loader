package com.ikea.loader.model;

import com.ikea.loader.service.DateTime;
import lombok.Builder;
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

@Getter
@Setter
@Builder
public class Payment {

    private DateTime dateTime;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger idPayments;
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String firstName;
    public Long price;
    public String typeOfPrice;
    public LocalDateTime dateTimeActual;
    public String dateAndTime;


    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", idPayments);
        json.put("firstName", firstName);
        json.put("price", price);
        json.put("typeOfPrice", typeOfPrice);
        json.put("dateAndTime", dateTime.getDateTime());
        return json;
    }
}