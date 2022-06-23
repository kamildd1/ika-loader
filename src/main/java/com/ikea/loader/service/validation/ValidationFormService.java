package com.ikea.loader.service.validation;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import org.springframework.ui.Model;

/**
 * Interface contains validates the fields in forms
 */
public interface ValidationFormService {
    /**
     * This method validates the input fields in Player form
     * @param player Model Player description a player
     * @param model Object Model
     * @param isTest Boolean value
     * @return Result Player template
     */
    String validatePlayerAndReturnPage(Player player, Model model, Boolean isTest);

    /**
     * This method validates the input fields in Competition form
     * @param competition Model Competition description a competition
     * @param model Object Model
     * @param isTest Boolean value
     * @return Result Player template
     */
    String validateCompetitionAndReturnPage(Competition competition, Model model, Boolean isTest);

    /**
     * This method validates the input fields in Payment form
     * @param payment Model Payment description a payment
     * @param model Object Model
     * @param isTest Boolean value
     * @return Result Payment template
     */
    String validatePaymentAndReturnPage(Payment payment, Model model, Boolean isTest);
}
