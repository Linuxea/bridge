package com.linuxea.bridge.account;

import com.linuxea.bridge.bank.Bank;

public class LiveAccount implements Account{


    @Override
    public Account openAccount(String userName) {
        System.out.println("开启一个活期账号");
        return this;
    }

    @Override
    public String toString() {
        return "这是一个活期类型的账号";
    }
}


