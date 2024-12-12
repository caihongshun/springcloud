package com.ashun.service.impl;

import com.ashun.base.BaseApiService;
import com.ashun.base.ResponseBase;
import com.ashun.entity.UserEntity;
import com.ashun.feign.MemberServiceFeign;
import com.ashun.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @className: OrderServiceImpl
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:12
 **/
@RestController
public class OrderServiceImpl extends BaseApiService implements OrderService {

    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    //http://localhost:8901/api-order/orderToMember?name=wer
    @Override

    @RequestMapping("/orderToMember")
    @Transactional
    public ResponseBase orderToMember(String name) {
        UserEntity member = memberServiceFeign.getMember(name);
        System.out.println("orderToMembe线程池名称:" + Thread.currentThread().getName());

        ResponseBase res = new ResponseBase();
        res.setData(member);


        applicationEventPublisher.publishEvent(new com.ashun.event.ReceiveEvent(new HashMap<String, String>() {{
            put("10", "SASN00001");
        }}));

        return res;
    }

    // 没有解决服务雪崩效应
    @RequestMapping("/orderToMemberUserInfo")
    public ResponseBase orderToMemberUserInfo() {
        return memberServiceFeign.getUserInfo();
    }

    // 解决服务雪崩效应
    // fallbackMethod 方法的作用：服务降级执行
    // @HystrixCommand 默认开启线程池隔离方式,服务降级,服务熔断
    // 设置Hystrix服务超时时间
    /**
     * @HystrixCommand<br>
     * 					默认开启服务隔离方式 以线程池方式<br>
     *                     默认开启服务降级执行方法orderToMemberUserInfoHystrixFallback<br>
     *                     默认开启服务熔断机制<br>
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "orderToMemberUserInfoHystrixFallback")
    @RequestMapping("/orderToMemberUserInfoHystrix")
    public ResponseBase orderToMemberUserInfoHystrix() {
        System.out.println("orderToMemberUserInfoHystrix:" + "线程池名称:" + Thread.currentThread().getName());
        return memberServiceFeign.getUserInfo();
    }
    // fallback类的方式
    @RequestMapping("/orderToMemberUserInfoHystrix2")
    public ResponseBase orderToMemberUserInfoHystrix2() {
        System.out.println("orderToMemberUserInfoHystrix:" + "线程池名称:" + Thread.currentThread().getName());
        return memberServiceFeign.getUserInfo();
    }

    public ResponseBase orderToMemberUserInfoHystrixFallback() {
        return setResultSuccess("返回一个友好的提示：服务降级,服务器忙，请稍后重试!");
    }

    // 订单服务接口
    @RequestMapping("/orderInfo")
    public ResponseBase orderInfo() {
        System.out.println("orderInfo:" + "线程池名称:" + Thread.currentThread().getName());
        return setResultSuccess();
    }

    // Hystrix 有两种方式配置保护服务 通过注解和接口形式
}
