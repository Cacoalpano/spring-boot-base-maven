package com.cacoalpano.apidemo.service.impl;

import com.cacoalpano.apicommon.dao.entities.Account;
import com.cacoalpano.apicommon.dao.repository.AccountRepository;
import com.cacoalpano.apidemo.service.AccountService;
import com.cacoalpano.apidemo.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("accountService")
public class AccountServiceImp extends BaseService<Account, Long, AccountRepository> implements AccountService {
    @Override
    public Optional<Account> getAccountByUserName(String userName) {
        return repository.
    }
}
