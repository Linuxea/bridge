package com.linuxea.bridge.account;

public interface Account {

    /**
     * open account by username
     * @param userName user real name
     * @return {@link Account}
     */
    Account openAccount(String userName);


}
