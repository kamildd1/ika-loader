/**
 * This package includes tests for application
 */
package com.ikea.loader;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import com.ikea.loader.service.storage.DataStorageImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.lenient;

/**
 * Class execute the Unit Tests, testing connection with database by returns data from database (Payment, Competition, Player)
 */
@RunWith(MockitoJUnitRunner.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class LoaderApplicationTests {

	@Mock
	private DataStorageImpl dataStorage;

	/**
	 * This method finding all Players from database
	 */
	@Test
	public void shouldCheckPlayers(){
		//given
		List<Player> playerList = new ArrayList<>();
		lenient().when(dataStorage.getAllDataPlayer()).thenReturn(playerList);
		//when
		//then
		Assertions.assertNotNull(playerList);
	}

	/**
	 * This method finding all Competitions from database
	 */
	@Test
	public void shouldCheckCompetitions(){
		//given
		List<Competition> competitionList = new ArrayList<>();
		lenient().when(dataStorage.getAllDataCompetition()).thenReturn(competitionList);
		//when
		//then
		Assertions.assertNotNull(competitionList);
	}

	/**
	 * This method finding all Payments from database
	 */
	@Test
	public void shouldCheckPayment(){
		//given
		List<Payment> paymentList = new ArrayList<>();
		lenient().when(dataStorage.getAllDataPayment()).thenReturn(paymentList);
		//when
		//then
		Assertions.assertNotNull(paymentList);
	}
}