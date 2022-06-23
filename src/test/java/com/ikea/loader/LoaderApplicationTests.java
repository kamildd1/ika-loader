package com.ikea.loader;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import com.ikea.loader.service.storage.DataStorageImpl;
import com.ikea.loader.service.storage.PaymentStorageRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import java.util.Optional;

/**
 * Class execute the Unit Tests
 */
@RunWith(MockitoJUnitRunner.class)
public class LoaderApplicationTests {

	@Mock
	private DataStorageImpl dataStorage;

	@Mock
	private PaymentStorageRepository paymentStorageRepository;

	/**
	 * This method finding all Players from database
	 */
	@Test
	public void shouldCheckPlayers(){
		//given
		//when
		List<Player> playerList= dataStorage.getAllDataPlayer();
		//then
		Assertions.assertNotNull(playerList);
	}

	/**
	 * This method finding all Competitions from database
	 */
	@Test
	public void shouldCheckCompetitions(){
		//given
		//when
		List<Competition> competitionList = dataStorage.getAllDataCompetition();
		//then
		Assertions.assertNotNull(competitionList);
	}

	/**
	 * This method finding Player by id from database
	 */
	@Test
	public void shouldCheckPlayer(){
		//given
		//when
		Optional<Player> playerListById = Optional.ofNullable(dataStorage.getData(String.valueOf(2)));
		//then
		Assertions.assertNotNull(playerListById);
	}

	/**
	 * This method finding all Payments from database
	 */
	@Test
	public void shouldCheckPayment(){
		//given
		//when
		List<Payment> paymentList = paymentStorageRepository.findAll();
		//then
		Assertions.assertNotNull(paymentList);
	}
}