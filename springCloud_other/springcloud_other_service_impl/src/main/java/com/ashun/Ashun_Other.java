package com.ashun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @className: AppOther
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 14:31
 **/
@SpringBootApplication(scanBasePackages = {"com.ashun.service"})
@EnableEurekaClient
@EnableFeignClients
public class Ashun_Other {

    public static void main(String[] args) {
        SpringApplication.run(Ashun_Other.class,args);
    }
}
