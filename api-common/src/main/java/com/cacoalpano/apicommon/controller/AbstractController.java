package com.cacoalpano.apicommon.controller;

import com.cacoalpano.apicommon.config.core.BaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public abstract class AbstractController<S> {
    @Autowired
    protected  S service;
    @Autowired
    protected BaseConfig baseConfig;
    @Autowired
    protected Environment env;
}
