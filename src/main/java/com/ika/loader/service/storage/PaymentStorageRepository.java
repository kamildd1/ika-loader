/**
 * This package includes repository for Payments
 */
package com.ika.loader.service.storage;

import com.ika.loader.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface contains Payment Repository
 */
@Repository
public interface PaymentStorageRepository extends MongoRepository<Payment, String> {
}