package org.jy.oa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServiceOaApp {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOaApp.class,args);
    }

}
