package com.gf.gestaofinanceira.models.account;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service 
public class FindAllAccountUseCase {
    private final AccountRepository accountRepository;

    public FindAllAccountUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Page<Account> execute(int rage, int page) {
        Page<Account> accountsPage = accountRepository.findAll(PageRequest.of(page, rage));
        return accountsPage;
    }
}
