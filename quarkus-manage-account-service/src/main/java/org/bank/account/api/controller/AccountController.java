package org.bank.account.api.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.bank.account.api.business.AccountService;
import org.bank.account.api.domain.entity.Account;

import java.util.List;
import java.util.Optional;

@Path("/accounts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AccountController {
    @Inject
    AccountService accountService;

    @GET
    @Path("/information/{accountNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Account> getAccountDetailInformation(@PathParam("accountNumber") String accountNumber) {
        return accountService.getAccountInformation(accountNumber);
    }

    @GET
    @Path("/{documentNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account> getAccountsByDoucment(@PathParam("documentNumber") String documentNumber) {
        return accountService.getAccountsByCustomer(documentNumber);
    }
}
