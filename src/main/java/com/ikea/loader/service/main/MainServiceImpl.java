package com.ikea.loader.service.main;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import com.ikea.loader.service.rest.RestClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainServiceImpl implements MainService {

    private final RestClient restClient;
    private static final String URL_PUBLISHER_PLAYER = "http://localhost:8085/save/player";
    private static final String URL_PUBLISHER_COMPETITION = "http://localhost:8085/save/competition";
    private static final String URL_PUBLISHER_PAYMENT = "http://localhost:8085/save/payment";

    @Override
    public void processPlayerData(Player player) {
        restClient.postRequest(URL_PUBLISHER_PLAYER, player.toJson().toString());
    }

    @Override
    public void processCompetitionData(Competition competition) {
        restClient.postRequest(URL_PUBLISHER_COMPETITION, competition.toJson().toString());
    }

    @Override
    public void processPaymentData(Payment payment){
        restClient.postRequest(URL_PUBLISHER_PAYMENT, payment.toJson().toString());
    }
}