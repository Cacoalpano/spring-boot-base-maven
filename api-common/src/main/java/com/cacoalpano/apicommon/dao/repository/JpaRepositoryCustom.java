package com.cacoalpano.apicommon.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface JpaRepositoryCustom<T, ID>  {

    @Query("select e from #{#entityName} e where e.delFlag= ?1 ")

    List<T> softFindAll(boolean delFlag);

    @Query("select e from #{#entityName} e where e.delFlag= false ")
    List<T> recycleBin();

    @Query("update #{#entityName} e set e.delFlag = false where  e.id = ?1")
    @Transactional(readOnly = true)
    Optional<T> deleteSoft(ID id);

    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.id = ?1 and e.delFlag = false ")
    T softFindOne(ID id, boolean delFlag);

    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.id = ?1 and e.delFlag = false ")
    Optional<T> softfindById(ID id, boolean delFlag);

}
