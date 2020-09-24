package com.cacoalpano.apicommon.dao.repository;

import com.cacoalpano.apicommon.dao.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>, JpaRepositoryCustom<Account, Long> {
     Optional<Account> findByUserName(String userName);
}
