package com.cacoalpano.apidemo.service;

import com.cacoalpano.apicommon.dao.entities.Permissions;

import java.util.Optional;

public interface PermisstionService {
    Optional<Permissions> findById(Long id);
}
