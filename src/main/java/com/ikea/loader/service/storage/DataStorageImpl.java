package com.ikea.loader.service.storage;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Service contains methods downloading data from the database
 */
@Service
@Slf4j
@AllArgsConstructor
public class DataStorageImpl implements DataStorage {

    private DataStorageRepository dataStorageRepository;
    private CompetitionStorageRepository competitionStorageRepository;
    private PaymentStorageRepository paymentStorageRepository;

    /**
     *  This method finding the Player Object by id from database
     * @param id Field representing the unique value
     * @return Returns the Player with specified id
     */
    @Override
    public Player getData(String id) {
        Optional<Player> findData = dataStorageRepository.findById(id);
        if (findData.isEmpty()) {
            return null;
        } else {
            return findData.get();
        }
    }

    /**
     * This method finding the all Player Objects from database
     * @return Returns all Players
     */
    @Override
    public List<Player> getAllDataPlayer() {
        return dataStorageRepository.findAll();
    }

    /**
     * This method finding the all Competition Objects from database
     * @return Returns all Competitions     */
    @Override
    public List<Competition> getAllDataCompetition() {
        return competitionStorageRepository.findAll();
    }

    /**
     * This method finding the all Payment Objects from database
     * @return Returns all Payments
     */
    @Override
    public List<Payment> getAllDataPayment(){
        return paymentStorageRepository.findAll();
    }
}