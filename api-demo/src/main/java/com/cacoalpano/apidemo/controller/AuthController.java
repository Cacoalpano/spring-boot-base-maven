package com.cacoalpano.apidemo.controller;

import com.cacoalpano.apicommon.controller.AbstractController;
import com.cacoalpano.apidemo.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController extends AbstractController<AccountService> {
    @GetMapping()
    public String index(){
        return "done!";
    }
}
