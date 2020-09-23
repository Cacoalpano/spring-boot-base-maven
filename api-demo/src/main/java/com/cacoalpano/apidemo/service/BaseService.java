package com.cacoalpano.apidemo.service;

import com.cacoalpano.apicommon.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T, ID, R> extends AbstractService {
    @Autowired
    protected LoggerService loggerService;
}
