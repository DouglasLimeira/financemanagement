package com.gf.gestaofinanceira.repositories;

import java.security.KeyStore.Entry;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, UUID> {
    
}
