/**
 * This package includes repository for Players
 */
package com.ika.loader.service.storage;

import com.ika.loader.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface contains Player Repository
 */
@Repository
public interface DataStorageRepository extends MongoRepository<Player, String> {
}
