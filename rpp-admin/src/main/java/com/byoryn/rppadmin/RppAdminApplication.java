package com.byoryn.rppadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author panguangze
 * @data 2019/11/1
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.byoryn.rppdb.entity"})
public class RppAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(RppAdminApplication.class, args);
    }
}
