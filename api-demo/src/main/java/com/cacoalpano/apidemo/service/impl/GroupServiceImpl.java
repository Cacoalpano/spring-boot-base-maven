package com.cacoalpano.apidemo.service.impl;

import com.cacoalpano.apicommon.dao.entities.Group;
import com.cacoalpano.apicommon.dao.repository.GroupRepository;
import com.cacoalpano.apidemo.service.BaseService;
import com.cacoalpano.apidemo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupServiceImpl extends BaseService implements GroupService {
    @Autowired
    GroupRepository groupRepository;
    @Override
    public Optional<Group> findById(Long id) {
        return groupRepository.findById(id);
    }
}
