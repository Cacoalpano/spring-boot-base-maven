package com.cacoalpano.apidemo.service.impl;

import com.cacoalpano.apicommon.dao.entities.Group;
import com.cacoalpano.apicommon.dao.repository.GroupRepository;
import com.cacoalpano.apidemo.service.BaseService;
import com.cacoalpano.apidemo.service.GroupService;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl extends BaseService<Group, Long, GroupRepository> implements GroupService {
}
