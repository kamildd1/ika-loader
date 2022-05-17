package com.ikea.loader.service.storage;

import com.ikea.loader.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataStorageRepository extends MongoRepository<Player, String> {
}
