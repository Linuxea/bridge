package com.linuxea.bridge;

import com.linuxea.bridge.account.Account;
import com.linuxea.bridge.account.DeadLineAccount;
import com.linuxea.bridge.account.LiveAccount;
import com.linuxea.bridge.bank.Bank;
import com.linuxea.bridge.bank.ConstructBank;
import com.linuxea.bridge.bank.ICBCBank;

public class Main {

    public static void main(String[] args) {
        String userName = "linuxea";

        // icbc 银行
        // 定期账号
        Bank icbc = new ICBCBank(userName);
        Account icbcAccount = icbc.open(new DeadLineAccount());
        System.out.println(icbcAccount.toString());
        // 活期账号
        icbc = new ICBCBank(userName);
        Account icbcLive = icbc.open(new LiveAccount());
        System.out.println(icbcLive.toString());

        //建设银行
        //定期账号
        ConstructBank constructBank = new ConstructBank(userName);
        Account constructDeadAccount = constructBank.open(new DeadLineAccount());
        System.out.println(constructDeadAccount.toString());
        //活期账号
        constructBank = new ConstructBank( userName);
        Account constructLiveAccount = constructBank.open(new LiveAccount());
        System.out.println(constructLiveAccount.toString());

    }

}
