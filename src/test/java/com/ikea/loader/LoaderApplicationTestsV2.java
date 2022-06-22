package com.ikea.loader;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import com.ikea.loader.service.validation.ValidationFormService;
import com.ikea.loader.service.validation.ValidationFormServiceImpl;
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

@RunWith(SpringRunner.class)
public class LoaderApplicationTestsV2 {

    @Autowired
    private ValidationFormServiceImpl validationFormService;

    @TestConfiguration
    static class LoaderClassConfiguration{
        @Bean
        public ValidationFormService validationFormService(){
            return new ValidationFormServiceImpl();
        }
    }

    @Test
    public void checkPaymentValidation(){

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

    @Test
    public void checkCompetitionValidation(){

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

    @Test
    public void checkPlayerValidation(){

        //given
        Model model = DataTST.model();
        Player player1 = Player.builder()
                .id(BigInteger.valueOf(6222))
                .firstName("Jan")
                .lastName("Kowalski")
                //.dateOfBirth(1999-10-12)
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