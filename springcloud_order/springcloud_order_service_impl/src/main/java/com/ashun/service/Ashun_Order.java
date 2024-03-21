package com.ashun.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @className: AppOrder
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:21
 **/
@SpringBootApplication(scanBasePackages ={"com.ashun.service","com.ashun.fallBack","com.ashun.design",})
@EnableFeignClients("com.ashun.feign")
@EnableEurekaClient
@EnableHystrix
public class Ashun_Order {

    public static void main(String[] args) {
        SpringApplication.run(Ashun_Order.class,args);
    }
}
