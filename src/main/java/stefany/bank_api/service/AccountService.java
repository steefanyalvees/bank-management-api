package stefany.bank_api.service;

import stefany.bank_api.dto.AccountDto;
import stefany.bank_api.entity.Account;

public interface AccountService {
    AccountDto creteAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id,double amount);
}
