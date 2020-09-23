package com.cacoalpano.apicommon.dao.repository;

import com.cacoalpano.apicommon.dao.entities.GroupPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupPermissionRepository extends JpaRepository<GroupPermission, Long> {
    List<GroupPermission> findByGroupId(Long groupId);
}
