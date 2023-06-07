/**
 * This package includes implementation for MainService
 */
package com.ika.loader.service.main;

import com.ika.loader.model.Competition;
import com.ika.loader.model.Payment;
import com.ika.loader.model.Player;
import com.ika.loader.service.rest.RestClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.ika.loader.service.main.MainServiceImpl.urlPublisher.*;

/**
 * Service connects with Publisher Application
 */
@Service
@AllArgsConstructor
public class MainServiceImpl implements MainService {

    private final RestClient restClient;

    public static class urlPublisher{
        static final String URL_PUBLISHER_PLAYER = "http://localhost:8085/save/player";
        static final String URL_PUBLISHER_COMPETITION = "http://localhost:8085/save/competition";
        static final String URL_PUBLISHER_PAYMENT = "http://localhost:8085/save/payment";
    }

    /**
     * This method sending the Player model to Publisher Application
     * @param player Model Player description a player
     */
    @Override
    public void processPlayerData(Player player) {
        restClient.postRequest(URL_PUBLISHER_PLAYER, player.toJson().toString());
    }

    /**
     * This method sending the Competition model to Publisher Application
     * @param competition Model Competition description a competition
     */
    @Override
    public void processCompetitionData(Competition competition) {
        restClient.postRequest(URL_PUBLISHER_COMPETITION, competition.toJson().toString());
    }

    /**
     *  This method sending the Payment model to Publisher Application
     * @param payment Model Payment description a payment
     */
    @Override
    public void processPaymentData(Payment payment){
        restClient.postRequest(URL_PUBLISHER_PAYMENT, payment.toJson().toString());
    }
}