package com.ikea.loader.service.validation;

import com.ikea.loader.model.Competition;
import com.ikea.loader.model.Player;
import org.springframework.ui.Model;

public interface ValidationFormService {

    String validatePlayerAndReturnPage(Player player, Model model);

    String validateCompetitionAndReturnPage(Competition competition, Model model);
}
