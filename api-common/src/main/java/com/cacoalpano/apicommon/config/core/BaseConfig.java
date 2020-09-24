package com.cacoalpano.apicommon.config.core;

import com.cacoalpano.apicommon.config.database.SqlConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "base")
@PropertySource( value = "classpath:common.yml", factory = YamlPropertyLoaderFactory.class)
public class BaseConfig {
    private SqlConfig sql;
    private String[] allowEndpoint;
    private String esUrl;
    private String aesKey;
    private Integer maxSession;
    private String secretKeyJwt;
    private String tokenValidate;

    public SqlConfig getSql() {
        return sql;
    }

    public void setSql(SqlConfig sql) {
        this.sql = sql;
    }

    public String[] getAllowEndpoint() {
        return allowEndpoint;
    }

    public void setAllowEndpoint(String[] allowEndpoint) {
        this.allowEndpoint = allowEndpoint;
    }

    public String getEsUrl() {
        return esUrl;
    }

    public void setEsUrl(String esUrl) {
        this.esUrl = esUrl;
    }

    public String getAesKey() {
        return aesKey;
    }

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public Integer getMaxSession() {
        return maxSession;
    }

    public void setMaxSession(Integer maxSession) {
        this.maxSession = maxSession;
    }

    public String getSecretKeyJwt() {
        return secretKeyJwt;
    }

    public void setSecretKeyJwt(String secretKeyJwt) {
        this.secretKeyJwt = secretKeyJwt;
    }

    public String getTokenValidate() {
        return tokenValidate;
    }

    public void setTokenValidate(String tokenValidate) {
        this.tokenValidate = tokenValidate;
    }
}
