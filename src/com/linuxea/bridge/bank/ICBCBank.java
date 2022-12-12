package com.linuxea.bridge.bank;

import com.linuxea.bridge.account.Account;

public class ICBCBank implements Bank{

    private final String useName;

    public ICBCBank(String useName) {
        this.useName = useName;
    }


    @Override
    public Account open(Account account) {
        return account.openAccount(useName);
    }
}
