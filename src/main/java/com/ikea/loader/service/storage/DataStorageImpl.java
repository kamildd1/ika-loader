package com.ikea.loader.service.storage;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Player;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class DataStorageImpl implements DataStorage {

    private DataStorageRepository dataStorageRepository;
    private CompetitionStorageRepository competitionStorageRepository;

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
}
