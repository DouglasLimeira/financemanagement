package com.gf.gestaofinanceira.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public record CreateAccountInput(
    @NotNull (message = "Balance is required")
    BigDecimal balance
) {
    
}
