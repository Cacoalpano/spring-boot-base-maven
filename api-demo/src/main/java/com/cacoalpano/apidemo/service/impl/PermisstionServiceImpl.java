package com.cacoalpano.apidemo.service.impl;

import com.cacoalpano.apicommon.dao.entities.Permissions;
import com.cacoalpano.apicommon.dao.repository.PermissionRepository;
import com.cacoalpano.apidemo.service.BaseService;
import com.cacoalpano.apidemo.service.PermisstionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PermisstionServiceImpl extends BaseService implements PermisstionService {
    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public Optional<Permissions> findById(Long id) {
        return permissionRepository.findById(id);
    }
}
