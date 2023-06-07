/**
 * This package includes implementation for DataStorage
 */
package com.ika.loader.service.storage;

import com.ika.loader.model.Competition;
import com.ika.loader.model.Payment;
import com.ika.loader.model.Player;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

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