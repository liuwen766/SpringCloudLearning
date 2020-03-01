package com.liuwen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-01 17:25
 **/
@RestController
@RequestMapping("/zipkin")
public class ZipkinClientHandler {

    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index(){
        return this.port;
    }
}
