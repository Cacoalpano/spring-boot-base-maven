package com.cacoalpano.apicommon.config.core;

import com.cacoalpano.apicommon.config.database.SqlConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "base")
@Getter
@Setter
public class BaseConfig {
    private String[] allowEndpoint;
    private SqlConfig sql;
    private String esUrl;
}
