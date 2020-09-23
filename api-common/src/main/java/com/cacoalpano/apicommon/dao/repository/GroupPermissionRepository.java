package com.cacoalpano.apicommon.dao.repository;

import com.cacoalpano.apicommon.dao.entities.GroupPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPermissionRepository extends JpaRepository<GroupPermission, Long> {
}
