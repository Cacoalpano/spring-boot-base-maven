package com.cacoalpano.apicommon.service;

import com.cacoalpano.apicommon.config.core.BaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract  class AbstractService<T, ID extends Serializable, R extends JpaRepository<T, ID>> {
    @Autowired
    protected BaseConfig baseConfig;
    @Resource
    protected R repository;

    public Optional<T> save(T t) {
        t = repository.save(t);
        return Optional.ofNullable(t);
    }

    public Optional<T> get(ID id) {
        return repository.findById(id);
    }

    public Optional<T> delete(ID id) {
        T t = repository.findById(id).orElse(null);
        if (t != null) {
            repository.delete(t);
        }
        return Optional.ofNullable(t);
    }

    public List<T> findAll(List<ID> ids) {
        return repository.findAllById(ids);
    }

    public List<T> save(List<T> objects) {
        return repository.saveAll(objects);
    }

    public List<T> findAll() {
        return repository.findAll();
    }
}
