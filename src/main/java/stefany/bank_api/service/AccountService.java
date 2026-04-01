package stefany.bank_api.service;

import stefany.bank_api.dto.AccountDto;
import stefany.bank_api.entity.Account;

public interface AccountService {
    AccountDto creteAccount(AccountDto account);
}
