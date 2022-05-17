package com.ikea.loader;


import com.ikea.loader.model.Player;
import com.ikea.loader.service.storage.CompetitionStorageRepository;
import com.ikea.loader.service.storage.DataStorageImpl;
import com.ikea.loader.service.storage.DataStorageRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LoaderApplicationTests {

	@InjectMocks
	public DataStorageImpl dataStorage;

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
}
