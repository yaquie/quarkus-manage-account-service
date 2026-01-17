package org.bank.account.api.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.bank.account.api.domain.entity.Account;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class AccountRepository implements PanacheRepository<Account> {

    public Optional<Account> findByAccount(String accountNumber) {
        return find("accountNumber", accountNumber).firstResultOptional();
    }

    public List<Account> findAccountsByCustomerDocument(String documentNumber) {
        return find("customer.documentNumber = ?1", documentNumber).list();
    }

}
