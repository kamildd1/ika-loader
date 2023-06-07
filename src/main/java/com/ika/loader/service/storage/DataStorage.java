/**
 * This package includes methods downloading data from database
 */
package com.ika.loader.service.storage;

import com.ika.loader.model.Competition;
import com.ika.loader.model.Payment;
import com.ika.loader.model.Player;
import java.util.List;

/**
 * Interface contains methods downloading data from the database
 */
public interface DataStorage {

    /**
     * This method finding the all Player Objects from database
     * @return Returns all Players
     */
    List<Player> getAllDataPlayer();

    /**
     * This method finding the all Competition Objects from database
     * @return Returns all Competitions
     */
    List<Competition> getAllDataCompetition();

    /**
     * This method finding the all Payment Objects from database
     * @return Returns all Payments
     */
    List<Payment> getAllDataPayment();

}
