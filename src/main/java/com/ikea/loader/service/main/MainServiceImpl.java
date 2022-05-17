package com.ikea.loader.service.main;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Player;
import com.ikea.loader.service.rest.RestClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainServiceImpl implements MainService {

    private final RestClient restClient;
    private static final String URL_PUBLISHER_PLAYER = "http://46.41.135.59:18080/publisher-ikea/save/player";
    private static final String URL_PUBLISHER_COMPETITION = "http://46.41.135.59:18080/publisher-ikea/save/competition";

    @Override
    public void processPlayerData(Player player) {
        restClient.postRequest(URL_PUBLISHER_PLAYER, player.toJson().toString());
    }

    @Override
    public void processCompetitionData(Competition competition) {
        restClient.postRequest(URL_PUBLISHER_COMPETITION, competition.toJson().toString());
    }
}
