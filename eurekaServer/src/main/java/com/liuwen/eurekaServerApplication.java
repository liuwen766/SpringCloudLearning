package com.liuwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-02-29 22:27
 **/
@SpringBootApplication
@EnableEurekaServer
public class eurekaServerApplication {
    public static void main(String[] args){
        SpringApplication.run(eurekaServerApplication.class,args);
    }
}
