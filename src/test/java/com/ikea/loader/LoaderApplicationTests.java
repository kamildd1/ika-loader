package com.ikea.loader;


import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Player;
import com.ikea.loader.service.storage.CompetitionStorageRepository;
import com.ikea.loader.service.storage.DataStorageImpl;
import com.ikea.loader.service.storage.DataStorageRepository;
import com.ikea.loader.service.validation.ValidationFormServiceImpl;
import net.minidev.json.JSONObject;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class LoaderApplicationTests {

	@InjectMocks
	public DataStorageImpl dataStorage;

	@Mock
	private DataStorageRepository dataStorageRepository;

	@Mock
	private CompetitionStorageRepository competitionStorageRepository;

	@Mock
	private Player player;

	@InjectMocks
	public ValidationFormServiceImpl validationFormService;

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
	public void checkData(){
		//given
		//when
		Optional<Player> playerListById = Optional.ofNullable(dataStorage.getData(String.valueOf(2)));
		//then
		Assertions.assertNotNull(playerListById);
	}

//	@Test
//	public void checkValidationPlayer(){
//		//given
//		Player player = new Player("Jan", "Kowalski", 2000-05-14, "club", 6, "Mezczyzna", );
//	}
}
