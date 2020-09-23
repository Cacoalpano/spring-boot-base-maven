package com.cacoalpano.apidemo.config.jwt;

import com.cacoalpano.apicommon.dao.entities.Account;
import com.cacoalpano.apicommon.dao.entities.Group;
import com.cacoalpano.apidemo.service.AccountService;
import com.cacoalpano.apidemo.service.GroupPermissionService;
import com.cacoalpano.apidemo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.security.Permission;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class JwtAccountDetailService implements UserDetailsService {
    @Autowired
    AccountService accountService;
    @Autowired
    GroupPermissionService groupPermissionServices;
    @Autowired
    GroupService groupService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Account account = accountService.getAccountByUserName(userName).
                orElseThrow(() -> new UsernameNotFoundException("Can not find " + userName + " in database"));
        return new JwtAccountDetails(account,getAuthority(account.getGroupId()));
    }

    private Set<GrantedAuthority> getAuthority(Long groupId) {
        Set<GrantedAuthority> grantedAuthority = new HashSet<>();
        Group group = groupService.findById(groupId).orElse(null);
        if (group != null){
            grantedAuthority.add(new SimpleGrantedAuthority(group.getCode()));// add permission vao xac thuc api
//            List<Permission> permissions = groupPermissionServices.findByGroupId(group.getId()).stream().
        }

        return grantedAuthority;
    }
}
