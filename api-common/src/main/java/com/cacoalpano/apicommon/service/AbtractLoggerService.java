package com.cacoalpano.apicommon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public abstract class AbtractLoggerService {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    public void info(String msg) {
        logger.info(msg);
    }

    public void error(String msg) {
        logger.error(msg);
    }
}
