package com.cacoalpano.apicommon.config.database;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SqlConfig {
    private String url;
    private String userName;
    private String password;
    private String className;
    private String dbName;
}
