/**
 * This package includes repository for Competitions
 */
package com.ikea.loader.service.storage;

import com.ikea.loader.model.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface contains Competition Repository
 */
@Repository
public interface CompetitionStorageRepository extends MongoRepository<Competition, String> {
}
