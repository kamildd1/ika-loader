package com.ikea.loader;


import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import com.ikea.loader.service.storage.CompetitionStorageRepository;
import com.ikea.loader.service.storage.DataStorageImpl;
import com.ikea.loader.service.storage.DataStorageRepository;
import com.ikea.loader.service.storage.PaymentStorageRepository;
import com.ikea.loader.service.validation.ValidationFormServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class LoaderApplicationTests {

	@InjectMocks
	private DataStorageImpl dataStorage;

	@InjectMocks
	public ValidationFormServiceImpl validationFormService;

	@Mock
	private PaymentStorageRepository paymentStorageRepository;

	@Mock
	private DataStorageRepository dataStorageRepository;

	@Mock
	private CompetitionStorageRepository competitionStorageRepository;


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
}
