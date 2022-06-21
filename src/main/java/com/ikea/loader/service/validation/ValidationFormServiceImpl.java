package com.ikea.loader.service.validation;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class ValidationFormServiceImpl implements ValidationFormService {

    @Override
    public String validatePlayerAndReturnPage(Player player, Model model, Boolean isTest) {
        boolean isValid = true;
        StringBuilder message = new StringBuilder();
        if (!isTest) {
            if (player.getFirstName().isEmpty()) {
                message.append("First Name").append(", ");
                isValid = false;
            }

            if (player.getLastName().isEmpty()) {
                message.append("Last Name").append(", ");
                isValid = false;
            }

            if (player.getClub().isEmpty()) {
                message.append("Club").append(", ");
                isValid = false;
            }

            if (player.getDegree().isEmpty()) {
                message.append("Degree").append(", ");
                isValid = false;
            }

            if (player.getPhoto() != null) {
                message.append("Photo").append(", ");
                isValid = false;
            }

            if (player.getSex().isEmpty()) {
                message.append("Sex").append(", ");
                isValid = false;
            }

            model.addAttribute("message", "must be not empty: " + message);

            if (isValid) {
                return "result";
            } else {
                return "form";
            }
        } else return null;
    }

    @Override
    public String validateCompetitionAndReturnPage(Competition competition, Model model, Boolean isTest) {
        boolean isValid = true;
        StringBuilder message = new StringBuilder();
        if (!isTest) {
            if (competition.getSex().isEmpty()) {
                message.append("Sex").append(", ");
                isValid = false;
            }

            if (competition.getLastName().isEmpty()) {
                message.append("Last Name").append(", ");
                isValid = false;
            }

            if (competition.getCategory().isEmpty()) {
                message.append("Category").append(", ");
                isValid = false;
            }

            if (competition.getVintage() == null) {
                message.append("Vintage").append(", ");
                isValid = false;
            }

            model.addAttribute("message", "must be not empty: " + message);

            if (isValid) {
                return "resultCompetition";
            } else {
                return "formCompetition";
            }
        } else return null;
    }

    @Override
    public String validatePaymentAndReturnPage(Payment payment, Model model, Boolean isTest){
        boolean isValid = true;
        StringBuilder message = new StringBuilder();
        if (!isTest) {
            if (payment.getPrice() < 0) {
                message.append("Price").append(", ");
                isValid = false;
            }
            if (payment.getTypeOfPrice().isEmpty()) {
                message.append("TypeOfPrice").append(", ");
                isValid = false;
            }

            model.addAttribute("message", "must be not empty: " + message);

            if (isValid) {
                return "resultPayment";
            } else {
                return "formPayment";
            }
        } else return null;
    }
}