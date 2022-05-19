package com.ikea.loader.model;

import com.ikea.loader.service.storage.DataStorage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {

    private DataStorage dataStorage;

    public int id;

    public Player player;

    public int price;

    public String getClub() {
        return player.club;
    }






}
