package com.cacoalpano.apidemo.service.impl;

import com.cacoalpano.apicommon.dao.repository.GroupPermissionRepository;
import com.cacoalpano.apidemo.service.BaseService;
import com.cacoalpano.apidemo.service.GroupPermissionService;
import org.springframework.stereotype.Service;

@Service
public class GroupPermissionServiceImpl extends BaseService<GroupPermissionService,Long, GroupPermissionRepository> implements  GroupPermissionService{
}
