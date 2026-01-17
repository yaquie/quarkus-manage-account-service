package org.bank.account.api.business;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bank.account.api.domain.entity.Account;
import org.bank.account.api.domain.entity.AccountResponse;
import org.bank.account.api.repository.AccountRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class AccountServiceImpl implements AccountService{
    @Inject
    AccountRepository repository;

    @Override
    public Optional<Account> getAccountInformation(String accountNumber) {
        return repository.findByAccount(accountNumber);
    }

    @Override
    public List<AccountResponse> getAccountsByCustomer(String documentNumber) {
        return  repository.findAccountsByCustomerDocument(documentNumber)
                .stream()
                .map(account -> {
                    AccountResponse response = new AccountResponse();
                    response.setIdAccount(account.getIdAccount());
                    response.setAccountNumber(account.getAccountNumber());
                    response.setAccountType(account.getAccountType());
                    response.setBalance(account.getBalance());
                    response.setStatusAccount(account.getBalance() > 0 ? "Saldo Disponible" : "Sin Saldo Disponible");
                    response.setCustomername(account.getCustomer().getName());
                    return response;
                }).toList();
    }
}
