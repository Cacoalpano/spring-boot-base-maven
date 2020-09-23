package com.cacoalpano.apicommon.dao.repository;

import com.cacoalpano.apicommon.dao.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}