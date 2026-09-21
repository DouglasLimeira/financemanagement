package com.gf.gestaofinanceira.models.scheduledTransaction;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduledTransactionRepository extends JpaRepository<ScheduledTransaction, UUID> {
    
}
