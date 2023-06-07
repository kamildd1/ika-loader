/**
 * This package includes tests for application
 */
package com.ika.loader;

import com.ika.loader.model.Competition;
import com.ika.loader.model.Payment;
import com.ika.loader.model.Player;
import com.ika.loader.service.validation.ValidationFormService;
import com.ika.loader.service.validation.ValidationFormServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import utils.DataTST;
import java.math.BigInteger;

/**
 * Class execute the Tests, testing validation for all models in application (Payment, Competition, Player)
 */
@RunWith(SpringRunner.class)
public class LoaderTests {

    @Autowired
    private ValidationFormServiceImpl validationFormService;

    /**
     * This class contains configuration
     */
    @TestConfiguration
    static class LoaderClassConfiguration{
        /**
         * This method contains ValidationFormService
         * @return Implementation for ValidationFormService
         */
        @Bean
        public ValidationFormService validationFormService(){
            return new ValidationFormServiceImpl();
        }
    }

    /**
     * This method validating an example Payment
     */
    @Test
    public void shouldCheckPaymentValidation(){

        //given
        Model model = DataTST.model();
        Payment payment1 = Payment.builder()
                .idPayments(BigInteger.valueOf(62))
                .firstName("Test")
                .price(299L)
                .typeOfPrice("PLN")
                .dateAndTime("20-06-2022 11:59:59")
                .build();
        //when
        String payment = validationFormService.validatePaymentAndReturnPage(payment1, model, true);
        //then
        Assertions.assertNull(payment);
    }

    /**
     * This method validating an example Competition
     */
    @Test
    public void shouldCheckCompetitionValidation(){

        //given
        Model model = DataTST.model();
        Competition competition1 = Competition.builder()
                .idPayments(BigInteger.valueOf(622))
                .id(12344L)
                .category("Junior")
                .sex("Mężczyzna")
                .vintage("Pierwszy")
                .lastName("Nowak")
                .build();
        //when
        String competition = validationFormService.validateCompetitionAndReturnPage(competition1, model, true);
        //then
        Assertions.assertNull(competition);
    }

    /**
     * This method validating an example Player
     */
    @Test
    public void shouldCheckPlayerValidation(){

        //given
        Model model = DataTST.model();
        Player player1 = Player.builder()
                .id(BigInteger.valueOf(6222))
                .firstName("Jan")
                .lastName("Kowalski")
                .club("Warszawa")
                .degree("Drugi")
                .sex("Mężczyzna")
                .build();
        //when
        String player = validationFormService.validatePlayerAndReturnPage(player1, model, true);
        //then
        Assertions.assertNull(player);
    }
}