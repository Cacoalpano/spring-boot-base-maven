package com.cacoalpano.apidemo.service;


import com.cacoalpano.apicommon.dao.entities.Group;

import java.util.Optional;

public interface GroupService {
    Optional<Group> findById(Long id);
}
