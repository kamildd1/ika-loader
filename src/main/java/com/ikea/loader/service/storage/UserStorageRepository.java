package com.ikea.loader.service.storage;

import com.ikea.loader.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserStorageRepository extends MongoRepository<User, String> {
}