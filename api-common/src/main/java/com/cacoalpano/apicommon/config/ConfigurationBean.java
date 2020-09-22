package com.cacoalpano.apicommon.config;

import com.cacoalpano.apicommon.config.core.BaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConfigurationBean {
    @Autowired
    BaseConfig baseConfig;

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(baseConfig.getSql().getClassName());
        dataSourceBuilder.url(baseConfig.getSql().getUrl() + baseConfig.getSql().getDbName());
        dataSourceBuilder.username(baseConfig.getSql().getUserName());
        dataSourceBuilder.password(baseConfig.getSql().getPassword());
        return dataSourceBuilder.build();
    }
}
