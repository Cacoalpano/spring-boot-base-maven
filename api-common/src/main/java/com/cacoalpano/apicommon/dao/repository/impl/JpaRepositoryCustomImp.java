package com.cacoalpano.apicommon.dao.repository.impl;

import com.cacoalpano.apicommon.dao.repository.JpaRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.List;
import java.util.Optional;

public class JpaRepositoryCustomImp<T, ID>  implements JpaRepositoryCustom<T, ID> {

    @Autowired
    @Lazy
    JpaRepositoryCustom jpaRepositoryCustom;

    @Override
    public List<T> softFindAll(boolean delFlag) {
        return null;
    }

    @Override
    public List<T> recycleBin() {
        return null;
    }

    @Override
    public Optional<T> deleteSoft(ID id) {
        return Optional.empty();
    }

    @Override
    public T softFindOne(ID id, boolean delFlag) {
        return null;
    }

    @Override
    public Optional<T> softfindById(ID id, boolean delFlag) {
        return Optional.empty();
    }
}
