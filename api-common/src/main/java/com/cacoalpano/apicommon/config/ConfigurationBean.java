package com.cacoalpano.apicommon.config;

import com.cacoalpano.apicommon.config.core.BaseConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
public class ConfigurationBean {
    @Autowired
    BaseConfig baseConfig;

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        System.out.println("Connect to sql: " + baseConfig.getSql().getDbName());
        dataSourceBuilder.driverClassName(baseConfig.getSql().getClassName());
        dataSourceBuilder.url(baseConfig.getSql().getUrl() + baseConfig.getSql().getDbName());
        dataSourceBuilder.username(baseConfig.getSql().getUserName());
        dataSourceBuilder.password(baseConfig.getSql().getPassword());
        return dataSourceBuilder.build();
    }

    @Bean
    public InternalResourceViewResolver defaultViewResolver() {
        return new InternalResourceViewResolver();
    }

    @Bean
    public ObjectMapper createObjectMapper() {
        return new ObjectMapper();
    }




}
