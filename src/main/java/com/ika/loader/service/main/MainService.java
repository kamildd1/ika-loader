/**
 * This package includes methods connecting with Publisher Application
 */
package com.ika.loader.service.main;

import com.ika.loader.model.Payment;
import com.ika.loader.model.Competition;
import com.ika.loader.model.Player;

/**
 * Interface contains connects with Publisher Application
 */
public interface MainService {

    /**
     * This method sending the Player model to Publisher Application
     * @param player Model Player description a player
     */
    void processPlayerData(Player player);

    /**
     * This method sending the Competition model to Publisher Application
     * @param competition Model Competition description a competition
     */
    void processCompetitionData(Competition competition);

    /**
     *  This method sending the Payment model to Publisher Application
     * @param payment Model Payment description a payment
     */
    void processPaymentData(Payment payment);
}
