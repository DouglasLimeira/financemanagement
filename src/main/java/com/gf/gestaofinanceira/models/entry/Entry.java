package com.gf.gestaofinanceira.models.entry;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.gf.gestaofinanceira.models.account.Account;
import com.gf.gestaofinanceira.models.transaction.Transaction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
@NoArgsConstructor 
@Table (name = "entries")
public class Entry implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false,
        columnDefinition = "TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP")
    private OffsetDateTime createdAt;

    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @JoinColumn(name = "transaction_id", nullable = false, unique = true)
    private Transaction transaction;
}
