package com.ikea.loader.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public String getDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return dateTime.format(dateTimeFormatter);
    }
}