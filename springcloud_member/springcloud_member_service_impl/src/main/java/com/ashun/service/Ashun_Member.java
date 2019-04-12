package com.ashun.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @className: AppMember
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 14:31
 **/
@SpringBootApplication(scanBasePackages = {"com.ashun.service"})
@EnableEurekaClient
@EnableFeignClients
public class Ashun_Member {

    public static void main(String[] args) {
        SpringApplication.run(Ashun_Member.class,args);
    }
}
