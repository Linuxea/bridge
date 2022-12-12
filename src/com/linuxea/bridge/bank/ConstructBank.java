package com.linuxea.bridge.bank;

import com.linuxea.bridge.account.Account;

public class ConstructBank implements Bank {

    private final String userName;

    public ConstructBank(String userName) {
        this.userName = userName;
    }

    @Override
    public Account open(Account account) {
        return account.openAccount(this.userName);
    }
}
