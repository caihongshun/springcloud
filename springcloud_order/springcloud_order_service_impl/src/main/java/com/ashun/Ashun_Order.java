package com.ashun;

import org.mybatis.spring.annotation.MapperScan;
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
@SpringBootApplication(scanBasePackages ={"com.ashun.*"})
@EnableFeignClients("com.ashun.feign")
@MapperScan("com.ashun.myBatis.mapper")
@EnableEurekaClient
@EnableHystrix
public class Ashun_Order {

    public static void main(String[] args) {
        SpringApplication.run(Ashun_Order.class,args);
    }
}
