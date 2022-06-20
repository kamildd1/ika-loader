package com.ikea.loader;


import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import com.ikea.loader.service.storage.DataStorageImpl;
import com.ikea.loader.service.storage.PaymentStorageRepository;
import com.ikea.loader.service.validation.ValidationFormServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
//@ExtendWith(MockitoExtension.class)
public class LoaderApplicationTests {

	@Mock
	private DataStorageImpl dataStorage;

	@Mock
	public ValidationFormServiceImpl validationFormService;

	@Mock
	private PaymentStorageRepository paymentStorageRepository;

	@Test
	public void checkPlayers(){
		//given
		//when
		List<Player> playerList= dataStorage.getAllDataPlayer();
		//then
		Assertions.assertNotNull(playerList);
	}

	@Test
	public void checkCompetitions(){
		//given
		//when
		List<Competition> competitionList = dataStorage.getAllDataCompetition();
		//then
		Assertions.assertNotNull(competitionList);
	}

	@Test
	public void checkPlayer(){
		//given
		//when
		Optional<Player> playerListById = Optional.ofNullable(dataStorage.getData(String.valueOf(2)));
		//then
		Assertions.assertNotNull(playerListById);
	}

	@Test
	public void checkPayment(){
		//given
		//when
		List<Payment> paymentList = paymentStorageRepository.findAll();
		//then
		Assertions.assertNotNull(paymentList);
	}

	@Test
	public void checkPaymentValidation(){
		Payment payment1 = new Payment(552, "TST", 100, "PLN", "20-06-2022 11:59:59");
		//given

		//Answer<Payment> answer = invocationOnMock -> payment1;
		//Mockito.when(validationFormService.validatePaymentAndReturnPage(payment1)).then(answer);


		//when
		//Set<ConstraintViolation<Payment>> payment = validationFormService.validatePaymentAndReturnPage(payment1);
		//then
		//Assertions.assertFalse(payment.isEmpty());

	}
}
