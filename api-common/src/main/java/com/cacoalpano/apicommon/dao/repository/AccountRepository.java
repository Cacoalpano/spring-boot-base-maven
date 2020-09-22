package com.cacoalpano.apicommon.dao.repository;

import com.cacoalpano.apicommon.dao.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
