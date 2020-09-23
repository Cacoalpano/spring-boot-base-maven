package com.cacoalpano.apicommon.dao.repository;

import com.cacoalpano.apicommon.dao.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
     @Query("select acc from Account  acc where  acc.userName = ?1")
     Optional<Account> findByUserName(String userName);
}
