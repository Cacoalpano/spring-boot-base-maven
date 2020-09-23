package com.cacoalpano.apidemo.service;

import com.cacoalpano.apicommon.dao.entities.Account;

import java.util.Optional;

public interface AccountService {
    Optional<Account> getAccountByUserName(String userName);
}
