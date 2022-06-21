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
        Payment payment1 = new Payment(552, "TST", 100, "PLN", "20-06-2022 11:59:59");
        //when
        String payment = validationFormService.validatePaymentAndReturnPage(payment1, model, true);
        //then
        Assertions.assertFalse(payment.isEmpty());
    }

    @Test
    public void checkCompetitionValidation(){

        //given
        Model model = DataTST.model();
        Competition competition1 = new Competition(553, 22, "Junior", "Mężczyzna", "Ostatni", "Kowalski");
        //when
        String competition = validationFormService.validateCompetitionAndReturnPage(competition1, model, true);
        //then
        Assertions.assertNull(competition);
    }

    @Test
    public void checkPlayerValidation(){

        //given
        Model model = DataTST.model();
        Player player1 = new Player(533, "Kacper", "Kowalski", 20-12-2000, "Warszawa", "Pierwszy", "Mężczyzna");
        //when
        String player = validationFormService.validatePlayerAndReturnPage(player1, model, true);
        //then
        Assertions.assertFalse(player.isEmpty());
    }
}