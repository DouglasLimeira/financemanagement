package com.gf.gestaofinanceira.models.account;

import java.util.Locale;
import java.util.UUID;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.gf.gestaofinanceira.exception.ResourceNotFoundException;

@Service 
public class FindByIdAccountUseCase {
    
    private final AccountRepository accountRepository;
    private final MessageSource messageSource;

    public FindByIdAccountUseCase(AccountRepository accountRepository, MessageSource messageSource) {
        this.accountRepository = accountRepository;
        this.messageSource = messageSource;
    }

    public Account execute(UUID id) {
        return accountRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                messageSource.getMessage("account.not.found", new Object[]{id}, Locale.getDefault())));
    }
}
