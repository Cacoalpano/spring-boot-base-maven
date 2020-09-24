package com.cacoalpano.apidemo;

import com.cacoalpano.apicommon.config.core.BaseConfig;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cacoalpano.*")
@EntityScan("com.cacoalpano.apicommon.dao.*")
@ComponentScan("com.cacoalpano.*")
public class ApiDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiDemoApplication.class, args);
    }

}
