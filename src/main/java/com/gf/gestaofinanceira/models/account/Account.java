package com.gf.gestaofinanceira.models.account;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor  
@Table (name = "accounts")
public class Account implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull 
    private BigDecimal balance;

    @CreationTimestamp 
    @Column(name = "created_at", nullable = false, updatable = false,
        columnDefinition = "TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP")
    private OffsetDateTime createdAt;
    
}
