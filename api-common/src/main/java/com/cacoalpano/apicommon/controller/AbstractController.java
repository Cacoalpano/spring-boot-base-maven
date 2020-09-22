package com.cacoalpano.apicommon.controller;

import com.cacoalpano.apicommon.service.AbtractLoggerService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractController {
    @Autowired
    private AbtractLoggerService logger;
}
