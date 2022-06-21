package com.ikea.loader.service.validation;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import org.springframework.ui.Model;

public interface ValidationFormService {

    String validatePlayerAndReturnPage(Player player, Model model, Boolean isTest);

    String validateCompetitionAndReturnPage(Competition competition, Model model, Boolean isTest);

    String validatePaymentAndReturnPage(Payment payment, Model model, Boolean isTest);
}
