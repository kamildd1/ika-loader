/**
 * This package includes methods downloading data from database
 */
package com.ikea.loader.service.storage;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import com.ikea.loader.model.User;

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

    List<User> getAllDataUser();
}
