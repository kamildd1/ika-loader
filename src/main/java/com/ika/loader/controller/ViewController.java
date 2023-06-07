/**
 * This package includes controller for servicing endpoints
 */
package com.ika.loader.controller;

import com.ika.loader.model.*;
import com.ika.loader.service.main.MainService;
import com.ika.loader.service.storage.DataStorage;
import com.ika.loader.service.validation.ValidationFormService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * This class contains endpoints for Loader Application
 */
@Controller
@Slf4j
@AllArgsConstructor
public class ViewController {

    private final MainService mainService;
    private final DataStorage dataStorage;
    private final ValidationFormService validationFormService;

    /**
     * Endpoint redirect to the login page
     * @param admin User
     * @return Template login
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute Admin admin) {
        return "login";
    }

    /**
     * Endpoint redirect to the formPlayer
     * @param player Model Player description a player
     * @return formPlayer
     */
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String showPlayerForm(Player player) {
        return "form";
    }

    /**
     * Endpoint redirect to the formPlayer
     * @param playerKumite Model PlayerKumite description a playerKumite
     * @return  formKumite
     */
    @RequestMapping(value = "/formKumite", method = RequestMethod.GET)
    public String showPlayerFormKumite(PlayerKumite playerKumite) {
        return "formKumite";
    }

    /**
     * Endpoint redirect to the formCompetition
     * @param competition Model Competition description a competition
     * @return formCompetition
     */
    @RequestMapping(value = "/formCompetition", method = RequestMethod.GET)
    public String showCompetitionForm(Competition competition) {
        return "formCompetition";
    }

    /**
     * Endpoint redirect to the Service Validation
     * @param player Model Player description a player
     * @return Result page
     */
    @RequestMapping(value = "/formValidate", method = RequestMethod.POST)
    public String checkPlayerForm( Player player, Model model) {
        String page = validationFormService.validatePlayerAndReturnPage(player, model, false);
        if (page.equals("result")) mainService.processPlayerData(player);
        return page;
    }

    /**
     * Endpoint redirect to the Service Validation
     * @param competition Model Competition description a competition
     * @return Result page
     */
    @RequestMapping(value = "/formValidateCompetition", method = RequestMethod.POST)
    public String checkCompetitionForm(Competition competition, Model model) {
        String page = validationFormService.validateCompetitionAndReturnPage(competition, model, false);
        if (page.equals("resultCompetition")) mainService.processCompetitionData(competition);
        return page;
    }

    /**
     * Endpoint redirect to the table with all Players
     * @param model Object Model
     * @return formData (table)
     */
    @RequestMapping(value = "/formData", method = RequestMethod.GET)
    public String showPlayerDataForm(Model model) {
        List<Player> playerList = dataStorage.getAllDataPlayer();
        model.addAttribute("playerList", playerList);
        return "formData";
    }

    /**
     * Endpoint redirect to the table with all Competitions
     * @param model Object Model
     * @return formDataCompetition (table)
     */
    @RequestMapping(value = "/formDataCompetition", method = RequestMethod.GET)
    public String showCompetitionDataForm(Model model) {
        List<Competition> competitionList = dataStorage.getAllDataCompetition();
        model.addAttribute("competitionList", competitionList);
        return "formDataCompetition";
    }

    /**
     * Endpoint redirect to the formPayment
     * @param payment Model Payment description a payment
     * @return  formPayment
     */
    @RequestMapping(value = "/formPayment", method = RequestMethod.GET)
    public String showPaymentForm(Payment payment, Model model) {
        List<Player> playerList = dataStorage.getAllDataPlayer();
        model.addAttribute("playerList", playerList);
        return "formPayment";
    }

    /**
     * Endpoint redirect to the table with all Payments
     * @param payment Model Payment description a payment
     * @param model Object Model
     * @return formDataPayment (table)
     */
    @RequestMapping(value ="/formDataPayment", method = RequestMethod.GET)
    public String showPaymentData(Payment payment, Model model){
        List<Payment> paymentList = dataStorage.getAllDataPayment();
        model.addAttribute("paymentList", paymentList);
        return "formDataPayment";
    }

    /**
     * Endpoint redirect to the Service Validation
     * @param payment Model Payment description a payment
     * @return Result page
     */
    @RequestMapping(value ="/formValidatePayment", method = RequestMethod.POST)
    public String checkPaymentForm(Payment payment, Model model){
        String page = validationFormService.validatePaymentAndReturnPage(payment, model, false);
        if (page.equals("resultPayment")) mainService.processPaymentData(payment);
        return page;
    }
}