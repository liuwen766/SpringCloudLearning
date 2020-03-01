package com.liuwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-01 15:55
 **/
@SpringBootApplication
@EnableFeignClients
public class feignApplication {
    public static void main(String[] args){
        SpringApplication.run(feignApplication.class,args);
    }
}
