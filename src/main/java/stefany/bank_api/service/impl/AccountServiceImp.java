package stefany.bank_api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stefany.bank_api.dto.AccountDto;
import stefany.bank_api.repository.AccountRepository;
import stefany.bank_api.service.AccountService;
@Service
public class AccountServiceImp implements AccountService {
    private AccountRepository accountRepository;

    
    public AccountServiceImp(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto creteAccount(AccountDto account) {
        return null;
    }
}
