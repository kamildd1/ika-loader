package com.ikea.loader.service.main;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Payment;
import com.ikea.loader.model.Player;

public interface MainService {

    void processPlayerData(Player player);

    void processCompetitionData(Competition competition);

    void processPaymentData(Payment payment);
}
