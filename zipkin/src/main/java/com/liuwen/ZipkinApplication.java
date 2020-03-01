package com.liuwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-01 17:16
 **/
@SpringBootApplication
@EnableZipkinServer            //声明启动 Zipkin Server
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class,args);
    }
}
