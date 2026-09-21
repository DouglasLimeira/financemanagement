package com.gf.gestaofinanceira.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
@NoArgsConstructor 
@Table (name = "scheduled_transactions")
public class ScheduledTransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    
}
