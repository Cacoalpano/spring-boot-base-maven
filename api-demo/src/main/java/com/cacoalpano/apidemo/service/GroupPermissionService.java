package com.cacoalpano.apidemo.service;

import com.cacoalpano.apicommon.dao.entities.GroupPermission;

import java.util.List;
import java.util.Optional;

public interface GroupPermissionService {
    Optional<GroupPermission> findById(Long id);
    List<GroupPermission> findByGroupId(Long groupId);
}
