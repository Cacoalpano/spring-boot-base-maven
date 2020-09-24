package com.cacoalpano.apidemo.service.impl;

import com.cacoalpano.apicommon.dao.entities.GroupPermission;
import com.cacoalpano.apicommon.dao.repository.GroupPermissionRepository;
import com.cacoalpano.apidemo.service.BaseService;
import com.cacoalpano.apidemo.service.GroupPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupPermissionServiceImpl extends BaseService implements GroupPermissionService {
    @Autowired
    GroupPermissionRepository groupPermissionRepository;

    @Override
    public Optional<GroupPermission> findById(Long id) {
        return groupPermissionRepository.findById(id);
    }

    @Override
    public List<GroupPermission> findByGroupId(Long groupId) {
        return groupPermissionRepository.findByGroupId(groupId);
    }
}
