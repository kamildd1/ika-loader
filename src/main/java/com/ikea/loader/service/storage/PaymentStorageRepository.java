package com.ikea.loader.service.storage;

import com.ikea.loader.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentStorageRepository extends MongoRepository<Payment, String> {
}
