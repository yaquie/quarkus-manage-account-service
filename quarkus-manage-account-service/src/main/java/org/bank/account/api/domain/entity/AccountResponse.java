package org.bank.account.api.domain.entity;

public class AccountResponse {
    private Long idAccount;
    private String accountType;
    private String accountNumber;
    private Double balance;
    private String customername;
    private String statusAccount;
    private boolean availableBalance;

    public AccountResponse() {
    }

    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getStatusAccount() {
        return statusAccount;
    }

    public void setStatusAccount(String statusAccount) {
        this.statusAccount = statusAccount;
    }

    public boolean isAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(boolean availableBalance) {
        this.availableBalance = availableBalance;
    }
}
