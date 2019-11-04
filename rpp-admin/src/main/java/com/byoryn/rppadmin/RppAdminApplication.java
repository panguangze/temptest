package com.byoryn.rppadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author panguangze
 * @date 2019/11/1
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.byoryn.rppdb.entity"})
@EnableJpaRepositories(basePackages = {"com.byoryn.rppdb.repository"})
@ComponentScan("com.byoryn")
public class RppAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(RppAdminApplication.class, args);
    }
}
