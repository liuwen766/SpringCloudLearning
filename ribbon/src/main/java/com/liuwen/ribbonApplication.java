package com.liuwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-01 15:09
 **/
@SpringBootApplication
public class ribbonApplication {
    public static void main(String[] args){
        SpringApplication.run(ribbonApplication.class,args);
    }

    @Bean
    @LoadBalanced    //声明一个基于 Ribbon 的负载均衡。
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
