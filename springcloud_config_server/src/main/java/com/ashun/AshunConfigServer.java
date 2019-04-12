package com.ashun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: AppConfigServer
 * @description:
 * @author: caihongshun
 * @create: 2019-03-22 17:08
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class AshunConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(AshunConfigServer.class,args);
    }
}
