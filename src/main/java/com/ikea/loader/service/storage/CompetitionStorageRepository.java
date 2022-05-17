package com.ikea.loader.service.storage;

import com.ikea.loader.model.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompetitionStorageRepository extends MongoRepository<Competition, String> {
}
