package com.ikea.loader.service.storage;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@NoArgsConstructor
public class DataStorageImpl implements DataStorage {

    private DataStorageRepository dataStorageRepository;
    private CompetitionStorageRepository competitionStorageRepository;

    private Player player;

    @Override
    public Player getData(String id) {
        Optional<Player> findData = dataStorageRepository.findById(id);
        if (findData.isEmpty()) {
            return null;
        } else {
            return findData.get();
        }
    }

    @Override
    public List<Player> getAllDataPlayer() {
        return dataStorageRepository.findAll();
    }

    @Override
    public List<Competition> getAllDataCompetition() {
        return competitionStorageRepository.findAll();
    }

    @Override
    public List<String> getFirstName(){
        return Collections.singletonList(player.firstName);
    }

    @Override
    public List<String> getLastName(){
        return Collections.singletonList(player.lastName);
    }
    @Override
    public String getClub(){
        return player.club;
    }

    @Override
    public void savePayment(Payment payment) {

    }

}
