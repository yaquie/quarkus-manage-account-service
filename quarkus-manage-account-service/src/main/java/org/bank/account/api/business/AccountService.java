package org.bank.account.api.business;

import org.bank.account.api.domain.entity.Account;
import org.bank.account.api.domain.entity.AccountResponse;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    public Optional<Account> getAccountInformation(String accountNumber);

    public List<AccountResponse> getAccountsByCustomer(String documentNumber);
}
