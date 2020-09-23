package com.cacoalpano.apidemo.service.impl;

import com.cacoalpano.apicommon.dao.entities.Permissions;
import com.cacoalpano.apicommon.dao.repository.PermissionRepository;
import com.cacoalpano.apidemo.service.BaseService;
import com.cacoalpano.apidemo.service.PermisstionService;
import org.springframework.stereotype.Service;

@Service
public class PermisstionServiceImpl extends BaseService<Permissions, Long, PermissionRepository> implements PermisstionService {
}
