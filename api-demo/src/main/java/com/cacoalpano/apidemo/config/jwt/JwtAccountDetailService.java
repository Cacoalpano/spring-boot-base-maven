package com.cacoalpano.apidemo.config.jwt;

import com.cacoalpano.apicommon.dao.entities.Account;
import com.cacoalpano.apidemo.service.AccountService;
import com.cacoalpano.apidemo.service.GroupPermissionService;
import com.cacoalpano.apidemo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtAccountDetailService implements UserDetailsService {
    @Autowired
    AccountService accountService;
    @Autowired
    GroupPermissionService groupPermissionServices;
    @Autowired
    GroupService groupService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        
    }
}
