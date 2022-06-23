package com.ikea.loader.service.storage;

import com.ikea.loader.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface contains Player Repository
 */
@Repository
public interface DataStorageRepository extends MongoRepository<Player, String> {
}
