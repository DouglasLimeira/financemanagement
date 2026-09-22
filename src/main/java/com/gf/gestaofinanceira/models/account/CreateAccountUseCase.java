package com.gf.gestaofinanceira.models.account;

import org.springframework.stereotype.Service;

import com.gf.gestaofinanceira.dtos.CreateAccountInput;

@Service 
public class CreateAccountUseCase {
    private final AccountRepository accountRepository;

    public CreateAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account execute(CreateAccountInput inputRequest) {
        Account accountRequested = new Account();
        accountRequested.setBalance(inputRequest.balance());
        return accountRepository.save(accountRequested);
    }
}
