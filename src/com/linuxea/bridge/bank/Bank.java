package com.linuxea.bridge.bank;

import com.linuxea.bridge.account.Account;

/**
 * 银行接口
 */
public interface Bank {

    /**
     * 给定一个账号类型进行开户
     * @return Account
     */
    Account open(Account account);

}
