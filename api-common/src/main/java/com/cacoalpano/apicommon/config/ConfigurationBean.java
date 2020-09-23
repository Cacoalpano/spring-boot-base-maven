package com.cacoalpano.apicommon.config;

import com.cacoalpano.apicommon.config.core.BaseConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.cacoalpano.*"})
@PropertySources({@PropertySource("classpath:common.yml"),
        @PropertySource("classpath:application.yml")})
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

    @Bean
    public CloseableHttpClient closeableHttpClient() {
        return HttpClientBuilder.create().build();
    }

}
