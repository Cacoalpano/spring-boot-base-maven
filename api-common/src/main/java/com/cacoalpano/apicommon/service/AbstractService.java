package com.cacoalpano.apicommon.service;

import com.cacoalpano.apicommon.config.core.BaseConfig;
import org.springframework.beans.factory.annotation.Autowired;

public abstract  class AbstractService {
    @Autowired
    protected BaseConfig baseConfig;
}
