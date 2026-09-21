package com.gf.gestaofinanceira.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gf.gestaofinanceira.entities.ScheduledTransaction;

public interface ScheduledTransactionRepository extends JpaRepository<ScheduledTransaction, UUID> {
    
}
