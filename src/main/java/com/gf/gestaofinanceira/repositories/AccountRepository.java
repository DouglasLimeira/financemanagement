package com.gf.gestaofinanceira.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gf.gestaofinanceira.entities.Account;

public interface AccountRepository extends JpaRepository<Account, UUID> {
    
}
