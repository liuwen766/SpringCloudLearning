package com.liuwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 提供两个服务（将端口改为8011）
 * @author: Liu Wen
 * @create: 2020-02-29 22:50
 **/
@SpringBootApplication
public class eurekaClientApplication2 {
    public static void main(String[] args){
        SpringApplication.run(eurekaClientApplication2.class,args);
    }
}
